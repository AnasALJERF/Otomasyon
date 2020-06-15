package personel;


import java.sql.*;
    import javax.swing.*;
     
    public class Connect {
     
    public static Connection connect() {
     
    try {
    Class.forName("com.mysql.jdbc.Driver");
     
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personel", "root" ,"");
   //JOptionPane.showMessageDialog(null, "connected");
    return con;
     
    } catch (Exception e) {
    //JOptionPane.showMessageDialog(null, "cant connect to database");
    }
    return null;
    }
     
    public static void main(String[] args) {
    Connect.connect();
    }
    }