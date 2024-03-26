package leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import sistema_bancario.ContaBancaria;

public class ArquivosContas {
	public static void main(String[] args) {
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		try {
			FileReader fr = new FileReader("contas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while((linha = br.readLine())!=null) {
				String v[] = linha.split(",");
				if(v[0].equals("0")) {
					int nr = Integer.parseInt(v[1]);
					double saldo = Double.parseDouble(v[2]);

				}
			}
			
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
			

		}
	}

}
