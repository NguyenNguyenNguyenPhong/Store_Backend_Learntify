package MAIN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "MAIN") // Thay thế "MAIN" bằng package chứa các component của bạn, bao gồm cả "MAIN.config"
@EnableJpaRepositories(basePackages = {"MAIN.repository", "MAIN.dao"}) // Thay thế "MAIN.repository" và "MAIN.dao" bằng package chứa các repository và dao của bạn
@EntityScan(basePackages = "MAIN.entity") // Thay thế "MAIN.entity" bằng package chứa các entity của bạn
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
