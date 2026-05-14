// Hãy phát triển một chương trình Java cho phép cài đặt cơ chế xử lý ngoại lệ. Chương 
// trình sẽ cho phép nhập vào một số, một string, và một mảng các string vào từ bàn phím. 
// Hãy viết mã để xử lý các ngoại lệ sau: 
// ArrayIndexOutOfBoundsException 
// NumberFormatException 
// NullPointerException 
// ArimeticException 
 
 
// Hãy sử dụng nhiều khối catch, và định nghĩa khối finally trong bài này. 


public class BTLabJavaException1 {
    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException
            String[] arr = new String[3];
            arr[5] = "Hello";

            // NumberFormatException
            int num = Integer.parseInt("abc");

            // NullPointerException
            String str = null;
            System.out.println(str.length());

            // ArithmeticException
            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}
