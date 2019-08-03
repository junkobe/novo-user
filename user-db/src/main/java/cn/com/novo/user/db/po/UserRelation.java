package cn.com.novo.user.db.po;

import java.io.Serializable;

public class UserRelation implements Serializable {
    private String userid;

    private String followid;

    private String followdate;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFollowid() {
        return followid;
    }

    public void setFollowid(String followid) {
        this.followid = followid == null ? null : followid.trim();
    }

    public String getFollowdate() {
        return followdate;
    }

    public void setFollowdate(String followdate) {
        this.followdate = followdate == null ? null : followdate.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", followid=").append(followid);
        sb.append(", followdate=").append(followdate);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append("]");
        return sb.toString();
    }
}