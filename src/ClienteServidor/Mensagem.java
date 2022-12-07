package ClienteServidor;
import java.io.Serializable;


public class Mensagem implements Serializable {
	public String nome;
        public String rua;
	public String bairro;
	public String numero;
        public String sucata;
	
	Mensagem (String nome, String rua, String bairro, String numero, String sucata) {
		this.nome = nome;
                this.rua = rua;
		this.bairro = bairro;
                this.numero = numero;
                this.sucata = sucata;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome==null || nome.equals(""))
            throw new Exception ("Nome nao fornecido");
        
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if (rua==null || rua.equals(""))
            throw new Exception ("Nome nao fornecido");
        
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro==null || bairro.equals(""))
            throw new Exception ("Nome nao fornecido");
        
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero==null || numero.equals(""))
            throw new Exception ("Nome nao fornecido");
        
        this.numero = numero;
    }

    public String getSucata() {
        return sucata;
    }

    public void setSucata(String sucata) throws Exception {
        if (sucata==null || sucata.equals(""))
            throw new Exception ("Nome nao fornecido");
        
        this.sucata = sucata;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "nome=" + nome + ", rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", sucata=" + sucata + '}';
    }
    
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (!(obj instanceof Mensagem))
            return false;

        Mensagem msg = (Mensagem)obj;

        if (this.nome.equals(msg.nome))
            return false;
        if (this.rua.equals(msg.rua))
            return false;
        if (this.bairro.equals(msg.bairro))
            return false;
        if (this.numero.equals(msg.numero))
            return false;
        if (this.sucata.equals(msg.sucata))
            return false;
        
        return true;
    }
    
	
	

}
