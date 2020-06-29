package com.diesgut.collectorsoapclient.bbva;

import static com.diesgut.collectorsoapclient.util.CommonsUtilities.castBBVAFieldEnum;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import com.diesgut.collectorsoapclient.bbva.enums.BBVAFieldEnum;
import com.diesgut.collectorsoapclient.bbva.enums.BBVAProcessCodeEnum;
import com.diesgut.collectorsoapclient.bbva.enums.CanalOperacionEnum;
import com.diesgut.collectorsoapclient.model.Acreencia;
import com.diesgut.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgut.collectorsoapclient.model.enums.BankEnum;
import com.diesgut.collectorsoapclient.repository.iAcreenciaDAO;
import com.diesgut.collectorsoapclient.repository.iOperationDAO;
import com.diesgut.collectorsoapclient.scotia.ScotiaServiceImp;

import pe.com.emp.Cabecera;
import pe.com.emp.ConsultarDeuda;
import pe.com.emp.DetalleConsulta;
import pe.com.emp.Operacion;
import pe.com.emp.RecaudosConsultaRq;
import pe.com.emp.TransaccionConsulta;

@Service
public class BBVAServiceImp implements iBBVAService {

	private static final Logger log = LoggerFactory.getLogger(ScotiaServiceImp.class);

	private final String FORMAT_DATE = "yyyyMMdd";
	private final String FORMAT_TIME = "HHmmss";

	@Autowired
	iAcreenciaDAO acreenciaDAO;

	@Autowired
	iOperationDAO operationDAO;

	@Override
	public void generateConsultRq() {
		LocalDateTime now = LocalDateTime.now();
		String SDATE = now.format(DateTimeFormatter.ofPattern(FORMAT_DATE));
		String STIME = now.format(DateTimeFormatter.ofPattern(FORMAT_TIME));

		BankEnum bankEnum = BankEnum.SCO;

		List<Acreencia> acreencias = acreenciaDAO.allByBankAndState(bankEnum, AcreenciaStateEnum.PROCESADO_ENVIADO,
				AcreenciaStateEnum.REGISTRADO);
		for (Acreencia acreencia : acreencias) {
			try {

				ConsultarDeuda consultarDeuda = new ConsultarDeuda();
				RecaudosConsultaRq recaudosConsultaRq = new RecaudosConsultaRq();

				Cabecera cabecera = new Cabecera();
				Operacion operacion = new Operacion();
				String operationNumber = "" + System.currentTimeMillis();
				operacion.setCodigoOperacion(BBVAProcessCodeEnum.CONSULTA_DEUDA.getCode());
				operacion.setNumeroOperacion(castBBVAFieldEnum(operationNumber, BBVAFieldEnum.OPERATION_NUMBER));
				operacion
						.setCodigoBanco(castBBVAFieldEnum(BankEnum.BBVA.getBankCode(), BBVAFieldEnum.OPERATION_NUMBER));
				operacion.setCodigoConvenio(acreencia.getCodigoTipoServicio());
				operacion.setCanalOperacion(CanalOperacionEnum.TF.name());
				operacion.setCodigoOficina("1234");
				operacion.setFechaOperacion(SDATE);
				operacion.setHoraOperacion(STIME);
				cabecera.setOperacion(operacion);
				recaudosConsultaRq.setCabecera(cabecera);

				DetalleConsulta detalle = new DetalleConsulta();
				TransaccionConsulta transaccion = new TransaccionConsulta();
				transaccion.setNumeroReferenciaDeuda(acreencia.getDatoPago());
				detalle.setTransaccion(transaccion);
				recaudosConsultaRq.setDetalle(detalle);

				consultarDeuda.setRecaudosRq(recaudosConsultaRq);

				{
					JAXBContext contextObj = JAXBContext.newInstance(ConsultarDeuda.class);
					Marshaller marshallerObj = contextObj.createMarshaller();
					marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

					StringWriter sw = new StringWriter();
					marshallerObj.marshal(consultarDeuda, sw);
					System.out.println(sw.toString());
				}
				{
					JAXBContext contextObj = JAXBContext.newInstance(ConsultarDeuda.class);
					Marshaller marshallerObj = contextObj.createMarshaller();
					marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

					StringWriter sw = new StringWriter();
					QName qName = new QName("http://mfxV2_0", "ConsultarDeuda", "emp");

					JAXBElement root = new JAXBElement(qName, ConsultarDeuda.class, consultarDeuda);
					marshallerObj.marshal(root, sw);
					System.out.println(sw.toString());
				}
				{
					JAXBContext contextObj = JAXBContext.newInstance(ConsultarDeuda.class);
					Marshaller marshallerObj = contextObj.createMarshaller();
					marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

					Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				//	document.normalize();
					QName qName = new QName("emp","www.google.com","emp");
					JAXBElement root = new JAXBElement(qName, ConsultarDeuda.class, consultarDeuda);
					marshallerObj.marshal(consultarDeuda, document);

		
					MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
					SOAPMessage soapMessage = messageFactory.createMessage();
					SOAPPart soapPart = soapMessage.getSOAPPart();
					// SOAP Envelope
					SOAPEnvelope envelope = soapPart.getEnvelope();
					envelope.removeNamespaceDeclaration( envelope.getPrefix() );
					envelope.setPrefix("soapenv");
					envelope.addNamespaceDeclaration("emp", "http://www.emp.com.pe/");

					// SOAP Header
					SOAPHeader soapHeader = soapMessage.getSOAPHeader();
					soapHeader.setPrefix("soapenv");

					// SOAP Body
					SOAPBody soapBody = soapMessage.getSOAPBody();
					soapBody.setPrefix("soapenv");
					soapBody.addDocument(document);
					soapMessage.saveChanges();

//					System.out.println("Request SOAP Message = ");
//					soapMessage.writeTo(System.out);
//					System.out.println();
					ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
					soapMessage.writeTo(outputStream);
					String output = new String(outputStream.toByteArray());
				//	System.out.println(output);

					Transformer transformer = TransformerFactory.newInstance().newTransformer();
					transformer.setOutputProperty(OutputKeys.INDENT, "yes");
					transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
					//initialize StreamResult with File object to save to file
					StreamResult result = new StreamResult(new StringWriter());
					//DOMSource source = new DOMSource(doc);
					 Source xmlInput = new StreamSource(new StringReader(output));
					transformer.transform(xmlInput, result);
					String xmlString = result.getWriter().toString();
					System.out.println(xmlString);
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}

}
