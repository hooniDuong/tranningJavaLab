import java.util.Scanner;
public class BTLabJavaWhile1 {
    
// Hãy viết chương trình Java  cho phép tính và in ra tổng của 100 số nguyên đầu tiên (1
// 100), dùng vòng lặp While. 
// Viết chương trình Java  có sử dụng vòng lặp While cho phép in ra những số chia hết cho 
// 3 trong khoảng từ 20-50
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Tong cua 100 so nguyen dau tien la: " + sum);

        System.out.print("Cac so chia het cho 3 trong khoang tu 20 den 50 la: ");
        int j = 20;
        while (j <= 50) {
            if (j % 3 == 0) {
                System.out.print(j + "  ");
            }
            j++;
        }

        input.close();
    }
}
