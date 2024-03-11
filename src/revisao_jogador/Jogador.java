package revisao_jogador;

public class Jogador {
	
	protected String nome;
	protected int camisa;
	protected int gols;
	
	public Jogador() {
		setNome("");
		setCamisa(999);
		setGols(-1);
	}

	public Jogador(String nome, int camisa, int gols) {
		this.nome = nome;
		this.camisa = camisa;
		this.gols = gols;
	}
	
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", camisa=" + camisa + ", gols=" + gols + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}

}
