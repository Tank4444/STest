package ru.chuikov.stest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.chuikov.stest.entity.Role;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.repository.UserRepository;

import javax.annotation.PostConstruct;


@SpringBootApplication
        public class App {
    public App(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    private void addAdmin(){
        userRepository.saveAndFlush(new User("admin",passwordEncoder.encode("admin"), Role.ADMIN));
    }
}
