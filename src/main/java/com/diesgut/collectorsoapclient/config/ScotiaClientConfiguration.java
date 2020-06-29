package com.diesgut.collectorsoapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.diesgut.collectorsoapclient.ScotiaClient;

@Configuration
@Primary
public class ScotiaClientConfiguration {
	
	 @Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("com.creo.ws.scotia");
	    return marshaller;
	  }

	  @Bean
	  public ScotiaClient countryClient(Jaxb2Marshaller marshaller) {
		  ScotiaClient client = new ScotiaClient();
	    client.setDefaultUri("http://scotia.ws.creo.com");
//	    client.setDefaultUri("http://localhost:8080/iBusinessIntegration/ScotiaRecaudacionSoap");
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }

}
