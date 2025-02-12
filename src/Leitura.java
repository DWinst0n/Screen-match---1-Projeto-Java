package src;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito, o ano de lançamento e a avaliação de 0 a 10");

        String filme = leitura.nextLine();
        String mensagemFilme = String.format("Seu filme favorito é %s", filme);

        int anoDeLancamento = leitura.nextInt();
        String mensagemLancamento = String.format("O Filme %s, lançou no ano %d", filme, anoDeLancamento);

        Double avaliacaoUsuario = leitura.nextDouble();
        String mensagemAvaliacao = String.format("De 0 a 10, o usuário avalia o filme %s, como um filme nota %.2f", filme, avaliacaoUsuario);

        System.out.println(mensagemFilme);
        System.out.println(mensagemLancamento);
        System.out.println(mensagemAvaliacao);
    }
}
