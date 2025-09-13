import java.util.Scanner;

public class Input {
    public static int scanInt(String message, Scanner scan) {
        while (true) {
            try {
                System.out.print(message);
                int value = scan.nextInt();
                return value;
            } catch (Exception e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            } finally {
                scan.nextLine();
            }
        }
    }
    
    public static String scanString(String message, Scanner scan){
        while (true) {
            System.out.print(message);
            String value = scan.nextLine();
            value = value.trim();

            if (value.isEmpty()) {
                System.out.println("Valor inválido!");
            }
            else{
                return value;
            }
        }
    }

    // observa o ano dentro de um intervalo.
    public static int scanAno(String message, Scanner scan) {
        while (true) {
            int ano = scanInt(message, scan);
            if (ano >= 1800 && ano <= 2100) {
                return ano;
            } else {
                System.out.println("Ano inválido! Digite entre 1800 e 2100.");
            }
        }
    }

    // lê a placa com validação.
    public static String scanPlaca(String message, Scanner scan) {
        while (true) {
            String placa = scanString(message, scan).toUpperCase();
            if (placa.matches("^[A-Z]{3}-?\\d{4}$") || placa.matches("^[A-Z]{3}\\d[A-Z]\\d{2}$")) {
                return placa;
            } else {
                System.out.println("Placa inválida! Exemplos: ABC-1234 ou ABC1D23.");
            }
        }
    }
}