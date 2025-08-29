import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Matheus");
        int a = 10, b = 20;
        System.out.println("Soma:" + (a + b));
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println("Números:" + i);
        }
        int soma = 0;
        for (int i = 1; i <= 2; i++) {
            soma += i;
        }
        System.out.println("Resultado da soma de 10 + 20:" + soma);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String[] nomes = new String[1];
        for (int i = 0; i < 1; i++) {
            nomes[i] = sc.nextLine();
        }

        for (String n : nomes)  {
            System.out.println("Olá, " + n + ".");
        }


        Scanner scanner = new Scanner(System.in); int somaIdade = 0;
        for(int i = 0; i < 5; i++){ somaIdade += scanner.nextInt();}
            System.out.println("Média:" + somaIdade/5);
        scanner.close();
        }

    }


