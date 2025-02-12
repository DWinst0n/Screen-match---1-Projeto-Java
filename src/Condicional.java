package src;

public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2025) {
            System.out.println("Lançamento recente");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("O cliente pode assistir sem pagar");
        } else {
            System.out.println("deve pagar a locação");
        }

    }
}
