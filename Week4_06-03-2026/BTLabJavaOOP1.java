import java.util.Scanner;

class Person {
    Scanner input = new Scanner(System.in);
    private String name;
    private String address;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
 
    public void inputDetails() {
        System.out.print("Nhap vao ten: ");
        String name = input.nextLine();
        setName(name);

        System.out.print("Nhap vao dia chi: ");
        String address = input.nextLine();
        setAddress(address);

        System.out.print("Nhap vao tuoi: " );
        int age = input.nextInt();
        setAge(age);
    }

    public void displayDetails() {
        System.out.println("Ten cua person: " + this.name);
        System.out.println("Dia chi cua person: " + this.address);
        System.out.println("Tuoi cua person: " + age);
    }
}


class BTLabJavaOOP1 {
// Viết một chương trình Java cho phép định nghĩa lớp. Tạo ra một lớp có tên là Person, 
// bao gồm 3 thuộc tính là name, address và age. Định nghĩa 2 method của lớp này có tên 
// là inputDetails() và displayDetails() để cho phép nhập các giá trị cho các thuộc tính, và 
// hiển thị giá trị của các thuộc tính của lớp. 
 
// Tiếp theo, hãy khai báo 2 đối tượng của lớp, rồi gọi các method của 2 đối tượng này để 
// xem kết quả.     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person personOne = new Person();
        Person personTwo = new Person();

        personOne.inputDetails();
        personOne.displayDetails();

        personTwo.inputDetails();
        personTwo.displayDetails();
        input.close();
    }
}