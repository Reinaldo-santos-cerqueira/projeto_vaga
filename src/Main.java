import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        pertenceAFibonacci(numero);
        System.out.print("Informe a string para ser invertida: ");
        Scanner scanner2 = new Scanner(System.in);
        String original = scanner2.nextLine();
        System.out.println("String invertida: " + inverterString(original));
        scanner.close();
        scanner2.close();
    }

    private static void pertenceAFibonacci(int num) {
        if (num == 0 || num == 1)	System.out.println(num + " pertence à sequência de Fibonacci.");
        int a = 0, b = 1;
        while (b < num) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        if (b == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    private static String inverterString(String str) {
        char[] arr = str.toCharArray();
        int esquerda = 0;
        int direita = str.length() - 1;

        while (esquerda < direita) {
            char temp = arr[esquerda];
            arr[esquerda] = arr[direita];
            arr[direita] = temp;

            esquerda++;
            direita--;
        }

        return new String(arr);
    }

}
