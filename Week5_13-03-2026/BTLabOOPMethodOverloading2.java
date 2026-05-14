// Viết một chương trình Java cho phép cài đặt cơ chế method overloading. Định nghĩa 
// một class NhanVien và cung cấp nhiều cách tính lương cho lớp này bằng cơ chế method 
// overloading như sau: 
// int tinhluong(int sogio): Tính lương cơ bản (không có thưởng phạt) 
// int tinhluong(int sogio, int thuong): Tính lương  và có cộng thêm thưởng. 
// int tinhluong(int sogio, int thuong, int phat): Tính lương  và có cộng thêm thưởng, đồng 
// thời trừ tiền phạt. 
// double tinhluong(int sogio, int thuong, int phat, double heso ): Tính lương  và có cộng 
// thêm thưởng, trừ tiền phạt, và có thêm hệ số chức vụ (Hệ số tính từ 5% - 100% mức 
// lương). 
 
// Hãy khởi tạo một đối tượng của lớp NhanVien, sau đó nhập các giá trị vào từ bàn phím 
// rồi gọi method tương ứng để tính lương, sau đó in ra và xem kết quả. 

import java.util.Scanner;

class NhanVien {
    int costPertime = 1000;
    public int tinhluong(int sogio) {
        return costPertime * sogio;
    }

    public int tinhluong(int sogio, int thuong) {
        return (costPertime * sogio) + thuong;
    }

    public int tinhluong(int sogio, int thuong, int phat) {
        return (costPertime * sogio) + thuong - phat;
    }

    public double tinhluong(int sogio, int thuong, int phat, double heso) {
        return (costPertime * sogio) + ((costPertime * sogio) / 100 * heso) + thuong - phat;
    }

}

public class BTLabOOPMethodOverloading2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("So gio: ");
        int sogio = input.nextInt();
        System.out.print("Thuong: ");
        int thuong = input.nextInt();
        System.out.print("Phat: ");
        int phat = input.nextInt();
        System.out.print("He so: ");
        double heso = input.nextDouble();

        NhanVien nhanVien = new NhanVien();
        System.out.print("Luong: " + nhanVien.tinhluong(sogio, thuong, phat, heso));
        input.close();
    }
}
