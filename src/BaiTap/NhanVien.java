package BaiTap;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private double luong;

    public NhanVien(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    public double getLuong() {
        return this.luong;
    }

    public double setLuong(double luong) {
        if (luong>0){
            this.luong=luong;
        }else {
            System.out.println("Lương không hợp lệ");
        }
        return luong;
    }


    public double tinhThuThap(){
        return luong + 1000;

    }
}


