import java.sql.*;
import com.mysql.cj.protocol.Resultset;
public class Cctns {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://10.68.238.96:3306/cctns_state_db", "cctns_app","cctns@123");
            System.out.println("connect");

            String  qr="select * from t_fir_registration";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(qr);
            while(rs.next()){
                long id=rs.getLong("FIR_REG_NUM");
                 System.out.println(id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }

