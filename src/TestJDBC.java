import java.sql.*;

public class TestJDBC {
    public static void main (String [] args) throws Exception {
        // Charger la class du driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3309/FlightSchedule?createDatabaseIfNotExist=true && useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
//            Statement st = cx.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM destination");
//            while (rs.next()) {
//                String name = rs.getString("name");
//                int id = rs.getInt("id");
//                System.out.println("ID " + id + " is for " + name);
//            }
//            rs.close();
//            st.close();
            cx.close();
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
