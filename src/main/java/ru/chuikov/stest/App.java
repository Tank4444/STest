package ru.chuikov.stest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.chuikov.stest.entity.Role;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;


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
        List<User> users=userRepository.findByRole(Role.ADMIN);
        if(users.isEmpty()) userRepository.saveAndFlush(new User("admin",passwordEncoder.encode("admin"), Role.ADMIN));
    }
}
