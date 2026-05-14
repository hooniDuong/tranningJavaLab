import java.util.Scanner;

public class BTLabArray4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int number = input.nextInt();

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int dem2 = 0; int demMax = -1;
        int tong2 = 0; int tong7 = 0; int tong = 0;
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("arr [" + i + "]= ");
            arr[i] = input.nextInt();
            if (arr[i] % 2 == 0) {
                dem2 += 1;
                tong2 += arr[i];
            }
            if (arr[i] % 7 == 0) {
                tong7 += arr[i];
            }

            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];

            tong += arr[i];
        }
        for (int i = 0; i < number; i++) {
            if (arr[i] == max) demMax += 1;
        }
        System.out.println("So luong phan tu la so chan la: " + dem2);
        System.out.println("Tong cac so chan la: " + tong2);
        System.out.println("Phan tu co gia tri lon nhat: " + max);
        System.out.println("Phan tu co gia tri nho nhat: " + min);
        System.out.print("Mang theo thu tu dao nguoc: ");
        for (int i = number - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nTong cac phan tu chia het cho 7: " + tong7);
        System.out.println("Trung binh cong cac phan tu trong mang: " + (tong / number));
        System.out.println("So cac phan tu bang Max la: " + demMax);

        input.close();
    }
}
