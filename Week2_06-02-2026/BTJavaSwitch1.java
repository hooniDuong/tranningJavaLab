import java.util.Scanner;

public class BTJavaSwitch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hay nhap vao mot so tu ban phim: ");
        int Day = input.nextInt();

        switch (Day) {
            case 0:
                System.out.println("Ngay thu hai");
                break;
            case 1:
                System.out.println("Ngay thu ba");
                break;
            case 2:
                System.out.println("Ngay thu tu");
                break;
            case 3:
                System.out.println("Ngay thu nam");
                break;
            case 4:
                System.out.println("Ngay thu sau");
                break;
            case 5:
                System.out.println("Ngay thu bay");
                break;
            case 6:
                System.out.println("Ngay chu nhat");
                break;
            default:
                System.out.println("Khong hop le!!");
                break;
        }

        input.close();
    }
}
