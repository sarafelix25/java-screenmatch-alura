public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Inside Out 2");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 9.0 + 8.7) / 3;
        System.out.println(media);

        String sinopse = "Filme Top Gun\nFilme de aventura com galã dos anos 80\nMuito bom!\nAno de Lançamento " + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}