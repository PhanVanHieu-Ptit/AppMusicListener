package com.example.appnhac.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class QuangCao implements Serializable {

    @SerializedName("IdQuangCao")
    @Expose
    private String idQuangCao;
    @SerializedName("Hinhanh")
    @Expose
    private String hinhanh;
    @SerializedName("NoiDung")
    @Expose
    private String noiDung;
    @SerializedName("Idbaihat")
    @Expose
    private String idbaihat;
    @SerializedName("TenBaiHat")
    @Expose
    private String tenBaiHat;
    @SerializedName("HinhBaiHat")
    @Expose
    private String hinhBaiHat;

    public String getIdQuangCao() {
    return idQuangCao;
    }

    public void setIdQuangCao(String idQuangCao) {
    this.idQuangCao = idQuangCao;
    }

    public String getHinhanh() {
    return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
    this.hinhanh = hinhanh;
    }

    public String getNoiDung() {
    return noiDung;
    }

    public void setNoiDung(String noiDung) {
    this.noiDung = noiDung;
    }

    public String getIdbaihat() {
    return idbaihat;
    }

    public void setIdbaihat(String idbaihat) {
    this.idbaihat = idbaihat;
    }

    public String getTenBaiHat() {
    return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
    this.tenBaiHat = tenBaiHat;
    }

    public String getHinhBaiHat() {
    return hinhBaiHat;
    }

    public void setHinhBaiHat(String hinhBaiHat) {
    this.hinhBaiHat = hinhBaiHat;
    }

}