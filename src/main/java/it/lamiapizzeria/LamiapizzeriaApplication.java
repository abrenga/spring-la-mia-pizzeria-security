package it.lamiapizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@SpringBootApplication
public class LamiapizzeriaApplication {

	public static void main(String[] args) {
		String pass = new StandardPasswordEncoder().encode("password-test");
		System.out.println(pass);

		SpringApplication.run(LamiapizzeriaApplication.class, args);
	}

}
