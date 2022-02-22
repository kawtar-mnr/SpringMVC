package org.sid.springmvc;

import java.util.Date;

import org.sid.springmvc.dao.PatientRepository;
import org.sid.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		patientRepository.save(new Patient(null,"kawatar",new Date(),false,12));
		patientRepository.save(new Patient(null,"nada",new Date(),false,15));
		patientRepository.save(new Patient(null,"lee suhu",new Date(),false,22));
		
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

}
