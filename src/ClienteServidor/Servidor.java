package ClienteServidor;
import java.net.ServerSocket;


public class Servidor {

	public static void main(String[] args) {

		try {
			
			ServerSocket servidor = new ServerSocket(7000);
			System.out.println("Servidor iniciado...");
			
			while(true) {
				
				AtendeCliente ac = new AtendeCliente(servidor.accept());
				ac.start();
							
			}
                        
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
		
		

	}

}