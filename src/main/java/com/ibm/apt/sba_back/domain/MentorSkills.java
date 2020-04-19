package com.ibm.apt.sba_back.domain;

import javax.persistence.*;

@Entity
@Table(name = "mentor_skills", schema = "sba", catalog = "sba")
@IdClass(MentorSkillsPK.class)
public class MentorSkills {
    private int userId;
    private int techId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "TECH_ID", nullable = false)
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

        MentorSkills that = (MentorSkills) o;

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
