package com.yx.model;

import java.util.List;

public class User {

    private Long id;
    private Long hid;
    private String userName;
    private String portrait;
    private String hometown;
    private String atplace;
    private String email;
    private String call;
    private String gender;
    private String signature;
    private String birthday;
    private String password;

    private Hobby userToHobby;
    private Long userToHobby__resolvedKey;

    private List<School> userToschool;
    private List<VirtualUser> userToVuser;
    private List<FilePermission> userToFilePermission;


    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, Long hid, String userName, String portrait, String hometown, String atplace, String email, String call, String gender, String signature, String birthday, String password) {
        this.id = id;
        this.hid = hid;
        this.userName = userName;
        this.portrait = portrait;
        this.hometown = hometown;
        this.atplace = atplace;
        this.email = email;
        this.call = call;
        this.gender = gender;
        this.signature = signature;
        this.birthday = birthday;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    /** Not-null value. */
    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAtplace() {
        return atplace;
    }

    public void setAtplace(String atplace) {
        this.atplace = atplace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setUserToHobby(Hobby userToHobby) {
        synchronized (this) {
            this.userToHobby = userToHobby;
            hid = userToHobby == null ? null : userToHobby.getId();
            userToHobby__resolvedKey = hid;
        }
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetUserToschool() {
        userToschool = null;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetUserToFilePermission() {
        userToFilePermission = null;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", hid=" + hid + ", userName=" + userName + ", portrait=" + portrait + ", hometown="
				+ hometown + ", atplace=" + atplace + ", email=" + email + ", call=" + call + ", gender=" + gender
				+ ", signature=" + signature + ", birthday=" + birthday + ", password=" + password + ", userToHobby="
				+ userToHobby + ", userToHobby__resolvedKey=" + userToHobby__resolvedKey + ", userToschool="
				+ userToschool + ", userToVuser=" + userToVuser + ", userToFilePermission=" + userToFilePermission
				+ "]";
	}
    
    

}
