package revisao_jogador.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao_jogador.Campeonato;
import revisao_jogador.Jogador;
import revisao_jogador.Time;

class CampeonatoTest {

	ArrayList<Time>times;
	@BeforeEach
	void inicializadoTime() {
		ArrayList< Jogador> jogadores1 = new ArrayList<Jogador>();
		jogadores1.add(new Jogador("n1", 1, 1));
		jogadores1.add(new Jogador("n2", 2, 2));
		jogadores1.add(new Jogador("n3", 3, 3));
		jogadores1.add(new Jogador("n4", 4, 4));
		jogadores1.add(new Jogador("n5", 5, 5));
		Time t1 = new Time("time 1", jogadores1);
		
		ArrayList< Jogador> jogadores2= new ArrayList<Jogador>();
		jogadores2.add(new Jogador("n6", 6, 6));
		jogadores2.add(new Jogador("n7", 7, 7));
		jogadores2.add(new Jogador("n8", 8, 8));
		jogadores2.add(new Jogador("n9", 9, 9));
		jogadores2.add(new Jogador("n10", 10, 10));
		Time t2 = new Time("time 2", jogadores2);
		
		ArrayList< Jogador> jogadores3= new ArrayList<Jogador>();
		jogadores3.add(new Jogador("nxx", 99, 0));
		jogadores3.add(new Jogador("nyy", 99, 0));
		Time t3 = new Time("time 3", jogadores2);
		
		times = new ArrayList<>();
		times.add(t1);
		times.add(t2);
		times.add(t3);

	}
	
	@Test
	void timeMaisGolsTest() {
		Time timesMaisGol = Campeonato.timeComMaisGols(times);
		assertEquals("time 2 (5)", timesMaisGol.toString());
	}
	
	@Test
	void artelheiroCaampeonato () {
		Jogador artilheiro = Campeonato.artilheiroCampeonato(times);
		assertEquals("Jogador [nome=n10, camisa=10, gols=10]",artilheiro.toString());
	}

}
