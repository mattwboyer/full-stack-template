package mboyer.template.backend.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("mboyer.template.backend.model")
@EnableJpaRepositories("mboyer.template.backend.dao")
@ComponentScan(basePackages = "mboyer.template.backend")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
