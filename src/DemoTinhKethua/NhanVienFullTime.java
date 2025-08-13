package DemoTinhKethua;

public class NhanVienFullTime  extends NhanVien {
    private double tienThuong;

    public NhanVienFullTime(String maNV, String tenNV, double luongCoBan, double tienThuong) {
        super(maNV, tenNV, luongCoBan);
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + tienThuong;
    }
}
