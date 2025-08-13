package Demo_Tinh_Truu_Tuong;
// class trừu tương = class + abstract
public  abstract class Animal {
    // method trừu tượng = method + abstract
    // trừu tượng tạo ra 1 hàm trống các subclass con cần viết code cho hàm trống này
    public abstract void showInfo();

    public void showInfo2(){
        System.out.println("Info2");
    }
}
//// class abstract là j
// lớp trừu tượng, định nghĩa lớp con, nhưng không thể tạo đối tượng trực tiếp
//có chứa phương thức trừu tượng abtracct method( không có thân hàm, bắt lớp phải override
//        )
//
//// phương thức abstract khác phương thức thường như thế nào
//phương thức abtract không có thân hàm => bắt buộc override cho lớp con
//được khai bao trong abtract classs
//xác định hành vi chung để lớp con tự cài đặt
//
//lớp thường cung cấp hành vi sẵn có
//
//// class abstract khác class thường như thế nào
//class abstract không thể tạo đối tượng trực tiếp , class abstract làm khuân mẫu , bắt lớp con phải cài đặt hành vi
//thường là lớp cha
