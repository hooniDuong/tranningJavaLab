// Viết một chương trình Java cho phép cài đặt tính kế thừa. Tạo ra một lớp cha abstract là Animal có một 
// abstract method là eat(), tiếp theo tạo 3 lớp con lần lượt là Lion, Cat và Dog cài đặt phương thức trừu 
// tượng nói trên. Mỗi lớp con sẽ cung cấp 2 constructor (có tham số và không có tham số).  
 
// Trong lớp Lion, hãy tạo ra 2 method run() để cài đặt method overloading. 
// Trong lớp Cat, hãy khai báo một biến static là maxAge, rồi truy cập đến biến này. 
// Lớp Dog hãy khai báo là final, rồi thử kế thừa lớp này.  Trong method main(), hãy khởi tạo các đối tượng của 3 lớp con, rồi gọi các method tương ứng. 
 
// Chú ý: Sinh viên cố gắng thiết kế giao diện để  gọi các method. 
 
abstract class Animal {
    String name;
    Animal() {
        this.name = "Unknow";
    }

    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
}

class Lion extends Animal {
    Lion() {super();};
    Lion(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("eat() in Lion");
    }

    public void run() {
        System.out.println("run() in Lion");
    }

    public void run(int x) {
        System.out.println("run " + x + " in Lion");
    }
}

class Cat extends Animal {
    Cat() {super();}
    Cat(String name) {super(name);}

    public void eat() {
        System.out.println("eat() in Cat");
    }

    public static final int maxAge = 10;
    public void showMaxage() {
        System.out.println("Max age of Cat: " + maxAge);
    }
}

final class Dog extends Animal {
    Dog() {super();}
    Dog(String name) {super(name);}
    public void eat() {
        System.out.println("eat() in Dog");
    }
}

// class Husky extends Dog {

// }

public class BTLabJavaOOPAbstractInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();  
        lion.eat();      
        lion.run();
        lion.run(5);
        
        Lion lionName = new Lion("Hoon");
        lionName.run();
        lionName.run(4);

        Cat cat = new Cat();
        cat.showMaxage();

        Dog dog = new Dog("Husky");
        dog.eat();
    }
}
