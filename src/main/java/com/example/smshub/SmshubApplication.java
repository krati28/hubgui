package com.example.smshub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.smshub.dao.UserDao;
import com.example.smshub.model.User;

@SpringBootApplication
public class SmshubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmshubApplication.class, args);
	}
//
//	 @Bean
//   public CommandLineRunner init(UserDao userDao){
//       return args -> {
//           User user1 = new User();
//           user1.setClustername("Devglan");
//           user1.setClustertype("Devglan");
//                    userDao.save(user1);
////
//           User user2 = new User();
//           user2.setClustername("John");
//           user2.setClustertype("Doe");
//           userDao.save(user2);
//       };
//   }

}
