package BaiTap;

public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("001", "Phùng Duy Mạnh", 10000);
        System.out.println("Thu nhập: " + nv.tinhThuThap());
        nv.setLuong(6000);
        System.out.println("Thu Nhập mới: " + nv.tinhThuThap());

    }
}
