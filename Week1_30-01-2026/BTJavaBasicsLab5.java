import java.util.Scanner;
public class BTJavaBasicsLab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Bài 1: Viết chương trình tính chu vi và diện tích hình chữ nhật.Biết rằng chiều dài và chiều 
// rộng là các số nguyên nhỏ hơn 100 được nhập vào từ bàn phím 
        // System.out.print("Nhap chieu Dai hinh chu nhat: ");
        // int chieuDai = input.nextInt();

        // System.out.print("Nhap chieu Rong hinh chu nhat: ");
        // int chieuRong = input.nextInt();

        // int chuVi = (chieuDai + chieuRong) * 2;
        // int dienTich = chieuDai * chieuRong;
        // System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
        // System.out.println("Dien tich cua hinh chu nhat la: " + dienTich);

// Bài 2: Biết 1 Dollar tương đương với 16.000 đồng VN.Hãy viết chương trình cho phép nhập 
// vào số Dollar rồi đổi sang đồng VN. 
        int DOLLAR_TO_VND = 16000;
        System.out.print("Hay nhap so Dollar hien co: ");
        int Dollar = input.nextInt();
        System.out.print(Dollar + " $ hien co tuong ung voi " + (Dollar * DOLLAR_TO_VND) + " VND");
        input.close();
    }
}
 