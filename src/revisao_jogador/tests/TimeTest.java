package revisao_jogador.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao_jogador.Jogador;
import revisao_jogador.Time;

class TimeTest {

	Time t1;
	Time t2;
	
	@BeforeEach
	void inicializadoTime() {
		ArrayList< Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador("n1", 1, 1));
		jogadores.add(new Jogador("n2", 2, 2));
		jogadores.add(new Jogador("n3", 3, 3));
		jogadores.add(new Jogador("n4", 4, 4));
		jogadores.add(new Jogador("n5", 5, 5));

		t1 = new Time("time 1", jogadores);
		t2 = new Time();

	}
	@Test
	void listaJogadores() {
		assertEquals("Jogador [nome=n1, camisa=1, gols=1]\n"
				+"Jogador [nome=n2, camisa=2, gols=2]\n"
				+"Jogador [nome=n3, camisa=3, gols=3]\n"
				+"Jogador [nome=n4, camisa=4, gols=4]\n"
				+"Jogador [nome=n5, camisa=5, gols=5]\n",t1.listJogador());
		assertEquals("", t2.listJogador());
	}
	
	@Test
	void ToStringTest() {
		assertEquals("time 1 (5)",t1.toString());
		assertEquals(" (0)", t2.toString());
	}
	
	@Test
	void artilheiro() {
		assertEquals("Jogador [nome=n5, camisa=5, gols=5]", t1.artilheiro().toString());
		assertEquals("Jogador [nome=, camisa=999, gols=-1]", t2.artilheiro().toString());

	}
	
	@Test
	void quantidadeGols() {
		assertEquals(15, t1.qtGolstime());
		assertEquals(0, t2.qtGolstime());

	}
	

}
