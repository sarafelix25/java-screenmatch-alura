public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1994;
        boolean inclusoNoPlano = true;
        double notaDoFilme = 9.7;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (inclusoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme para alugar");
        }
    }
}
