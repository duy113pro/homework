package com.homework.homeworkjpa.entity;


import jakarta.persistence.*;

@Entity(name = "TacGia")
public class TacGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tentacgia")
    private String tentacgia;

    @Column(name = "hoten")
    private String hoten;

    @Column(name = "gioitinh")
    private String gioitinh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getHoten(String kimochi) {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}

