package com.ibm.apt.sba_back.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MentorSkillsPK implements Serializable {
    private int userId;
    private int techId;

    @Column(name = "USER_ID", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "TECH_ID", nullable = false)
    @Id
    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
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
        int result = userId;
        result = 31 * result + techId;
        return result;
    }
}
