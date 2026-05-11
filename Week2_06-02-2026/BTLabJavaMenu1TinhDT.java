import java.util.Scanner;
import java.lang.Math;
public class BTLabJavaMenu1TinhDT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("==============MENU==============");
            System.out.println("1. Tinh dien tich hinh vuong");
            System.out.println("2. Tinh dien tich hinh chu nhat");
            System.out.println("3. Tinh dien tich hinh tron");
            System.out.println("4. Tinh dien tich hinh tam giac");
            System.out.println("5. Thoat");

            System.out.print("Nhap vao lua chon cua ban: ");
            number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.print("Nhap vao canh hinh vuong: ");
                    float canhHV = input.nextFloat();
                    System.out.println("Dien tich hinh vuong la: " + (canhHV * canhHV));
                    break;
                case 2:
                    System.out.print("Nhap vao chieu Dai hinh chu nhat: ");
                    float chieuDai = input.nextFloat();
                    System.out.print("Nhap vao chieu Rong hinh chu nhat: ");
                    float chieuRong = input.nextFloat();
                    System.out.println("Dien tich hinh chu nhat la: " + (chieuRong * chieuDai));
                    break;
                case 3:
                    System.out.print("Nhap vao ban kinh hinh tron: ");
                    float banKinh = input.nextFloat();
                    System.out.println("Dien tich hinh tron la: " + (3.14 * (banKinh * banKinh)));
                    break;
                case 4:
                    System.out.print("Nhap vao 3 canh cua hinh tam giac: ");
                    float canhTG1 = input.nextFloat();
                    float canhTG2 = input.nextFloat();
                    float canhTG3 = input.nextFloat();

                    if ((canhTG1 + canhTG2 > canhTG3) && (canhTG1 + canhTG3 > canhTG2)
                    && (canhTG2 + canhTG3 > canhTG1)) {
                          float nuaChuviTG = (canhTG1 + canhTG2 + canhTG3) / 2;
                          float dienTinhTG = (float) Math.sqrt(nuaChuviTG * (nuaChuviTG - canhTG1) * (nuaChuviTG - canhTG2) * (nuaChuviTG - canhTG3));
                          System.out.println("Dien tich hinh tam giac la: " + dienTinhTG);
                    } else {
                        System.out.println("Ba canh vua nhap khong tao thanh hinh tam giac!");
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!");
                    break;
            }
        } while (number != 5);
        input.close();
    }
}
