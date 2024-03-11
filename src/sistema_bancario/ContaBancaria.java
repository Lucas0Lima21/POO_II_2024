package sistema_bancario;

public class ContaBancaria {
	protected int numeroConta;
	protected double saldo;
	
	public ContaBancaria() {
		setNumeroConta(9999);
		setSaldo(-1);
	}
	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Numero da Conta = " + numeroConta + ", saldo = " + saldo;
	}
	
	public boolean deposito(double valor) {
		setSaldo(getSaldo() + valor);
			return true;
	}
	
	public boolean sacar( double valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			return true;
		}return false;
	}
	
	public boolean transferir( ContaBancaria nrTransferencia, double valor ) {
		if(sacar(valor)) {
			setSaldo(getSaldo() - valor);
			nrTransferencia.deposito(valor);
			return true;
		}else {
				deposito(valor);
				return false;
			}
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
