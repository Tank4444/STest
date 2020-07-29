package ru.chuikov.stest.entity;

import lombok.Data;
import ru.chuikov.stest.entity.utils.IdEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
@Data
public class Question extends IdEntity {


    private String name;

    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "test_id",nullable = false)
    private Test idTest;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "question")
    private List<Answer> answer;

    public Question() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test getIdTest() {
        return idTest;
    }

    public void setIdTest(Test idTest) {
        this.idTest = idTest;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Question(String name, Test idTest, List<Answer> answer) {
        this.name = name;
        this.idTest = idTest;
        this.answer = answer;
    }
}
