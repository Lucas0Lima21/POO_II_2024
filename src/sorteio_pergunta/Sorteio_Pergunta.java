package sorteio_pergunta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Sorteio_Pergunta {
    public static void main(String[] args) {
        String menu = "1 - Rodada de Perguntas\n" + "2 - Score Total\n" + "3 - Sair";
        int op = 0;
        int totalAcertos = 0;
        int totalErros = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
            	totalAcertos = 0;
            	totalErros = 0;
        
                int[] resultados = rodadaDePerguntas();
                totalAcertos += resultados[0];
                totalErros += resultados[1];
            }
            if (op == 2) {
                JOptionPane.showMessageDialog(null, "Total de acertos: " + totalAcertos + "\nTotal de erros: " + totalErros);
            }
        } while (op != 3);
    }

    private static int[] rodadaDePerguntas() {
        List<Pergunta_Resposta> perguntas = lerPerguntas("perguntas.txt");
        Random random = new Random();
        int acertos = 0;
        int erros = 0;

        if (perguntas != null && !perguntas.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                int indice = random.nextInt(perguntas.size());
                Pergunta_Resposta pergunta = perguntas.get(indice);
                perguntas.remove(indice);

                int resposta = perguntar(pergunta.getPergunta());
                if (resposta == -1) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.");
                    break;
                } else if (resposta == 0 && pergunta.getResposta().equalsIgnoreCase("verdadeiro")
                        || resposta == 1 && pergunta.getResposta().equalsIgnoreCase("falso")) {
                    acertos++;
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                } else {
                    erros++;
                    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
                }
            }
        } 
        return new int[] { acertos, erros };
    }

    private static int perguntar(String pergunta) {
        Object[] options = { "Verdadeiro", "Falso" };
        int resposta = JOptionPane.showOptionDialog(null, pergunta, "Pergunta", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return resposta;
    }

    private static List<Pergunta_Resposta> lerPerguntas(String arquivo) {
        List<Pergunta_Resposta> perguntas = new ArrayList<>();
        try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Separe a pergunta e a resposta da linha
                String[] partes = linha.split(", ");
                if (partes.length == 2) {
                    Pergunta_Resposta pergunta = new Pergunta_Resposta(partes[0], partes[1]);
                    perguntas.add(pergunta);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return perguntas;
    }
}
