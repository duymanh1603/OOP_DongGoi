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
