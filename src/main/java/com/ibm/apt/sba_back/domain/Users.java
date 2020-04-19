package com.ibm.apt.sba_back.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "users", schema = "sba", catalog = "sba")
public class Users {
    private int userId;
    private String userName;
    private String password;
    private int roleId;
    private int active;
    private String email;
    private Date createDate;
    private Date workTimingStart;
    private Date workTimingEnd;
    private String linkedinUrl;
    private String mentorProfile;
    private Integer expYear;

    @Id
    @Column(name = "USER_ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ROLE_ID", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
    @Column(name = "EMAIL", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "WORK_TIMING_START", nullable = true)
    public Date getWorkTimingStart() {
        return workTimingStart;
    }

    public void setWorkTimingStart(Date workTimingStart) {
        this.workTimingStart = workTimingStart;
    }

    @Basic
    @Column(name = "WORK_TIMING_END", nullable = true)
    public Date getWorkTimingEnd() {
        return workTimingEnd;
    }

    public void setWorkTimingEnd(Date workTimingEnd) {
        this.workTimingEnd = workTimingEnd;
    }

    @Basic
    @Column(name = "LINKEDIN_URL", nullable = true, length = 45)
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @Basic
    @Column(name = "MENTOR_PROFILE", nullable = true, length = 45)
    public String getMentorProfile() {
        return mentorProfile;
    }

    public void setMentorProfile(String mentorProfile) {
        this.mentorProfile = mentorProfile;
    }

    @Basic
    @Column(name = "EXP_YEAR", nullable = true)
    public Integer getExpYear() {
        return expYear;
    }

    public void setExpYear(Integer expYear) {
        this.expYear = expYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId) return false;
        if (roleId != users.roleId) return false;
        if (active != users.active) return false;
        if (userName != null ? !userName.equals(users.userName) : users.userName != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (createDate != null ? !createDate.equals(users.createDate) : users.createDate != null) return false;
        if (workTimingStart != null ? !workTimingStart.equals(users.workTimingStart) : users.workTimingStart != null)
            return false;
        if (workTimingEnd != null ? !workTimingEnd.equals(users.workTimingEnd) : users.workTimingEnd != null)
            return false;
        if (linkedinUrl != null ? !linkedinUrl.equals(users.linkedinUrl) : users.linkedinUrl != null) return false;
        if (mentorProfile != null ? !mentorProfile.equals(users.mentorProfile) : users.mentorProfile != null)
            return false;
        if (expYear != null ? !expYear.equals(users.expYear) : users.expYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + roleId;
        result = 31 * result + active;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (workTimingStart != null ? workTimingStart.hashCode() : 0);
        result = 31 * result + (workTimingEnd != null ? workTimingEnd.hashCode() : 0);
        result = 31 * result + (linkedinUrl != null ? linkedinUrl.hashCode() : 0);
        result = 31 * result + (mentorProfile != null ? mentorProfile.hashCode() : 0);
        result = 31 * result + (expYear != null ? expYear.hashCode() : 0);
        return result;
    }
}
