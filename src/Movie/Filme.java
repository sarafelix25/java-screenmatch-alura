public class Filme {
        String nome;
        int anoDeLancamento;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        void exibeFichaTecnica() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de Lançamento: " + anoDeLancamento);
        }

        void avalia(double nota) {
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double exibeMedia() {
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }
}