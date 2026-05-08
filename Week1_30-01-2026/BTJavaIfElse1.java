import java.util.Scanner;
public class BTJavaIfElse1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Bài 2: Viết một Chương trình Java cho phép nhập vào lương của một nhân viên (có kiểu 
// dữ liệu float), sau đó chương trình sẽ kiểm tra lương của người đó để tính thuế, nếu người 
// đó có lương >= 500 thì sẽ tính và in ra số tiền thuế mà nhân viên phải nộp, còn nếu mức 
// lương < 500 thì sẽ không phải nộp thuế, và sẽ in ra: “Ban khong phai nop thue”.  
// Chú ý: Mức thuế là 10%. 
        System.out.print("Nhap vao muc luong cua ban: ");
        float mucLuong = input.nextFloat();

        if (mucLuong >= 500) {
            System.out.println("Ban phai dong so tien thue la: " + (mucLuong / 100 * 10));
        } else {
            System.out.println("Ban khong co phai dong thue!");
        }
        input.close();
    }
}
