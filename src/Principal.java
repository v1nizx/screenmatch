import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;
import br.com.jt.screenmach.modelo.calculo.CalculadoraDeTempo;
import br.com.jt.screenmach.modelo.calculo.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Interestellar");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(165);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
       // meuFilme.somaDasAvaliacoes = 10;
       // meuFilme.totalDeAvaliacoes = 1;
       // System.out.println(meuFilme.pegaMedia());

        Serie TheLastofUs = new Serie();
       TheLastofUs.setNome("TheLastofUS");
       TheLastofUs.setAnoDeLancamento(2023);
       TheLastofUs.exibeFichaTecnica();
       TheLastofUs.setTemporadas(1);
       TheLastofUs.setEpisodiosPorTemporada(8);
       TheLastofUs.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratonar The Last Of Us:" + TheLastofUs.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Carros");
        outroFilme.setAnoDeLancamento(2004);
        outroFilme.setDuracaoEmMinutos(145);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(TheLastofUs);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro =  new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(String.valueOf(TheLastofUs));
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}