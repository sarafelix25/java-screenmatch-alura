import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Shrek");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.2);
        meuFilme.avalia(7.4);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.exibeMedia());
        // meuFilme.somaDasAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.exibeMedia());
    }
}