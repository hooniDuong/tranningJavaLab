import java.util.Scanner;

public class BTJavaBasicsLab3 {
//Tính diện tích và chu vi hình chữ nhật
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Nhap vao chieu Dai cua HCN: ");
    //     double chieuDai = input.nextDouble();

    //     System.out.print("Nhap vao chieu Rong cua HCN: ");
    //     double chieuRong = input.nextDouble();

    //     double chuVi = (chieuDai + chieuRong) * 2;
    //     double dienTich = chieuDai * chieuRong;

    //     System.out.println("Chu vi hinh chu nhat: " + chuVi);
    //     System.out.println("Dien tich hinh chu nhat: " + dienTich);
    //     input.close();
    // }

//Tính trung bình tuổi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tuoiBo = 50;
        int tuoiMe = 45;
        int tuoiCon1 = 12; int tuoiCon2 = 14; int tuoiCon3 = 16;

        System.out.println("Trung binh tuoi cua gia dinh la: " + (tuoiBo + tuoiMe + tuoiCon1 + tuoiCon2 + tuoiCon3) / 5);

        input.close();
    }
}