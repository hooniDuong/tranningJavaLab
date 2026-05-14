// Viết một chương trình Java để minh họa về các bổ từ truy cập. Hãy tạo một class Employee, trong đó có 
// khai báo các thuộc tính sau: id (private), name (default), address (public), balance (protected). Sau đó 
// trong main() method, hãy khởi tạo một đối tượng của lớp, rồi thử truy cập đến các thuộc tính của lớp, 
// để xem kết quả. 
 
// Tiếp theo, hãy định nghĩa một method display() trong class Employee, method này cho phép hiển thị 
// thông tin chi tiết của lớp. Hãy gọi method này trong main() method. 

import java.util.Scanner;

class Employee {
    private int id;
    String name;
    public String address;
    protected double balance;

    Employee(int id, String name, String address, double balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

public class BTLabJavaAccessSpecifiers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee(1, "Duong Huu Hung", "Gia Lam - Ha Noi", 2005);
        employee.display();
        input.close();
    }
}
