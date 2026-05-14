// Viết một chương trình Java cho phép định nghĩa lớp. Tạo ra một lớp Calculator thể hiện máy tính điện 
// tử. Định nghĩa 4 method add(), minus(), devide(), multiple() cho phép thể hiện 4 phép tính cơ bản. 
// Tiếp theo hãy khởi tạo một đối tượng của lớp, rồi gọi 4 method của lớp để xem kết quả. Chú ý: Hai số 
// được nhập vào từ bàn phím. 
import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double devide(double a, double b) {
        if (b == 0) {
            System.out.println( "Khong the chia cho 0");
            return 0;
        } else {
            return a / b;
        } 
    }

    public double multiple(double a, double b) {
        return a * b;
    }
}

public class BTLabJavaOOP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Nhap vao so thu nhat: ");
        double numOne = input.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        double numTwo = input.nextDouble();

        System.out.println("Cong: " + calculator.add(numOne, numTwo));
        System.out.println("Tru: " + calculator.minus(numOne, numTwo));
        System.out.println("Nhan: " + calculator.multiple(numOne, numTwo));
        System.out.println("Chia: " + calculator.devide(numOne, numTwo));

        input.close(); 
    }
}
