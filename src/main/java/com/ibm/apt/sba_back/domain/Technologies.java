package com.ibm.apt.sba_back.domain;

import javax.persistence.*;

@Entity
@Table(name = "technologies", schema = "sba", catalog = "sba")
public class Technologies {
    private Integer techId;
    private String techName;
    private String type;
    private int active;
    private int price;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "TECH_ID", nullable = false)
    public Integer getTechId() {
        return techId;
    }

    public void setTechId(Integer techId) {
        this.techId = techId;
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
    @Column(name = "TYPE", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "ACTIVE", nullable = false)
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
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

        Technologies that = (Technologies) o;

        if (techId != that.techId) return false;
        if (active != that.active) return false;
        if (price != that.price) return false;
        if (techName != null ? !techName.equals(that.techName) : that.techName != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = techId;
        result = 31 * result + (techName != null ? techName.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + active;
        result = 31 * result + price;
        return result;
    }
}
