import java.util.Scanner;
// Hãy phát triển chương trình Java cho phép cài đặt tính thừa kế. Định nghĩa một lớp 
// Vehicle thể hiện các phương tiện, trong lớp này gồm 2 thuộc tính là: price, color và một 
// method accelerate(). Tiếp theo, hãy định nghĩa 3 lớp con lần lượt là Bike, Car và Bus kế 
// thừa lớp Vehicle. Mỗi lớp này hãy định nghĩa method printDetails() để hiển thị thông tin 
// chi tiết của đối tượng. 
 
// Trong hàm main(), hãy khởi tạo 3 đối tượng thuộc 3 lớp con và hiển thị thông tin chi tiết 
// của từng đối tượng này. 
class Vehicle {
    double price;
    String color;

    void accelerate() {
        System.out.println("accelerate() in Vehicle...");
    }
}

class Bike extends Vehicle {
    public void printDetails() {
        System.out.println("Bike printDetails: ");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}


class Car extends Vehicle {
    public void printDetails() {
        System.out.println("Car printDetails: ");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}

class Bus extends Vehicle {
    public void printDetails() {
        System.out.println("Bus printDetails: ");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}
public class BTLabOOPInherirance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bike bike = new Bike();
        bike.color  = "red";
        bike.price = 200000;
        bike.printDetails();

        Car car = new Car();
        car.color  = "red";
        car.price = 200000;
        car.printDetails();

        Bus bus = new Bus();
        bus.color  = "red";
        bus.price = 200000;
        bus.printDetails();
        
        input.close();
    }
}
