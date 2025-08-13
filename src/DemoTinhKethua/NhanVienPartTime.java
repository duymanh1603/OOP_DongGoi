package DemoTinhKethua;

public class NhanVienPartTime  extends NhanVien {
    private int soGioLam;
    private double tienCongMoiGio;

    public NhanVienPartTime(String maNV, String tenNV, double luongCoBan, int soGioLam, double tienCongMoiGio) {
        super(maNV, tenNV, luongCoBan); // luongCoBan ở đây có thể để 0
        this.soGioLam = soGioLam;
        this.tienCongMoiGio = tienCongMoiGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * tienCongMoiGio;
    }
}