package src;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int notasQtd= 0;

        while (nota >= 0) {
            System.out.println("Digite sua avaliação");
            nota = leitura.nextDouble();
            if (nota >= 0) {
                mediaAvaliacao += nota;

                notasQtd++;
            }
        }
        System.out.println("A média de avaliações é igual a " + mediaAvaliacao/notasQtd);

    }
}

