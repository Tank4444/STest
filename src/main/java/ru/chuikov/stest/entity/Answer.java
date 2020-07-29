package ru.chuikov.stest.entity;

import lombok.Data;
import ru.chuikov.stest.entity.utils.IdEntity;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@Data
public class Answer extends IdEntity {
    public Answer() {
    }

    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "question_id",nullable = false)
    private Question question;

    private String name;

    private boolean correct;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Answer(Question question, String name, boolean correct) {
        this.question = question;
        this.name = name;
        this.correct = correct;
    }

    public Answer(Question question, String name) {
        this.question = question;
        this.name = name;
    }


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
