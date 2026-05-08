import java.util.Scanner;
public class BTJavaIfElse3TinhLuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Viết một chương trình Java cho phép nhập vào lương, tạm ứng, phụ cấp của 
// một nhân viên sau đó tinh và in ra mức lương của người đó (lương = lương 
// + phụ cấp – tạm ứng – bảo hiểm). Bảo hiểm = 5% của lương.  
// Sau đó sẽ kiểm tra mức lương để tính thuế của người đó, thuế sẽ bằng 10% 
// của số lương phải đóng thuế (VD: Lương người đó là 7000 thì người đó sẽ 
// được miễn thuế là 5000, còn 2000 còn lại sẽ phải chịu thuế 10% => Lương 
// thực lĩnh là: 6800). Tính và in ra mức lương thực lĩnh. 
// Chú ý: Thuế chỉ tính trên mức lương ban đầu.
        System.out.print("Hay nhap vao tien luong cua ban: ");
        float tienLuong = input.nextFloat();
        System.out.print("Hay nhap vao tien tam ung cua ban: ");
        float tienTamUng = input.nextFloat();
        System.out.print("Hay nhap vao tien phu cap cua ban: ");
        float tienPhuCap = input.nextFloat();
        float tienBaoHiem = tienLuong / 100 * 5;
        System.out.println("Tien bao hiem phai dong la: " + tienBaoHiem);
        float tienThue;
        if (tienLuong >= 5000) {
            tienThue = (tienLuong - 5000) / 100 * 10;
            System.out.println("Tien thue phai dong la: " + tienThue);
        } else {
            System.out.println("Khong can phai dong thue!!");
            tienThue = 0;
        }

        float Luong = tienLuong + tienPhuCap - tienTamUng - tienBaoHiem - tienThue;
        System.out.println("TIEN LUONG THUC LINH: " + Luong);
        input.close();
    }
}
