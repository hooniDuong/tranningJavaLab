import java.util.Scanner;;
public class BTJavaIfElseIf1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Bài 10: Viết chương trình cho phép nhập vào điểm tổng kết của học viên và in ra xếp loại 
// các học viên đó với các tiêu chí sau: 
// Điểm > 80 và <= 100: In ra xếp loại giỏi. 
// Điểm từ 70 – 79: In ra xếp loại khá. 
// Điểm từ 60 – 69: In ra xếp loại TB khá. 
// Điểm từ 50 – 59: In ra xếp loại TB. 
// Điểm < 50: In ra xếp loại yếu. 
// Nếu điểm > 100: In ra không hợp lệ.
        System.out.print("Nhap diem tong ket cua hoc sinh: ");
        float diemTongket = input.nextFloat();

        if ((diemTongket > 80) && (diemTongket <= 100)) {
            System.out.println("GIOI");
        } else if ((diemTongket > 70) && (diemTongket <= 79)) {
            System.out.println("KHA");
        } else if ((diemTongket > 60) && (diemTongket <= 69)) {
            System.out.println("TB KHA");
        } else if ((diemTongket > 50) && (diemTongket <= 59)) {
            System.out.println("TB");
        } else if (diemTongket < 50) {
            System.out.println("YEU");
        } else System.out.println("DIEM KHONG HOP LE!");
        
        input.close();
    }
}
