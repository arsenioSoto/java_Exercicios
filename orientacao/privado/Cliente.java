package orientacao.privado;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	public void setProfissao(String novaProfissao) {
		this.profissao = novaProfissao;
	}
}
