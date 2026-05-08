//Bài 1: Nhập 3 số thực rồi tính tổng và tbc

import java.util.Scanner;

public class BTJavaBasicsLab1 {
    //Bài 1: Nhập 3 số thực rồi tính tổng và tbc
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Nhap so thuc thu nhat: ");
    //     double soThuc1 = input.nextDouble();

    //     System.out.print("Nhap so thuc thu hai: ");
    //     double soThuc2 = input.nextDouble();

    //     System.out.print("Nhap so thuc thu ba: ");
    //     double soThuc3 = input.nextDouble();

    //     double tongSothuc = soThuc1 + soThuc2 + soThuc3;
    //     System.out.print("Tong cua ba so Thuc la: " + tongSothuc);
    //     System.out.println("\nTrung binh cong cua ba so Thuc la: " + tongSothuc / 3);
    //     input.close();
    // }
    

    //Bài 2: Viết một Chương trình Java  cho phép tính bình phương và lập phương của một số 
    //được nhập vào từ bàn phím. 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so tu nhien: ");
        double number = input.nextDouble();

        double binhPhuong = number * number;
        double lapPhuong = binhPhuong * number;

        System.out.println("Binh phuong cua " + number + " la: " + binhPhuong);
        System.out.println("Lap phuong cua " + number + " la: " + lapPhuong);

        input.close();
    }
}