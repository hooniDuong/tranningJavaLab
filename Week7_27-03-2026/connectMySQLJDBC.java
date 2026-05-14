import java.sql.*;

public class connectMySQLJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/quanlyhaisan";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Loi ket noi: " + e.getMessage());
        }
    }
}
