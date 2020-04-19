package com.ibm.apt.sba_back.domain;

import javax.persistence.*;

@Entity
@Table(name = "payments", schema = "sba", catalog = "sba")
public class Payments {
    private int payId;
    private int studentId;
    private int mentorId;
    private int trainId;
    private int price;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PAY_ID", nullable = false)
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "STUDENT_ID", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "MENTOR_ID", nullable = false)
    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    @Basic
    @Column(name = "TRAIN_ID", nullable = false)
    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    @Basic
    @Column(name = "PRICE", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payments payments = (Payments) o;

        if (payId != payments.payId) return false;
        if (studentId != payments.studentId) return false;
        if (mentorId != payments.mentorId) return false;
        if (trainId != payments.trainId) return false;
        if (price != payments.price) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payId;
        result = 31 * result + studentId;
        result = 31 * result + mentorId;
        result = 31 * result + trainId;
        result = 31 * result + price;
        return result;
    }
}
