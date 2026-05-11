import java.util.Scanner;

public class BTJavaSwitch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao luong cua nhan vien: ");
        int luongNV = input.nextInt();

        switch (luongNV) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Rat kem");
                break;
            case 4:
                System.out.println("Kem");
                break;
            case 5:
                System.out.println("Co co gang");
                break;
            case 6:
                System.out.println("Tot");
                break;
            case 7:
                System.out.println("Rat tot");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Tuyet voi");
            default:
                System.out.println("Khong hop le");
                break;
        }
        input.close();
    }
}
