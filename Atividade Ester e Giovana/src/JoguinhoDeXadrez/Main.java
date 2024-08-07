package JoguinhoDeXadrez;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.inicializarTabuleiro();

        // Teste de movimentações
        System.out.println(tabuleiro.moverPeca(0, 4, 0, 5)); // Movimento inválido para o Rei, esperado: false
        System.out.println(tabuleiro.moverPeca(1, 3, 3, 3)); // Movimento válido para o Peão, esperado: true

        // Movimentações adicionais para testar outras peças
        Peca rei = new Rei(0, 0);
        Peca rainha = new Rainha(1, 1);

        tabuleiro.adicionarPeca(rei, 0, 0);
        tabuleiro.adicionarPeca(rainha, 1, 1);

        System.out.println(tabuleiro.moverPeca(0, 0, 1, 1)); // Movimento inválido para o Rei, esperado: false
        System.out.println(tabuleiro.moverPeca(1, 1, 3, 3)); // Movimento válido para a Rainha, esperado: true
    }
}
