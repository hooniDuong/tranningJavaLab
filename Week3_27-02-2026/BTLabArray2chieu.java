import java.util.Scanner;

// Viết một chương trình Java cho phép làm việc với mảng hai chiều. Khai báo một mảng bao gồm 3 dòng, 4 cột, các phần tử của mảng là số nguyên. Hãy thực hiện các công việc sau:
// Nhập giá trị cho các phần tử của mảng
// In ra giá trị của các phần tử mảng
// Tính và in ra tổng của các phần tử trong mảng

public class BTLabArray2chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int[][] array = new int[rows][cols];
        
        // Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        
        // In ra giá trị của các phần tử mảng
        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Tính và in ra tổng của các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Tong cua cac phan tu trong mang: " + sum);
        
        input.close();
    }    
}
