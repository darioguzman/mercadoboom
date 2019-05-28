package ar.commerce.mercadoboom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MercadoboomApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadoboomApplication.class, args);
	}

}
