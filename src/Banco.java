import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private String endereco;
	private String cidade;
	private String uf;

	private List<Conta> contas = new ArrayList<Conta>();

	public Banco(String nome, String endereco, String cidade, String uf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
	}

	public void imprimirTotalNoCofre() {
		double total = 0d;
		for(Conta conta : contas) {
			total += conta.getSaldo();
		}	
		System.out.println("O banco " + nome + " tem um total de " + total + " em seu cofre");
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getUf() {
		return uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	

}
