package com.ft.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by poseture on 2017/2/5.
 */
public class TMember implements Serializable {

    private Integer memberId;

    private String memberName;

    private Date birthday;

    private String remark;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TMember{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", birthday=" + birthday +
                ", remark='" + remark + '\'' +
                '}';
    }
}
