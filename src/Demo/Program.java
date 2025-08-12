package Demo;

import Demo.info.Student;

public class Program {
    public static void main(String[] args) {
        Student student = new Student();
        student.fullName = "NGọc";
        // program khác package Student
        // protected email không gọi được
        // student.email = "ngọc@gmail.com";


    }
}
