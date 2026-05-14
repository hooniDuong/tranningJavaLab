// Hãy phát triển một chương trình Java OOP có sử dụng những đặc điểm của 
// lập trình hướng đối tượng trong Java. Hãy định nghĩa một lớp cha abstract 
// có tên là Animal, trong lớp này sẽ cung cấp 2 method abstract là eat() và 
// go(), và một thuộc tính là name (protected). 
 
// Tiếp theo, hãy định nghĩa 3 lớp con kế thừa từ lớp Animal với những yêu 
// cầu như sau: 
// - Lớp Bird: Khai báo thêm thuộc tinh weight và cài đặt 2 phương thức được 
// kế thừa từ lớp cha. 
// - Lớp Person: Khai báo thêm 2 thuộc tính age và address, cài đặt 2 phương 
// thức được kế thừa từ lớp cha, đồng thời cung cấp 2 phương thức được 
// overload là work() và work(int hour). Trong các phương thức work() này sẽ 
// in ra thông tin về việc làm của Person. 
// - Lớp Lion: Khai báo thêm thuộc tính gender và cài đặt các phương thức 
// được kế thừa từ lớp cha. 
 
// Các lớp con đều định nghĩa constructor. 
// Trong main() method, hãy khởi tạo các đối tượng của lớp con, gọi các 
// method rồi xem kết quả. 

abstract class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    } 
    abstract void eat();

    abstract void go();

    abstract void display();
}

class Bird extends Animal {
    float weight;
    Bird(String name, float weight) {
        super(name);
        this.weight = weight;
    }
    public void eat() {
        System.out.println("Bird eat");
    }

    public void go() {
        System.out.println("Bird go");
    }

    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Weight: " + weight);
    }
}

class Person extends Animal {
    int Age;
    String address;
    Person(String name, int Age, String address) {
        super(name);
        this.Age = Age;
        this.address = address;
    }
    public void eat() {
        System.err.println("Person eat");
    }

    public void go() {
        System.out.println("Person go");
    }

    public void work() {
        System.out.println("Person work");
    }
    
    public void work(int x) {
        System.out.println("Person work in " + x + " hours");
    }

    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + address);
    }
}

class Lion extends Animal {
    String gender;
    Lion(String name, String gender) {
        super(name);
        this.gender = gender;
    }
    public void eat() {
        System.err.println("Lion eat");
    }

    public void go() {
        System.out.println("Lion go");
    }

    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Gender: " + gender);
    }
}
public class BTLabJavaOOPTonghop1 {
    public static void main(String[] args) {
        Bird bird = new Bird("Vanh", 10);
        bird.eat();
        bird.go();
        bird.display();


        Person person = new Person("Duong Huu Hung", 18, "Kim Son - Gia Lam - Ha Noi");
        person.display();   
        person.eat();
        person.go();
        person.work();
        person.work(10);

        Lion lion = new Lion("Pull", "Female");
        lion.eat();
        lion.go();
        lion.display();

    }
}
