package com.akash.videocall;

import com.akash.videocall.user.User;
import com.akash.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("akash")
					.email("akash@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("aniket")
					.email("aniket@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("alok")
					.email("alok@mail.com")
					.password("aaa")
					.build());
		};
	}
}

