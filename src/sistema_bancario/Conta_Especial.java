package sistema_bancario;

public class Conta_Especial extends ContaBancaria {
	
	private double limite;
	
	public Conta_Especial() {
		super();
		setLimite(0);
	}

	public Conta_Especial(int numeroConta, double saldo, double limite) {
		super(numeroConta, saldo);
		this.limite = limite;
	}
	
	

	@Override
	public boolean sacar(double valor) {
		if ( limiteDisponivel(valor)) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	boolean limiteDisponivel(double valor) {
		if(getSaldo()+getLimite() >= valor) {
			setSaldo(getSaldo() - valor);
			return true;

		}return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
