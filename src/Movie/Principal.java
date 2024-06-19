public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Shrek";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.2);
        meuFilme.avalia(7.4);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.exibeMedia());
    }
}