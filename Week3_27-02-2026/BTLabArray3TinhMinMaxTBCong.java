import java.util.Scanner;

public class BTLabArray3TinhMinMaxTBCong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int number = input.nextInt();

        float tong5 = 0;
        int dem5 = 0; int dem3 = 0;
        double tichMang = 1;
        double min = Double.POSITIVE_INFINITY; //Dương vô cực
        double max = Double.NEGATIVE_INFINITY; //Âm vô cực
        float arr[] = new float[number];
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextFloat();
            if (arr[i] % 5 == 0) {
                tong5 += arr[i];
                dem5 += 1;
            }
            if (arr[i] % 3 == 0) {
                dem3 += 1;
            }
            tichMang *= arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        int demMax = -1;
        for (int i = 0; i < number; i++) {
            if (arr[i] == max) demMax += 1;
        }
        System.out.println("Phan tu lon nhat trong mang: " + max);
        System.out.println("Phan tu be nhat trong mang: " + min);
        System.out.println("Trung binh cong cua cac so chia het cho 5 la: " + (tong5 / dem5));
        System.out.println("So cac phan tu bang phan tu lon nhat: " + demMax);
        System.out.println("So cac phan tu chia het cho 3 la: " + dem3);
        System.out.println("Tich cac phan tu trong mang: " + tichMang);
        input.close();
    } 
}
