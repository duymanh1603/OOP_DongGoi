package Demo_Tinh_Truu_Tuong;

public class Program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showInfo();

        Cat cat = new Cat();
        cat.showInfo();

        Animal animal = new Dog();
        animal.showInfo();
        animal.showInfo();
        animal.showInfo();
        animal.showInfo();
        Animal animal1 = new Cat();
        animal1.showInfo();
        animal1.showInfo();
        animal1.showInfo();
    }
}
