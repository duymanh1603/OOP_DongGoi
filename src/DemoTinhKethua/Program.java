package DemoTinhKethua;

public class Program {
        public static void main(String[] args) {
    NhanVien nv1 = new NhanVienFullTime("NV01", "Nguyen Van A", 5000000, 2000000);
    NhanVien nv2 = new NhanVienPartTime("NV02", "Tran Thi B", 0, 80, 50000);

    NhanVien[] ds = {nv1, nv2};

    for (NhanVien nv : ds) {
        System.out.println("Mã: " + nv.getMaNV() +
                " - Tên: " + nv.getTenNV() +
                " - Lương: " + nv.tinhLuong());
        }
    }
}
