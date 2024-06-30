import br.com.alura.screenmatch.modelos;

public class Filme {
        private String nome;
        private int anoDeLancamento;
        private boolean inclusoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

        public boolean isInclusoNoPlano() {
                return inclusoNoPlano;
        }

        public int getDuracaoEmMinutos() {
                return duracaoEmMinutos;
        }


        public int getTotalDeAvaliacoes() {
                return totalDeAvaliacoes;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setInclusoNoPlano(boolean inclusoNoPlano) {
                this.inclusoNoPlano = inclusoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
                this.anoDeLancamento = anoDeLancamento;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
                this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void exibeFichaTecnica() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de Lançamento: " + anoDeLancamento);
        }

        public void avalia(double nota) {
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double exibeMedia() {
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }
}