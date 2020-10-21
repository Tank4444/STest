package ru.chuikov.stest.entity;

import lombok.Data;
import ru.chuikov.stest.entity.utils.IdEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "testing")
@Data
public class Testing extends IdEntity {
    public Testing() {
    }
    @ManyToOne(optional = false,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "test_id",nullable = false)
    private Test idTest;



    public Test getIdTest() {
        return idTest;
    }

    public void setIdTest(Test idTest) {
        this.idTest = idTest;
    }



    public Testing(Test idTest) {
        this.idTest = idTest;
    }
}
