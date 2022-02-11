package NhaNam;

public class DoChoiTreEm extends SanPham {
    private String xuatXu;
    private String thuongHieu;
    private String nhaCungCap;
    private String hdSuDung;
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

    @Override
    public void hienThiThongTin() {
        System.out.println("Hiển thị đồ chơi trẻ em");
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
            System.out.println("Giam gia 7%");
    }
}
