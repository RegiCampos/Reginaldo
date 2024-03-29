import java.util.Scanner;
class Soma
{
    public static void main(String[]args)
    {
        //Declaração de variáveis
        Scanner leia = new Scanner(System.in);
        int n1, n2, soma;

        // Entrada de dados
        System.out.println("Número 1: ");
        n1 = leia.nextInt();
        System.out.println("Número 2: ");
        n2 = leia.nextInt();

        // Processamento - Soma
        soma = n1 + n2;

        // Saída dos dados
        System.out.println("A soma é:"+soma);

        leia.close();
    }
}