package sistemaReservaVoo;

public class voo {

	private String numeroVoo;
    private int capacidadeTotal;
    private int assentosReservados;

    public voo(String numeroVoo, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosReservados = 0;
    }

    public synchronized boolean reservarAssento() {
        if (assentosReservados < capacidadeTotal) {
            assentosReservados++;
            System.out.println("Assento reservado com sucesso no voo " + numeroVoo + ". Total de assentos reservados: " + assentosReservados);
            return true;
        } else {
            System.out.println("Não foi possível reservar o assento. Voo " + numeroVoo + " está lotado.");
            return false;
        }
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }

}
