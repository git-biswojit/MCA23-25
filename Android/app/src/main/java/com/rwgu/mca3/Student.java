package com.rwgu.mca3;

import java.io.Serializable;

public class Student implements Serializable {
    String name, email, phoneNo, age, gender, track, hobby;

    public Student() {
    }

    public Student(String name, String email, String phoneNo, String age, String gender, String track, String hobby) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
        this.track = track;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
