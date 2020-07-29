package ru.chuikov.stest.entity;

import lombok.Data;
import ru.chuikov.stest.entity.utils.IdEntity;

import javax.persistence.*;

@Entity
@Table(name = "testing")
@Data
public class Testing extends IdEntity {
    public Testing() {
    }
    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "test_id",nullable = false)
    private Test idTest;

    private String testAnswert;


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
