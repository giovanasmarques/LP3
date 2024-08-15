package sistemaReservaVoo;

public class Reserva implements Runnable {

	private voo voo;

    public Reserva(voo voo) {
        this.voo = voo;
    }

    @Override
    public void run() {
        voo.reservarAssento();
    }

}
