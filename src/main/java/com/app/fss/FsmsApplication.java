package com.app.fss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.fss.repository.DriverRepository;

@SpringBootApplication
public class FsmsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FsmsApplication.class, args);
	}

	@Autowired
	private DriverRepository driverRepository;
	
//	//this parts add new drivers
	@Override
public void run(String... args) throws Exception{
//		Driver driver1 = new Driver("Kazeem","Fadipe");
//		driverRepository.save(driver1);
//		
//		Driver driver2 = new Driver("Ifeoluwa","Darasimi");
//		driverRepository.save(driver2);

	
}
}
