import java.sql.*;
public class Jdbc_Table {
    public static void main(String[] args) {
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","12345");


             /* String qr="select * from customers";
              Statement st= con.createStatement();
              ResultSet rs=st.executeQuery(qr);
              while(rs.next()){
              String name=rs.getString("customerName");
              String city=rs.getString("city");
              System.out.println(name+"\t"+city);
              }   */
              
            
          } catch (Exception e) {
           System.out.println(e);
          }

    }
}
