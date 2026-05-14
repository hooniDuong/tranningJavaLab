import java.util.Scanner;
public class BTLabArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int number = input.nextInt();

        int a[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = input.nextInt();
        }

        System.out.print("Mang theo thu tu nguoc la: ");
        for (int i = number - 1; i >= 0; i--) {
            System.out.print(a[i] + "  ");
        }
        int trungGian = 0;
        for (int i = 0; i < number - 1; i++) {
            for (int j = i; j < number; j++) {
                if (a[i] < a[j]) {
                    trungGian = a[i];
                    a[i] = a[j];
                    a[j] = trungGian;
                }
            }
        }
        System.out.print("\nMang sap xep theo thu tu giam dan: ");
        for (int i = 0; i < number; i++) {
            System.out.print(a[i] + "  ");
        }
        input.close();
    }
}
