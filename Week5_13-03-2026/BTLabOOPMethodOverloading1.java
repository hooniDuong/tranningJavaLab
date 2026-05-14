//// Hãy phát triển một chương trình Java cho phép cài đặt cơ chế method overriding. Hãy
//// định nghĩa một lớp Person bao gồm một method printDetails() để in ra thông tin của
//// lớp. Lớp Person có một thuộc tính là name.
//// Sau đó, hãy định nghĩa 2 lớp con là Employee (có thêm thuộc tính salary) và Student (có
//// thêm thuộc tính address) cùng kế thừa lớp Person, đồng thời ghi đè method
//// printDetails() để in ra thông tin chi tiết của lớp tương ứng.
//// Hãy khởi tạo các đối tượng của 3 lớp nói trên, rồi gọi method printDetails() để xem kết
//// quả.
//
//import java.util.Scanner;
//
//class Person {
//    String name;
//
//    public void printDetails() {
//        System.out.println("Name: " + name);
//    }
//}
//
//class Employee extends Person {
//    double salary;
//
//    Employee(String name, double salary) {
//        super.name = name;
//        this.salary = salary;
//    }
//
//    @Override
//    public void printDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Salary: " + salary);
//    }
//}
//
//class Student extends Person {
//    String address;
//
//    Student(String name, String address) {
//        super.name = name;
//        this.address = address;
//    }
//
//    @Override
//    public void printDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Address: " + address);
//    }
//}
//public class BTLabOOPMethodOverloading1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Person person = new Person();
//        person.name = "Duong Huu Hung";
//        person.printDetails();
//
//        Employee employee = new Employee("Duong Huu Hung Emp", 999999);
//        employee.printDetails();
//
//        Student student  = new Student("Duong Huu Hung Stu", "Kim son - Gia Lam - Ha Noi");
//        student.printDetails();
//
//        input.close();
//    }
//}
