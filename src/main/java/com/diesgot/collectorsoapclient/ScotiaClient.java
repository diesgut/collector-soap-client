package com.diesgot.collectorsoapclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.creo.ws.scotia.EjecutarTransaccionScotiabank;
import com.creo.ws.scotia.EjecutarTransaccionScotiabankResponse;



public class ScotiaClient extends WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(ScotiaClient.class);

	  public EjecutarTransaccionScotiabankResponse getCountry() {
		  log.debug("get country");
		  EjecutarTransaccionScotiabank request = new EjecutarTransaccionScotiabank();
		  request.setInput("0200F220848188E08000000000000000001816000000000000000035500000000000000009120939018183960912000901006    1006                0056    000000000000000SOLUCIONES PARA EMPRESAS                6040023013802000000     041        002     0000847 011111122              000                                                   01000000          ");

		    log.info("Requesting location for " );

//		    EjecutarTransaccionScotiabankResponse response = (EjecutarTransaccionScotiabankResponse) getWebServiceTemplate()
//		        .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
//		            new SoapActionCallback(
//		                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
		    EjecutarTransaccionScotiabankResponse response = (EjecutarTransaccionScotiabankResponse) getWebServiceTemplate()
			        .marshalSendAndReceive("http://localhost:8080/iBusinessIntegration/ScotiaRecaudacionSoap", request);
		    log.debug("response {}",response.getEjecutarTransaccionScotiabankReturn());
		    System.out.println("response");	
		    System.out.println(response.getEjecutarTransaccionScotiabankReturn());
		    return response;
		
		  }
	
}
