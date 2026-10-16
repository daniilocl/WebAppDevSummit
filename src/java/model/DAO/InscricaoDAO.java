package model.DAO;
import model.Inscricao;
import conexao.ConectaBanco;
import java.sql.*;
        
/**
 *
 * @author daniilocl
 */
public class InscricaoDAO {
    public boolean cadastrar(Inscricao inscricao) throws ClassNotFoundException {
        Connection conexao = null;
        
        try {
            conexao = ConectaBanco.conectar();
            String sql = "INSERT INTO tb_inscricao (nome, sobrenome, email_corporativo, telefone_celular, nome_empresa, cargo, setor, nacionalidade, cidade, tipo_documento, numero_documento, como_conheceu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, inscricao.getNome());
            pstm.setString(2, inscricao.getSobrenome());
            pstm.setString(3, inscricao.getEmailCorporativo());
            pstm.setString(4, inscricao.getTelefoneCelular());
            pstm.setString(5, inscricao.getNomeEmpresa());
            pstm.setString(6, inscricao.getCargo());
            pstm.setString(7, inscricao.getSetor());
            pstm.setString(8, inscricao.getNacionalidade());
            pstm.setString(9, inscricao.getCidade());
            pstm.setString(10, inscricao.getTipoDocumento());
            pstm.setString(11, inscricao.getNumeroDocumento());
            pstm.setString(12, inscricao.getComoConheceu());
            pstm.executeUpdate();
            pstm.close();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro - SQL: " + ex);
            
            return false;
        }
    }
}
