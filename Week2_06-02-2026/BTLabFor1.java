import java.util.Scanner;
public class BTLabFor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dem3 = 0; 
        int tong3 = 0;

        for (int i = 201; i <= 600; i += 3) {
            dem3 += 1;
            tong3 += i;    
        }
        System.out.println("Tong cua cac so tu 200 - 600 chia het cho 3 la: " + tong3);
        System.out.println("Trung binh cong cua cac so tu 200 - 600 chia het cho 3 la: " + tong3 / dem3);

        System.out.print("Cac so le ben tu 50 den 100 chia het cho 7 la: ");
        for (int i = 57; i <= 100; i += 2) {
            if (i % 7 == 0) {
                System.out.print(i + "  ");
            }
        }

        input.close();
    }
}
