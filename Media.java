import java.util.Scanner;
class Media {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double n1, n2, n3, n4, media;

        System.out.print("Nota 1: ");
        n1 = leia.nextDouble();
        System.out.println("Nota 2: ");
        n2 = leia.nextDouble();
        System.out.println("Nota 3: ");
        n3 = leia.nextDouble();
        System.out.println("Nota 4: ");
        n4 = leia.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Média é: ");
        System.out.println(media);

        // Estrutura de controle - de decisão
        if (media >=6) // teste de verdadeiro ou falso
        {
            System.out.println("AP"); // se for verdadeiro
        }
        else
        {
            System.out.println("RP"); // sefor falso
        }
    }
}