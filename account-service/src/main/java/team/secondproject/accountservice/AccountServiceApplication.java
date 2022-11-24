package team.secondproject.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {


	//define microservice server in application.yml -> different from other microservice
	//User-service server port: 9002
	//Account-service server port: 9003


	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
