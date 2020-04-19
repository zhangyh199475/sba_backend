package com.ibm.apt.sba_back.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MentorCalendarPK implements Serializable {
    private int tranId;
    private int userId;

    @Column(name = "TRAN_ID", nullable = false)
    @Id
    public int getTranId() {
        return tranId;
    }

    public void setTranId(int tranId) {
        this.tranId = tranId;
    }

    @Column(name = "USER_ID", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
        int result = tranId;
        result = 31 * result + userId;
        return result;
    }
}
