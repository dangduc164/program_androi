package com.example.listviewnangcao;

public class MonAn {
    private String ten;
    private String mota;
    private String gia;
    private int hinhanh;

    public MonAn(String ten, String mota, String gia, int hinhanh) {
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
