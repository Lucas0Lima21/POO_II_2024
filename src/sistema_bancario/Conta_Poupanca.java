package sistema_bancario;

public class Conta_Poupanca extends ContaBancaria {
	
	private int nrSaque;
	
	public Conta_Poupanca() {
		super();
		setNrSaque(0);

	}
	public Conta_Poupanca(int numeroConta, double saldo, int nrSaque) {
		super(numeroConta, saldo);
		this.nrSaque = nrSaque;

	}
	
	@Override
	public boolean sacar(double valor) {
		if (getNrSaque() < 5 && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			nrSaque++;
			return true;
		}
		return false;
	}
	
	public int getNrSaque() {
		return nrSaque;
	}
	public void setNrSaque(int nrSaque) {
		this.nrSaque = nrSaque;
	}
}
