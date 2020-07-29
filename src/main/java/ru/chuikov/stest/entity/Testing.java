package ru.chuikov.stest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "testing")
@Data
public class Testing {
    public Testing() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "test_id",nullable = false)
    private Test idTest;

    private String testAnswert;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Test getIdTest() {
        return idTest;
    }

    public void setIdTest(Test idTest) {
        this.idTest = idTest;
    }

    public String getTestAnswert() {
        return testAnswert;
    }

    public void setTestAnswert(String testAnswert) {
        this.testAnswert = testAnswert;
    }

    public Testing(Test idTest, String testAnswert) {
        this.idTest = idTest;
        this.testAnswert = testAnswert;
    }
}
