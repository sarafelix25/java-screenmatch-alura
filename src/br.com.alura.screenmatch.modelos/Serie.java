import br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epPorTemporada;
    private int minutosPorEP;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinutosPorEP() {
        return minutosPorEP;
    }

    public void setMinutosPorEP(int minutosPorEP) {
        this.minutosPorEP = minutosPorEP;
    }
}
