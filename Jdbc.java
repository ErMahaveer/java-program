import java.sql.*;
import com.mysql.cj.protocol.Resultset;

public class Jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root","12345");
            System.out.println("connect");

            String  qr="select * from help_relation";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(qr);
            while(rs.next()){
                int id=rs.getInt("help_topic_id");
             // String num=rs.getString(" ");
                System.out.println(id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
