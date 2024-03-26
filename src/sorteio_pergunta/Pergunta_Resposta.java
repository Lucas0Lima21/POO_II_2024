package sorteio_pergunta;

public class Pergunta_Resposta {
	
	protected String pergunta;
	protected String resposta;
	
	public Pergunta_Resposta() {
		setPergunta("?");
		setResposta("?");
	}
	public Pergunta_Resposta(String pergunta, String resposta) {
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	
	@Override
	public String toString() {
		return "Pergunta_Resposta [pergunta=" + pergunta + ", resposta=" + resposta + "]";
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
