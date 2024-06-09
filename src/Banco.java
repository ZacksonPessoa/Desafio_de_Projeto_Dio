import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void addConta(Conta conta){
		contas.add(conta);

	}
	public void removeConta(Conta conta){
		contas.remove(conta);
	}

}
