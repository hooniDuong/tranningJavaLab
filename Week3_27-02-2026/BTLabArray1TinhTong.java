import java.util.Scanner;

public class BTLabArray1TinhTong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu co trong mang: ");
        int n = input.nextInt();
        int tong = 0;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + " : ");
            array[i] = input.nextInt();
            tong += array[i];
        }
        System.out.println("Tong cua day vua nhap: " + tong);
        input.close();
    }   
}
