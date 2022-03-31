package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootPostgresqlHibernateCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlHibernateCrudExampleApplication.class, args);
	}

}
