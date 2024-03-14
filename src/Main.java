import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------TARGET SISTEMAS----------");
            System.out.println("1 - Para verificar se um número está na sequência de Fibonacci");
            System.out.println("2 - Para inverter uma string");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
                    int numeroFibonacci = scanner.nextInt();
                    scanner.nextLine();
                    String resultadoFibonacci = Fibonacci.calculaFibonacci(numeroFibonacci);
                    System.out.println(resultadoFibonacci);
                    break;
                case 2:
                    System.out.print("Digite a string que deseja inverter: ");
                    String stringParaInverter = scanner.nextLine();
                    String stringInvertida = InverteString.inverterString(stringParaInverter);
                    System.out.println("String Invertida: " + stringInvertida);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, escolha novamente.");
            }
        }
    }
}
