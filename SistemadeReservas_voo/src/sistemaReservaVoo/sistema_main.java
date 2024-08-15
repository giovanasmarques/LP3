package sistemaReservaVoo;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class sistema_main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do voo ao usuário
        System.out.println("Digite o número do voo:");
        String numeroVoo = scanner.nextLine();

        System.out.println("Digite a capacidade total do voo:");
        int capacidadeTotal = scanner.nextInt();

        voo voo = new voo(numeroVoo, capacidadeTotal);

        // Solicita o número de reservas que o usuário deseja simular
        System.out.println("Digite o número de reservas que deseja tentar:");
        int numeroDeReservas = scanner.nextInt();

        // Configuração do ExecutorService
        System.out.println("Quantidade de usuários simultâneos tentando reservar:");
        int numeroDeThreads = scanner.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(numeroDeThreads);

        for (int i = 0; i < numeroDeReservas; i++) {
            executor.execute(new Reserva(voo));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processo de reservas concluído.");
        System.out.println("Assentos reservados: " + voo.getAssentosReservados() + "/" + voo.getCapacidadeTotal());

        scanner.close();
    }
}


