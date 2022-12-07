package ClienteServidor;

import ClienteServidor.core.MeuPreparedStatement;

/**
 *
 * @author matheusah
 */
public class BDSQLServer
{
    public static final MeuPreparedStatement COMANDO;

    static
    {
    	MeuPreparedStatement comando = null;

    	try
        {
            comando = new MeuPreparedStatement (
                      "com.mysql.jdbc.Driver",
                      "jdbc:mysql://localhost:3306/cadastro",
                      "root", "admin123");
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            System.exit(0); // aborta o programa
        }
        
        COMANDO = comando;
    }

}