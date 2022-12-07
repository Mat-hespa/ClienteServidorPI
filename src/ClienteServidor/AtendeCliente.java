package ClienteServidor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtendeCliente extends Thread {
	Socket cliente;

	AtendeCliente(Socket cli) {
		this.cliente = cli;
	}

	@Override
	public void run() {

		try {
			System.out.println("Cliente conectado com thread (" + this.getId() + 
					") : " + cliente.getInetAddress());

			// Fluxo de dados do cliente para comunicar e enviar Objeto
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			Mensagem objeto = (Mensagem) entrada.readObject();
			System.out.println(objeto.toString());
                        
                        SolicitacaoDAO.inclusaoCadastro(objeto);
			
			cliente.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
                Logger.getLogger(AtendeCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

	}

}
