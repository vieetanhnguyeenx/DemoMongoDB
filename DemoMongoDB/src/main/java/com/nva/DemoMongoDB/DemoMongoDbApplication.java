package com.nva.DemoMongoDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class DemoMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			Student student = Student.builder()
					.firstName("Doi1")
					.lastName("Den1")
					.email("12345@gmail.com")
					.gender(Gender.MALE)
					.address(
							Address.builder()
									.city("Ha Noi")
									.country("VN")
									.postCode("100000")
									.build()
					)
					.favouriteSubject(List.of("PRN111", "MAE", "PMG"))
					.build();



			repository.save(student);
		};
	}
}
