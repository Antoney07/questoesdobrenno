import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        cabecalho();

        ArrayList<Questao> questoes = new ArrayList<>();
        int acertos = 0;
        int erros = 0;

        questoes.add(new Questao(
                "01 - Qual o nome do chefe de Elden Ring com o maior drop de runas? (jogo base)",
                "A) Elden Beast", "B) Maliketh", "C) Godfrey", "D) Malenia", "E) Gigante de Fogo", "A"
        ));

        questoes.add(new Questao(
                "02 - Qual o nome da arma lendária obtida ao derrotar o chefe final?",
                "A) Espada da Luz", "B) Relâmpago de Maliketh", "C) Espada Sagrada de Marika", "D) Grande Espada da Ruína", "E) Cajado de Radagon", "C"
        ));

        questoes.add(new Questao(
                "03 - Quem é o primeiro chefe principal do jogo?",
                "A) Godrick, o Enxertado", "B) Malenia, a Espada de Miquella", "C) Margit, o Agouro Caído", "D) Rennala, Rainha da Lua Cheia", "E) Radahn, o Flagelo Celeste", "C"
        ));

        questoes.add(new Questao(
                "04 - Quem é a mãe de Ranni, Radahn e Rykard?",
                "A) Malenia, Lâmina de Miquella", "B) Romina, Santa do Bulbo", "C) Rya, da Mansão Vulcânica", "D) Rennala, Rainha da Lua Cheia", "E) Rellana, das Lâminas Gêmeas", "D"
        ));

        questoes.add(new Questao(
                "05 - Qual o nome da área onde você encontra o Gigante de Fogo?",
                "A) Lyndell, Capital Real", "B) Pico das Montanhas dos Gigantes", "C) Pântano de Aeonia", "D) Nokron, Cidade Eterna", "E) Mansão Vulcânica", "B"
        ));

        questoes.add(new Questao(
                "06 - Qual o nome do NPC que ajuda o jogador a enfrentar Radahn?",
                "A) Blaidd", "B) Ranni", "C) Fia", "D) Rogier", "E) Seluvis", "A"
        ));

        questoes.add(new Questao(
                "07 - Qual item é necessário para acessar a Cidade Eterna, Nokron?",
                "A) Medalhão de Dectus", "B) Anel de Lua Negra", "C) Lâmina de Miquella", "D) Nenhum dos anteriores", "E) Adaga de Mogh", "D"
        ));

        questoes.add(new Questao(
                "08 - Qual o nome do evento em que Radahn é enfrentado?",
                "A) Festival da Lua", "B) Torneio de Lyndell", "C) Festival de Radahn", "D) Conflito de Redmane", "E) Cerco de Nokron", "C"
        ));

        questoes.add(new Questao(
                "09 - Quem é o verdadeiro vilão da lore de Elden Ring?",
                "A) Maliketh", "B) Malenia", "C) Radagon", "D) A Velha Árvoresposa", "E) Marika", "D"
        ));

        questoes.add(new Questao(
                "10 - Qual o nome do chefe encontrado no topo da Mansão Vulcânica?",
                "A) Rykard, Senhor da Blasfêmia", "B) Godrick, o Enxertado", "C) Rennala, Rainha da Lua Cheia", "D) Radahn, o Flagelo Celeste", "E) Malenia, a Espada de Miquella", "A"
        ));

        questoes.add(new Questao(
                "11 - Qual o nome da espada usada por Blaidd?",
                "A) Espada Lobo Sangrento", "B) Lâmina de Escamas de Dragão", "C) Espada Grande do Alvorecer", "D) Espada Grande de Bastardo", "E) Espada Grande do Cavaleiro Negro", "A"
        ));

        questoes.add(new Questao(
                "12 - Qual a condição para ativar o Grande Elevador de Dectus?",
                "A) Derrotar Maliketh", "B) Obter as duas metades do Medalhão de Dectus", "C) Completar a quest de Ranni", "D) Encontrar a Árvore Sagrada de Miquella", "E) Invocar o cavalo Torrente", "B"
        ));

        questoes.add(new Questao(
                "13 - Quem dá ao jogador o convite para o Festival de Radahn?",
                "A) Alexander, o Guerreiro Jarro", "B) Blaidd", "C) Jerren", "D) Seluvis", "E) Rogier", "C"
        ));

        questoes.add(new Questao(
                "14 - Quem é o portador do anel de Elden que inicia a história?",
                "A) Godfrey", "B) Radagon", "C) Marika", "D) Fia", "E) Rennala", "C"
        ));

        questoes.add(new Questao(
                "15 - Qual o nome do cavalo que Radahn monta?",
                "A) Rani", "B) Lobo da Tempestade", "C) Torrente", "D) Leonard", "E) Cervo Negro", "D"
        ));


        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println("Fim do questionário. Obrigado por participar!");
        System.out.println("Você acertou " + acertos + " de " + questoes.size() + " questões.");
        System.out.println("Você errou " + erros + " de " + questoes.size() + " questões.");

        double percentualAcertos = (double) acertos / questoes.size() * 100;
        double percentualErros = (double) erros / questoes.size() * 100;

        System.out.println("Você acertou " + String.format("%.2f", percentualAcertos) + "% das questões.");
        System.out.println("Você errou " + String.format("%.2f", percentualErros) + "% das questões.");

    }

    public static void cabecalho(){
        System.out.println("UNIFAN - Universidade Alfredo Nasser");
        System.out.println("Aluno: Antony Gabriel Moreira de Carvalho");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Boas vindas a todos!!! Bem vindo ao questionário de Elden Ring.");
        System.out.println("Neste questionário você responderá a 15 questões sobre o GOTY de 2022, passando por inimigos, armas e lore, boa sorte!!!");
        System.out.println();
    }
}
