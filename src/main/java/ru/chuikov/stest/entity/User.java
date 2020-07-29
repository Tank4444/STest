package ru.chuikov.stest.entity;

import lombok.Data;
import ru.chuikov.stest.entity.utils.IdEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
@Table(name = "user")
@Data
public class User extends IdEntity {

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Test> tests;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
