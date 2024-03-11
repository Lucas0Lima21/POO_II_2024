package sistema_bancario.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistema_bancario.Banco;
import sistema_bancario.Conta_Corrente;
import sistema_bancario.Conta_Especial;

class BancoTest {
	
	Banco banco;
    Conta_Corrente conta1;
    Conta_Especial conta2;
	
	@BeforeEach
	public void inicializar() {
		banco = new Banco();
        conta1 = new Conta_Corrente(123, 1000.0);
        conta2 = new Conta_Especial(321, 2000.0, 500);
	}

	 @Test
	 public void adicionarContaTeste() {
		 banco.adicionarConta(conta1);
		 assertEquals(1, banco.getContas().size());
		 assertTrue(banco.getContas().contains(conta1));
		 banco.adicionarConta(conta2);
		 assertEquals(2, banco.getContas().size());
		 assertTrue(banco.getContas().contains(conta2)); 
	 }
	 
	 @Test
	 public void construtorComArrayListTeste() {
		 conta1 = new Conta_Corrente(123, 1000.0);
		 conta2 = new Conta_Especial(321, 2000.0,500);
		 Banco banco = new Banco();
		 banco.adicionarConta(conta1);
		 banco.adicionarConta(conta2);
		 assertEquals(2, banco.getContas().size());
		 assertTrue(banco.getContas().contains(conta1));
		 assertTrue(banco.getContas().contains(conta2));
	 }
}
