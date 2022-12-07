package ClienteServidor;

import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author matheusah
 */
public class SolicitacaoDAO {

    public static void inclusaoCadastro (Mensagem obj) throws Exception {
        
        if (obj == null)
            throw new Exception ("Cadastro nao fornecido");
        
        try {
            
            String sql;

            sql = "INSERT INTO SOCLICITACOES " +
                  "(NOME,RUA,BAIRRO,NUMERO,SUCATA) " +
                  "VALUES " +
                  "(?,?,?,?,?)";

            BDSQLServer.COMANDO.prepareStatement(sql);

            BDSQLServer.COMANDO.setString(1, obj.getNome());
            BDSQLServer.COMANDO.setString(2, obj.getRua());
            BDSQLServer.COMANDO.setString(3, obj.getBairro());
            BDSQLServer.COMANDO.setString(4, obj.getNumero());
            BDSQLServer.COMANDO.setString(5, obj.getSucata());
            
            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,  "UsuarioDAO: " + erro);
        }
    }
}
