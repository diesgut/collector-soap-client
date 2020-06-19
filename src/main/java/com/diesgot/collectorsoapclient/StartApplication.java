package com.diesgot.collectorsoapclient;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diesgot.collectorsoapclient.scotia.ScotiaServiceImp;
import com.diesgot.collectorsoapclient.scotia.iScotiaService;

@SpringBootApplication
public class StartApplication implements CommandLineRunner{
	
	public final static String FOLDER_SCOTIA_RQ= System.getProperty("user.home")+"/CDS_SCOTIA_RQ/";

	@Autowired
	ScotiaClient scotiaClient;
	
	@Autowired
	iScotiaService scotiaService;
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		boolean success = new File(FOLDER_SCOTIA_RQ).mkdirs();
//		System.out.println("hola");
//		ScotiaClient aaa=new ScotiaClient();
//		scotiaClient.getCountry();
		scotiaService.generatePaymentsRq();
		scotiaService.anulacionPagoDeudaRq();
		scotiaService.extornoAutPagoRq();
		scotiaService.extornoAutAnulacionRq();
	}

}
