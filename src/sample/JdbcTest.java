package sample;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        ResultSet rs;

        String driverName = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:3306:sample";
        String user = "student";
        String password = "1234";

        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, user, password);
            String spl = "select * from emp";
            statement = connection.createStatement();
            //select
            rs = statement.executeQuery(spl);


            rs.close();
            statement.close();
            connection.close();
            // 연결해제
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
