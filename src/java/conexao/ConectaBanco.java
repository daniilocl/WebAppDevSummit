package conexao;
import java.sql.*;
/**
 *
 * @author daniilocl
 */
public class ConectaBanco {
    public static Connection conectar() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_devsummit", "root", "");
        } catch (Exception ex) {
            System.out.println("Erro - SQL " + ex);
        }
        
        return conn;
    }
   public static void main(String[] args) {
        System.out.println("A testar a ligação ao MySQL...");
        
        Connection c = ConectaBanco.conectar();
        
        if (c != null) {
            System.out.println(" Conexão estabelecida com sucesso com a base de dados db_devsummit!");
        } else {
            System.out.println(" Falha na conexão. Verifique se o MySQL no XAMPP está ativo.");
        }
    }
}
