package ru.chuikov.stest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.chuikov.stest.entity.Role;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.repository.UserRepository;
import ru.chuikov.stest.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Optional<User> getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user=getUser(s);
        if(!user.isPresent()) throw new UsernameNotFoundException(s);
        return new org.springframework.security.core.userdetails.User(
                user.get().getUsername(),
                user.get().getPassword(),
                new HashSet<GrantedAuthority>(
                        Collections.singleton(
                                new SimpleGrantedAuthority(
                                        user.get().getRole().name()
                                )
                        )
                )
        );
    }


    @Override
    public void add(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        entity.setRole(Role.USER);
        userRepository.saveAndFlush(entity);
    }

    @Override
    public void delete(User entity) {
    }

    @Override
    public Optional<User> get(Long entity) {
        return Optional.empty();
    }

    @Override
    public Optional<User> edit(User entity) {
        return Optional.empty();
    }
}
