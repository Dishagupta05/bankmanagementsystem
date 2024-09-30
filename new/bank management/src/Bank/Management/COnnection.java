package Bank.Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class COnnection {
    Connection connection;
    Statement statement;


    public COnnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","1234");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
