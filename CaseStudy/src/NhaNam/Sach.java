package NhaNam;

import java.util.Date;

public class Sach extends SanPham {
    private String nhaXuatBan;
    private int namXuatBan;
    private String tacGia;
    private Date ngayXuatBan;
    private int lanTaiBan;
    private KhachHang khachHang;

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Hien thi thong tin sach");
    }

    @Override
    public void phanTramGiamGia() {
        if(khachHang.getLoaiKhachHang() == "Thuong"){
            System.out.println("Giam gia 2%");
        }
        else if(khachHang.getLoaiKhachHang() == "VIP1"){
            System.out.println("Giam gia 5%");
        }
        else
            System.out.println("Giam gia 10%");
    }
}
