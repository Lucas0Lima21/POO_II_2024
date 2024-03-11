package sistema_bancario;

import java.util.ArrayList;

public class Banco {
	private ArrayList<ContaBancaria> contas;

	public Banco() {
		contas = new ArrayList<>();
	}
	
	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
	}

	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}	
}

