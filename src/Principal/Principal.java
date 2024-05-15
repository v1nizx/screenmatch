package Principal;

import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;
import br.com.jt.screenmach.calculos.CalculadoraDeTempo;
import br.com.jt.screenmach.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
            Filme meuFilme = new Filme("Interestellar", 2014);
        meuFilme.setDuracaoEmMinutos(165);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


            Serie TheLastofUs = new Serie("TheLastofUS", 2023);
       TheLastofUs.exibeFichaTecnica();
       TheLastofUs.setTemporadas(1);
       TheLastofUs.setEpisodiosPorTemporada(8);
       TheLastofUs.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratonar The Last Of Us:" + TheLastofUs.getDuracaoEmMinutos());

             Filme outroFilme = new Filme("Carros", 2004);
        outroFilme.setDuracaoEmMinutos(145);
        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(10);
        outroFilme.avalia(7);
        outroFilme.avalia(8);
        System.out.println("Total de avaliacoes:" + outroFilme.getTotalDeAvaliacoes());
        System.out.println(outroFilme.pegaMedia());

            Filme filme2 = new Filme("Toy Story", 1995);
        filme2.setDuracaoEmMinutos(85);
        filme2.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(TheLastofUs);
        calculadora.inclui(outroFilme);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro =  new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(String.valueOf(TheLastofUs));
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Oppenheimer", 2023);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}