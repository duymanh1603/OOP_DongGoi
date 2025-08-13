package DemoTinhKethua;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private double luongCoBan;

    public NhanVien(String maNV, String tenNV, double luongCoBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }
}
