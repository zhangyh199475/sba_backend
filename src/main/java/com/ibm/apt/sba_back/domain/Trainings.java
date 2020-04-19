package com.ibm.apt.sba_back.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "trainings", schema = "sba", catalog = "sba")
public class Trainings {
    private int trainId;
    private String techName;
    private Date startDate;
    private Date endDate;
    private String studentName;
    private String mentorName;
    private int received;
    private String active;
    private Integer price;
    private Integer currentPrice;
    private Integer currentPercent;
    private Integer rate;

    @Id
    @Column(name = "TRAIN_ID", nullable = false)
    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    @Basic
    @Column(name = "TECH_NAME", nullable = false, length = 45)
    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    @Basic
    @Column(name = "START_DATE", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "STUDENT_NAME", nullable = false, length = 45)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "MENTOR_NAME", nullable = false, length = 45)
    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    @Basic
    @Column(name = "RECEIVED", nullable = false)
    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    @Basic
    @Column(name = "ACTIVE", nullable = false, length = 10)
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Basic
    @Column(name = "PRICE", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "CURRENT_PRICE", nullable = true)
    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Basic
    @Column(name = "CURRENT_PERCENT", nullable = true)
    public Integer getCurrentPercent() {
        return currentPercent;
    }

    public void setCurrentPercent(Integer currentPercent) {
        this.currentPercent = currentPercent;
    }

    @Basic
    @Column(name = "RATE", nullable = true)
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainings trainings = (Trainings) o;

        if (trainId != trainings.trainId) return false;
        if (received != trainings.received) return false;
        if (techName != null ? !techName.equals(trainings.techName) : trainings.techName != null) return false;
        if (startDate != null ? !startDate.equals(trainings.startDate) : trainings.startDate != null) return false;
        if (endDate != null ? !endDate.equals(trainings.endDate) : trainings.endDate != null) return false;
        if (studentName != null ? !studentName.equals(trainings.studentName) : trainings.studentName != null)
            return false;
        if (mentorName != null ? !mentorName.equals(trainings.mentorName) : trainings.mentorName != null) return false;
        if (active != null ? !active.equals(trainings.active) : trainings.active != null) return false;
        if (price != null ? !price.equals(trainings.price) : trainings.price != null) return false;
        if (currentPrice != null ? !currentPrice.equals(trainings.currentPrice) : trainings.currentPrice != null)
            return false;
        if (currentPercent != null ? !currentPercent.equals(trainings.currentPercent) : trainings.currentPercent != null)
            return false;
        if (rate != null ? !rate.equals(trainings.rate) : trainings.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trainId;
        result = 31 * result + (techName != null ? techName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (mentorName != null ? mentorName.hashCode() : 0);
        result = 31 * result + received;
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (currentPrice != null ? currentPrice.hashCode() : 0);
        result = 31 * result + (currentPercent != null ? currentPercent.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
