package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollNo;
    private String sName;
    private int age;

    public int getRollNo() {
        return rollNo;
    }

    public String getsName() {
        return sName;
    }

    public int getsAge(){
        return age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setsAge(int sAge) {
        this.age = age;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                '}';
    }
}
