package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Número do contrato: ");
        Integer contractNumber = sc.nextInt();

        System.out.print("Data (dd/MM/aaaa): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor total do contrato: ");
        Double totalValue = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        Integer months = sc.nextInt();

        sc.close();
    }
}
