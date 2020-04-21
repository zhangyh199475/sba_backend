package com.ibm.apt.sba_back.domain;

import javax.persistence.*;

@Entity
@Table(name = "mentor_skills", schema = "sba", catalog = "sba")
@IdClass(MentorSkillsPK.class)
public class MentorSkills {
    private Integer userId;
    private Integer techId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "TECH_ID", nullable = false)
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

        MentorSkills that = (MentorSkills) o;

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
