

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Usa ponto como separador decimal

        try {
            // Túnica
            System.out.println("Informe o nome da túnica:");
            String nomeTunica = scanner.nextLine();

            System.out.println("Informe o preço da túnica (use ponto como separador decimal):");
            double precoTunica = Double.parseDouble(scanner.nextLine()); // usa nextLine() + parseDouble

            System.out.println("Informe a cor da túnica:");
            String cor = scanner.nextLine();

            System.out.println("Informe o tamanho da túnica:");
            String tamanho = scanner.nextLine();

            System.out.println("Informe o material da túnica:");
            String material = scanner.nextLine();

            Tunica tunica = new Tunica(nomeTunica, precoTunica, cor, tamanho, material);
            tunica.exibirInfo();

            // Grimório
            System.out.println("\nInforme o nome do grimório:");
            String nomeGrimorio = scanner.nextLine();

            System.out.println("Informe o preço do grimório (use ponto como separador decimal):");
            double precoGrimorio = Double.parseDouble(scanner.nextLine());

            System.out.println("Informe o autor do grimório:");
            String autor = scanner.nextLine();

            System.out.println("Informe o número de páginas do grimório:");
            int numeroPaginas = Integer.parseInt(scanner.nextLine());

            System.out.println("O grimório tem capa dura? (true/false):");
            boolean capaDura = Boolean.parseBoolean(scanner.nextLine());

            Grimorio grimorio = new Grimorio(nomeGrimorio, precoGrimorio, autor, numeroPaginas, capaDura);
            grimorio.exibirInfo();

        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada numérica inválida. Use ponto para separar decimais.");
        }

        scanner.close();
    }
}
