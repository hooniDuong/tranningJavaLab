import java.sql.*;
import java.util.Scanner;
public class insertSQL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/quanlyhaisan";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thang cong!!");

            //Create Table
            Statement statement = connection.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS haisan (" +
                                 "ma INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "ten VARCHAR(50), " +
                                 "gia DOUBLE, " +
                                 "diachi VARCHAR(100))";

            statement.executeUpdate(createTable);

            //Insert Table
            String insertTable = "INSERT INTO haisan (ten, gia, diachi) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(insertTable);

            System.out.print("Nhap ten: ");
            String name = input.nextLine();

            System.out.print("Nhap gia: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.print("Nhap dia chi: ");
            String address = input.nextLine();

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setString(3, address);

            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println(exception);
        }
        input.close();
    }
}
