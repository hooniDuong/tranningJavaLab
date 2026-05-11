import java.util.Scanner;

public class BTJavaLoopBreakContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Viết một Chương trình Java cho phép thực hiện một vòng lặp tính tổng và tổng bình 
// phương của 100 số nguyên đầu tiên.   
// a. Sửa đổi vòng lặp vừa tạo: Vòng lặp sẽ kết thúc khi biến đếm đạt đến giá trị 50. 
// b. Sửa đổi vòng lặp vừa tạo: Vòng lặp sẽ bị bỏ qua những câu lệnh còn lại khi 
// biến đếm đạt đến giá trị 70. 
// Hãy sử dụng 3 loại vòng lặp: for, while, do/while để làm bài tập trên.
        double tong100numf = 0;
        double tongBinhphuong100f = 0;

        for (int i = 0; i < 100; i++) {
            tong100numf = tong100numf + i;
            tongBinhphuong100f = tongBinhphuong100f + (i * i);
        }
        System.out.println(tong100numf + "  " + tongBinhphuong100f);
        for (int i = 0; i < 100; i++) {
            tong100numf = tong100numf + i;
            tongBinhphuong100f = tongBinhphuong100f + (i * i);
            if (i == 50) break;
        }
        System.out.println(tong100numf + "  " + tongBinhphuong100f);

        for (int i = 0; i < 100; i++) {
            if (i < 70) { 
                tong100numf = tong100numf + i;
                tongBinhphuong100f = tongBinhphuong100f + (i * i);
            } else {
                continue;
            }
        }
        System.out.println(tong100numf + "  " + tongBinhphuong100f);

        input.close();
    }
}
