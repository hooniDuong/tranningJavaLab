import java.util.Scanner;
import java.sql.*;

public class insertMySQL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/quanlyhaisan";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong!!");

            String createTable = "CREATE TABLE IF NOT EXISTS haisan (" +
                                 "ma INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "ten VARCHAR(50), " +
                                 "gia DOUBLE, " +
                                 "diachia VARCHAR(100))";
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTable);

            String insertTable = "INSERT INTO haisan (ten, gia, diachi) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(insertTable);

            System.out.print("Nhap so luong thong tin ban muon nhap: ");
            int number = input.nextInt();

            for (int i = 0; i < number; i++) {
                System.out.println("Lan thu " + i + ": ");

                System.out.print("ten: ");
                String ten = input.nextLine();

                System.out.print("gia: ");
                double gia = input.nextDouble();
                input.nextLine(); // xóa ký tự Enter còn dư

                System.out.print("dia chi: ");
                String diachi = input.nextLine();


                ps.setString(1, ten);
                ps.setDouble(2, gia);
                ps.setString(3, diachi);
                ps.executeUpdate();
            }
            connection.close();
        } catch(Exception exception) {
            System.out.println("Loi: " + exception);
        }
        input.close();
    }
}
