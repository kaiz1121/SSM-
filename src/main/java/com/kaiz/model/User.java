package com.kaiz.model;

import java.util.Date;

public class User extends UserKey {
    private String userpassword;

    private String userbirthday;

    private String usersex;

    private String userhead;

    private String userrole;

    private String activecode;

    private Integer userstate;

    private Date userregtime;

    private Integer userpoint;

    private Integer usersectioner;

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(String userbirthday) {
        this.userbirthday = userbirthday == null ? null : userbirthday.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead == null ? null : userhead.trim();
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole == null ? null : userrole.trim();
    }

    public String getActivecode() {
        return activecode;
    }

    public void setActivecode(String activecode) {
        this.activecode = activecode == null ? null : activecode.trim();
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public Date getUserregtime() {
        return userregtime;
    }

    public void setUserregtime(Date userregtime) {
        this.userregtime = userregtime;
    }

    public Integer getUserpoint() {
        return userpoint;
    }

    public void setUserpoint(Integer userpoint) {
        this.userpoint = userpoint;
    }

    public Integer getUsersectioner() {
        return usersectioner;
    }

    public void setUsersectioner(Integer usersectioner) {
        this.usersectioner = usersectioner;
    }
}