import java.util.Scanner;
public class BTLabDoWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 14;
        System.out.print("Nhung so chia het cho 7 tu 10 den 70: ");
        do {
            System.out.print(number + "  ");
            number += 7;
        } while (number <= 70);

        input.close();
    }
}
