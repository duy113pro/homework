package com.homework.homeworkjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "BaiViet")
public class BaiViet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tieude;
    private String noidung;
    private int id_tacgia;
    private Date ngayviet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getId_tacgia() {
        return id_tacgia;
    }

    public void setId_tacgia(int id_tacgia) {
        this.id_tacgia = id_tacgia;
    }

    public Date getNgayviet() {
        return ngayviet;
    }

    public void setNgayviet(Date ngayviet) {
        this.ngayviet = ngayviet;
    }
}
