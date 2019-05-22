package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class ItemDAO {
    private Connection con;
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/DAO";
    String user = "student";
    String password = "1234";

    public ItemDAO() throws DAOException {
        if(con == null)
            getConnection();
    }

    public List<ItemBean> findAll() throws DAOException {
        if (con == null)
            getConnection();

        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM item";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();

            List<ItemBean> list = new ArrayList<>();
            while(rs.next()) {
                int code = rs.getInt("code");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                ItemBean bean = new ItemBean(code, name, price);
                list.add(bean);
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("hello");
        } finally {
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
                close();
            } catch (Exception e) {
               throw new DAOException("リソースの。。。");
            }
        }
    }

    private void getConnection() throws DAOException{
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new DAOException("접속실패");
        }
    }

    private void close() throws SQLException {
        if(con != null) {
            con.close();
            con = null;
        }
    }
}
