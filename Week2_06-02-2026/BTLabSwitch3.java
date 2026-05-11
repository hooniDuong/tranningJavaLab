import java.util.Scanner;
public class BTLabSwitch3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diem cua hoc sinh tu ban phim: ");
        int number = input.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("YEU");
                break;
            case 5:
            case 6:
                System.out.println("TRUNG BINH");
                break;
            case 7:
            case 8:
                System.out.println("KHA");
                break;
            case 9:
            case 10: 
                System.out.println("GIOI");
                break;
            default:
                System.out.println("Diem khong hop le!");
                break;
        }
        input.close();
    }   
}
