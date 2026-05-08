import java.util.Scanner;




public class BTJavaBasicsLab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Viết chương trình Java cho phép nhập vào 3 số thực, sau đó tính tổng của 3 số này. 
        // System.out.print("Nhap vao mot so thuc: ");
        // double soThuc1 = input.nextDouble();

        // System.out.print("Nhap vao mot so thuc: ");
        // double soThuc2 = input.nextDouble();

        // System.out.print("Nhap vao mot so thuc: ");
        // double soThuc3 = input.nextDouble();

        // System.out.println("Tong cua cac so thuc vua nhap: " + (soThuc1 + soThuc2 + soThuc3));

// Viết chương trình Java cho phép nhập vào  2 số nguyên, sau đó thực hiện các phép cộng, 
// trừ, nhân, chia, rồi in ra kết quả của các phép tính này. 
        // System.out.print("Nhap vao mot so nguyen: "); 
        // int soNguyen1 = input.nextInt();

        // System.out.print("Nhap vao mot so nguyen: ");
        // int soNguyen2 = input.nextInt();

        // System.out.println("Phep cong: " + (soNguyen1 + soNguyen2));
        // System.out.println("Phep tru: " + (soNguyen1 - soNguyen2));
        // System.out.println("Phep nhan: " + (soNguyen1 * soNguyen2));
        // System.out.println("Phep chia lay nguyen: " + (soNguyen1 / soNguyen2));

// Viết chương trình Java cho phép nhập vào một ký tự, sau đó kiểm tra xem ký tự này có 
// phải là chữ cái ‘a’ hay không, in ra kết quả. 
        System.out.print("Nhap vao mot ki tu bat ki tu ban phim: ");
        char kiTu = input.next().charAt(0);

        if (kiTu == 'a') System.out.println("YES");
        else System.out.println("NO");

        input.close();
    }
}
