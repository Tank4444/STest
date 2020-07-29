package ru.chuikov.stest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test")
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idTest")
    private List<Question> questionAnswers;

    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Testing> getTestings() {
        return testings;
    }

    public void setTestings(List<Testing> testings) {
        this.testings = testings;
    }

    public Test(String name, List<Question> questionAnswers, User user, List<Testing> testings) {
        this.name = name;
        this.questionAnswers = questionAnswers;
        this.user = user;
        this.testings = testings;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idTest")
    private List<Testing> testings;

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(List<Question> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }
}
