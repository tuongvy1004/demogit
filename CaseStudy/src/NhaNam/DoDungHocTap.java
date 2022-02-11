package NhaNam;

public class DoDungHocTap extends SanPham{
    private String xuatXu;
    private String thuongHieu;
    private String nhaCungCap;
    private String hdSuDung;
    private String chatLieu;
    private int kinhThuoc;
    private KhachHang khachHang;

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getHdSuDung() {
        return hdSuDung;
    }

    public void setHdSuDung(String hdSuDung) {
        this.hdSuDung = hdSuDung;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getKinhThuoc() {
        return kinhThuoc;
    }

    public void setKinhThuoc(int kinhThuoc) {
        this.kinhThuoc = kinhThuoc;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Hiển thị thông tin đồ dùng học tập");
    }

    @Override
    public void phanTramGiamGia() {
        if(khachHang.getLoaiKhachHang() == "Thuong"){
            System.out.println("Giam gia 1%");
        }
        else if(khachHang.getLoaiKhachHang() == "VIP1"){
            System.out.println("Giam gia 3%");
        }
        else
            System.out.println("Giam gia 7%");
    }
}
