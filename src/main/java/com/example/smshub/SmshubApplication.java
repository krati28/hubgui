package com.example.smshub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.smshub.dao.LcrDao;
import com.example.smshub.dao.UserDao;
import com.example.smshub.model.Lcr;
import com.example.smshub.model.User;

@SpringBootApplication
public class SmshubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmshubApplication.class, args);
	}
//
//	 @Bean
//   public CommandLineRunner init(LcrDao lcrdao){
//       return args -> {
//           Lcr user1 = new Lcr();
//           user1.setLcr_name("Devglan");
//           user1.setLcr_type("Devglan");
//                    lcrdao.save(user1);
////
//           Lcr user2 = new Lcr();
//           user2.setLcr_name("John");
//           user2.setLcr_type("Doe");
//           lcrdao.save(user2);
//       };
// }

}
