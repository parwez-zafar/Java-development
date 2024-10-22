import java.sql.*;
//import java.util.Sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import package
            lead and register
            create connection
            create statement
            execute statement
            process the results
            close
        */


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "system";
        String query = "Select * from student ORDER BY sid";

        // step - 2
        Class.forName("org.postgresql.Driver");  // load and register

        // step - 3
        Connection con = DriverManager.getConnection(url, uname, pass);  // creating connection
        System.out.println("connection established....");

        // step - 3
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
//        System.out.println(rs.next());
//        String name = rs.getString("sname");
//        System.out.println(name);

        System.out.println("Id - Name - Marks");
        while(rs.next()) {
            System.out.print(rs.getInt(1) +  " - " + rs.getString(2) + " - " + rs.getInt(3));
            System.out.println();
        }

//        System.out.println("--------------- inserting values -----------------");
//        String insertQuery = "INSERT INTO student VALUES (6, 'John', 55)";
//        boolean status = st.execute(insertQuery);
//        System.out.println(status);


//        System.out.println("---------------- updating -------------");
//        String updateQuery = "UPDATE student SET sname = 'Parwez Zafar' WHERE sid = 2";
//        boolean status = st.execute(updateQuery);
//        System.out.println(status);


//        System.out.println("-------------- Deleting ------------------");
//        String deleteQuery = "DELETE from student where sid = 6";
//        boolean status = st.execute(deleteQuery);
//        System.out.println(status);


        con.close();

        System.out.println("....connection closed");

    }
}