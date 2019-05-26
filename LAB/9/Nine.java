//Import required packages
import java.sql.*;

public class Nine {
   // JDBC driver name and database URL
    
   
   public static void main(String[] args) {
   Connection con = null;
   Statement stmt = null;
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("After loading SQLServerDriver:");
       
         
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String USER = "root";
        final String PASS = "123"; 
        
        final String DB_URL = "jdbc:mysql://127.0.0.1:3306/students";
       // System.setProperty(JDBC_DRIVER,"");

       con = DriverManager.getConnection(DB_URL,USER,PASS);    
       System.out.println("Connected with default host.");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = con.createStatement();
      
      String sql = "INSERT INTO Registration " +
                   "VALUES (1, 'ROOPA ', 'A', 18)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (2, 'PRASAD', 'A', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (3, 'MARUTI', 'K', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES(4, 'NADAF', 'Mittal', 28)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
              "VALUES(4, 'NADAF', 'Mittal', 28)";
 stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
      ResultSet rs=stmt.executeQuery("select * from Registration");  
      while(rs.next())  
      System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
      
      
      

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            con.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(con!=null)
            con.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end
