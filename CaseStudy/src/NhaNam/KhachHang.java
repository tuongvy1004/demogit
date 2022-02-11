package NhaNam;

import java.util.Date;

public class KhachHang {
    private int maKhachHang;
    private String hoTen;
    private int soDienThoai;
    private String Email;
    private Date ngaySinh;
    private String loaiKhachHang;
    private HoaDon hoaDon;

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        //this.loaiKhachHang = loaiKhachHang;
        if (hoaDon.getTongTien() <= 10000000) {
            this.loaiKhachHang = "Thuong";
        } else if (hoaDon.getTongTien() > 10000000 && hoaDon.getTongTien() <= 20000000) {
            this.loaiKhachHang = "VIP1";
        } else
            this.loaiKhachHang = "VIP2";
    }
}
