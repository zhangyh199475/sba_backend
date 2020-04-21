package com.ibm.apt.sba_back.domain;

import javax.persistence.*;

@Entity
@Table(name = "payments", schema = "sba", catalog = "sba")
public class Payments {
    private Integer payId;
    private Integer studentId;
    private Integer mentorId;
    private Integer trainId;
    private int price;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PAY_ID", nullable = false)
    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "STUDENT_ID", nullable = false)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "MENTOR_ID", nullable = false)
    public Integer getMentorId() {
        return mentorId;
    }

    public void setMentorId(Integer mentorId) {
        this.mentorId = mentorId;
    }

    @Basic
    @Column(name = "TRAIN_ID", nullable = false)
    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
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
        Integer result = payId;
        result = 31 * result + studentId;
        result = 31 * result + mentorId;
        result = 31 * result + trainId;
        result = 31 * result + price;
        return result;
    }
}
