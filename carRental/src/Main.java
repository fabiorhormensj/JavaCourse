import model.entities.CarRental;
import model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/aaaa hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Retorno (dd/MM/aaaa hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        sc.close();
    }
}