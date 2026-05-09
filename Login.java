import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Login {
    public static void main(String[] args) {
        
        String url="jdbc:mysql://localhost:3306/apply";
        String user = "root";
        String pass="Prince@567899";
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(url,user,pass);
              System.out.println("Database Connected");

             String Query= "INSERT INTO login (Name,Email,Password)VALUE (?,?,?)";
             PreparedStatement ps = con.prepareStatement(Query);
             ps.setString(1, "Prabhakar s gaur");
             ps.setString(2, "psgaur764@gmail.com");
             ps.setString(3, "psgaur12");

           int i= ps.executeUpdate();

           if(i>0){
            System.out.println("Login Successful");
           }
           else{
            System.out.println("User in not here Please Account USERNAME & PASSWORD Create Thanks");
           }
           con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

    }
}
