package com.data;

public class Person {
    public String fullName;
    public String address;
    public String phone;
    public int money;
    // contructor: không tham số
    // public className(){
    //}

    // contructor: có tham số
    // public className(String fullName){
    //}
    public Person() {
        System.out.println("Contructor no param");
    }

    public Person(String fullName, String address, String phone, int money) {
        System.out.println("Contructor 2 param");
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.money =money;
    }

    public void showData (){
        System.out.println("Person info: Người Hà Nội");
    }
    public void showBasicInfo(){
        System.out.println("fullName:" + fullName);
        System.out.println("Adderss:" + address);
    }
    public int showBasicInfo2(){
        System.out.println("in thông tin basic info 2");
        return 15;
    }
    public String showBasicInfo3() {
        System.out.println("in thông tin basic info 3");
        return "15";
    }




}
