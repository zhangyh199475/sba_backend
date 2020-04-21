package com.ibm.apt.sba_back.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MentorCalendarPK implements Serializable {
    private Integer tranId;
    private Integer userId;

    @Column(name = "TRAN_ID", nullable = false)
    @Id
    public Integer getTranId() {
        return tranId;
    }

    public void setTranId(Integer tranId) {
        this.tranId = tranId;
    }

    @Column(name = "USER_ID", nullable = false)
    @Id
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MentorCalendarPK that = (MentorCalendarPK) o;

        if (tranId != that.tranId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = tranId;
        result = 31 * result + userId;
        return result;
    }
}
