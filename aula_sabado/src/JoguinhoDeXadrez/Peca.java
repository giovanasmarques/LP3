package JoguinhoDeXadrez;

abstract class Peca {
    protected int x, y;

    public Peca(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean mover(int novoX, int novoY, Peca[][] tabuleiro);
}

class Rei extends Peca {
    public Rei(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        if (Math.abs(novoX - x) <= 1 && Math.abs(novoY - y) <= 1) {
            if (tabuleiro[novoX][novoY] == null || !(tabuleiro[novoX][novoY] instanceof Rei)) {
                x = novoX;
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Rainha extends Peca {
    public Rainha(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        if (novoX == x || novoY == y || Math.abs(novoX - x) == Math.abs(novoY - y)) {
            if (tabuleiro[novoX][novoY] == null || !(tabuleiro[novoX][novoY] instanceof Rainha)) {
                x = novoX;
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Bispo extends Peca {
    public Bispo(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        if (Math.abs(novoX - x) == Math.abs(novoY - y)) {
            if (tabuleiro[novoX][novoY] == null || !(tabuleiro[novoX][novoY] instanceof Bispo)) {
                x = novoX;
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Cavalo extends Peca {
    public Cavalo(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        if ((Math.abs(novoX - x) == 2 && Math.abs(novoY - y) == 1) || 
            (Math.abs(novoX - x) == 1 && Math.abs(novoY - y) == 2)) {
            if (tabuleiro[novoX][novoY] == null || !(tabuleiro[novoX][novoY] instanceof Cavalo)) {
                x = novoX;
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Torre extends Peca {
    public Torre(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        if (novoX == x || novoY == y) {
            if (tabuleiro[novoX][novoY] == null || !(tabuleiro[novoX][novoY] instanceof Torre)) {
                x = novoX;
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Peao extends Peca {
    public Peao(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY, Peca[][] tabuleiro) {
        int direction = (x == 1) ? 1 : -1; // Peão branco sobe, Peão preto desce

        // Movimento para frente
        if (novoX == x && (novoY - y == direction || (y == 1 && novoY - y == 2 * direction))) {
            if (tabuleiro[novoX][novoY] == null) {
                y = novoY;
                return true;
            }
        }
        return false;
    }
}

class Tabuleiro {
    private Peca[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca, int x, int y) {
        tabuleiro[x][y] = peca;
    }

    public boolean moverPeca(int x, int y, int novoX, int novoY) {
        if (!isPosicaoValida(x, y) || !isPosicaoValida(novoX, novoY)) {
            return false;
        }
        Peca peca = tabuleiro[x][y];
        if (peca != null && peca.mover(novoX, novoY, tabuleiro)) {
            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;
            return true;
        }
        return false;
    }

    private boolean isPosicaoValida(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public void inicializarTabuleiro() {
        // Adicionar todas as peças nas posições iniciais
        adicionarPeca(new Rei(0, 4), 0, 4);
        adicionarPeca(new Rainha(0, 3), 0, 3);
        adicionarPeca(new Torre(0, 0), 0, 0);
        adicionarPeca(new Torre(0, 7), 0, 7);
        adicionarPeca(new Bispo(0, 2), 0, 2);
        adicionarPeca(new Bispo(0, 5), 0, 5);
        adicionarPeca(new Cavalo(0, 1), 0, 1);
        adicionarPeca(new Cavalo(0, 6), 0, 6);
        for (int i = 0; i < 8; i++) {
            adicionarPeca(new Peao(1, i), 1, i);
        }
        // Adicionar peças do lado oposto
        adicionarPeca(new Rei(7, 4), 7, 4);
        adicionarPeca(new Rainha(7, 3), 7, 3);
        adicionarPeca(new Torre(7, 0), 7, 0);
        adicionarPeca(new Torre(7, 7), 7, 7);
        adicionarPeca(new Bispo(7, 2), 7, 2);
        adicionarPeca(new Bispo(7, 5), 7, 5);
        adicionarPeca(new Cavalo(7, 1), 7, 1);
        adicionarPeca(new Cavalo(7, 6), 7, 6);
        for (int i = 0; i < 8; i++) {
            adicionarPeca(new Peao(6, i), 6, i);
        }
    }
}
