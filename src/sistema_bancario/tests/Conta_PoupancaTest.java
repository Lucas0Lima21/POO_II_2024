package sistema_bancario.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistema_bancario.Conta_Poupanca;

class Conta_PoupancaTest {


	Conta_Poupanca conta1;
	Conta_Poupanca conta2;
	Conta_Poupanca conta3;

    @BeforeEach
    public void inicializar() {
        conta1 = new Conta_Poupanca(1, 1000.0, 4);
        conta2 = new Conta_Poupanca();
        conta3 = new Conta_Poupanca(2, 1200.0, 1);
    }

    @Test
    public void toStringTeste() {
    	assertEquals(1, conta1.getNumeroConta());
    	assertEquals(1000.0, conta1.getSaldo());
		assertEquals("Numero da Conta = 1, saldo = 1000.0", conta1.toString());
    }
    
    @Test
    public void vaziotoStringTeste() {
    	assertEquals(9999, conta2.getNumeroConta());
    	assertEquals(-1.0, conta2.getSaldo());
		assertEquals("Numero da Conta = 9999, saldo = -1.0", conta2.toString());

    }

    @Test
    public void DepositoTeste() {
    	
    	assertTrue(conta1.deposito(500));
    	assertTrue(conta3.deposito(300));
    	assertEquals(1500, conta1.getSaldo());
    	assertEquals(1500, conta3.getSaldo());
    }

    @Test
    public void SaqueTeste() {
    	assertTrue(conta1.sacar(500.0));
        assertEquals(500.0, conta1.getSaldo());
        assertEquals(5, conta1.getNrSaque());
    	assertFalse(conta1.sacar(500.0));
        assertFalse(conta1.sacar(2000.0)); 
    }
    
    @Test
    public void TransferenciaTeste() {
    	assertTrue(conta1.transferir(conta3, 200));
        assertTrue(conta3.transferir(conta1, 100));
        assertFalse(conta2.transferir(conta1, 500));
       // assertEquals(1600.0, conta3.getSaldo());
    }
}
