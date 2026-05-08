import java.util.Scanner;

public class BTJavaBasicsLab2 {
//     Bài 1: Viết một chương trình Java  cho phép nhập vào một số nguyên, sau đó kiểm tra và 
//     in ra màn hình xem số đó là số chẵn hay lẻ. 
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Nhap vao mot so nguyen: ");
    //     int number = input.nextInt();

    //     if (number % 2 == 0) {
    //         System.out.println("So do la so chan!");
    //     } else {
    //         System.out.println("So do la so le!");
    //     }

    //     input.close();
    // }

//     Bài 2: Viết một chương trình Java cho phép nhập vào 3 số thực float, sau đó tìm và in ra 
//     số lớn nhất trong 3 số đó. 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so Thuc 1: ");
        float soThuc1 = input.nextFloat();

        System.out.print("Nhap vao so Thuc 2: ");
        float soThuc2 = input.nextFloat();

        System.out.print("Nhap vao so Thuc 3: ");
        float soThuc3 = input.nextFloat();

        if (soThuc1 > soThuc2) {
            if (soThuc1 > soThuc3) {
                System.out.println("So lon nhat trong ba so la so Thuc 1: " + soThuc1);
            } else {
                System.out.println("So lon nhat trong ba so la so Thuc 3: " + soThuc3);
            };
        } else {
            if (soThuc2 > soThuc3) {
                System.out.println("So lon nhat trong ba so la so Thuc 2: " + soThuc2);
            } else {
                System.out.println("So lon nhat trong ba so la so Thuc 3: " + soThuc3);
            };
        };
        input.close();
    }
}
