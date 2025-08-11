package com.data;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.showData();
        p1.showBasicInfo();


        // set thông tin
        p1.fullName="Ngọc";
        p1.address="HCM";

        p1.showBasicInfo();




        //gọi hàm basic Info2
        int result = p1.showBasicInfo2();
        System.out.println("Result: " + result);

    }
}
