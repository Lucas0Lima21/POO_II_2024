package revisao_jogador;

import java.util.ArrayList;

public class Campeonato {
	public static Time timeComMaisGols(ArrayList<Time> times) {
		Time timeMaisGols = times.get(0);
		for(Time time : times) {
			if(time.qtGolstime() > timeMaisGols.qtGolstime()){
				timeMaisGols = time;
			}
		}return timeMaisGols;
	}
	public static Jogador artilheiroCampeonato(ArrayList<Time> times) {
		Jogador artilheiro = new Jogador();
		for(Time time :times) {
			if(time.artilheiro().getGols() > artilheiro.getGols()) {
				artilheiro =time.artilheiro();
			}
		}return artilheiro;
	}

}
