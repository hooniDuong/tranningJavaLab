//// Hãy phát triển một ứng dụng Java cho phép cài đặt Interface. Hãy định nghĩa một
//// Interface Calculator cung cấp khai báo 4 method add(), minus(), multiple(), devide() để
//// thực hiện 4 phép toán cơ bản.
//
//// Tiếp theo, hãy định nghĩa một lớp MyCalculator có cài đặt interface nói trên. Lớp
//// MyCalculator sẽ cài đặt 4 method đã được khai báo trong interface.
//
//// Hãy khởi tạo đối tượng của lớp MyCalculator rồi gọi các method để thực hiện tính toán
//// và in ra kết quả.
//
//interface Calculator {
//    double add(double a, double b);
//    double minus(double a, double b);
//    double multiple(double a, double b);
//    double devide(double a, double b);
//}
//
//class MyCalculator implements Calculator {
//
//    public double add(double a, double b) {
//        return a + b;
//    }
//
//    public double minus(double a, double b) {
//        return a - b;
//    }
//
//
//    public double multiple(double a, double b) {
//        return a * b;
//    }
//
//    public double devide(double a, double b) {
//        if (b == 0) {
//            System.out.println("Không thể chia cho 0");
//            return 0;
//        }
//        return (double) a / b;
//    }
//}
//public class BTLabOOPInterface {
//    public static void main(String[] args) {
//        Calculator calc = new MyCalculator();
//
//        // MyCalculator myCalc = new MyCalculator();
//
//        System.out.println("Add: " + calc.add(5, 3));
//        System.out.println("Minus: " + calc.minus(5, 3));
//        System.out.println("Multiple: " + calc.multiple(5, 3));
//        System.out.println("Devide: " + calc.devide(5, 3));
//    }
//}
