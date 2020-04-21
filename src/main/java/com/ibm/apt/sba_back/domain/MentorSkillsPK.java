package com.ibm.apt.sba_back.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MentorSkillsPK implements Serializable {
    private Integer userId;
    private Integer techId;

    @Column(name = "USER_ID", nullable = false)
    @Id
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "TECH_ID", nullable = false)
    @Id
    public Integer getTechId() {
        return techId;
    }

    public void setTechId(Integer techId) {
        this.techId = techId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MentorSkillsPK that = (MentorSkillsPK) o;

        if (userId != that.userId) return false;
        if (techId != that.techId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = userId;
        result = 31 * result + techId;
        return result;
    }
}
