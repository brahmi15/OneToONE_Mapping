package com.map.mapping;

import com.map.mapping.Entities.Laptop;
import com.map.mapping.Entities.StuRepository;
import com.map.mapping.Entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	@Autowired
	private StuRepository stuRepository;

	private static final Logger logger = LoggerFactory.getLogger(MappingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

	@Override
	public void run(String... args) {

		/*
OneToOne Mapping
		Student student = new Student();
		student.setStudentName("Brahmi Joshi");
		student.setAddress("Noida");
		student.setStudentId(12);

		Laptop laptop = new Laptop();
		laptop.setModelNumber("16-s0095AX");
		laptop.setBrand("HP Victus");
		laptop.setLaptopId(243817);

		// Set bidirectional relationship
		laptop.setStudent(student);
		student.setLaptop(laptop);

		// Save student (and cascade save laptop if configured)
		Student savedStudent = stuRepository.save(student);
		logger.info("Saved student name: {}", savedStudent.getStudentName());
*/

        Student student = stuRepository.findById(12).get();
		logger.info("Name is {}", student.getStudentName());

		Laptop laptop = student.getLaptop();
		logger.info("Laptop {} {}", laptop.getLaptopId(),laptop.getBrand());
	}
}