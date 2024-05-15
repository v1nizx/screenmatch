package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("Interestellar", 2014);
        meuFilme.avalia(10);
        var filmeDoPaulo = new Filme("Oppenheimer", 2023);
        filmeDoPaulo.avalia(8);
        Filme outroFilme = new Filme("Carros", 2004);
        outroFilme.avalia(10);
        Filme filme2 = new Filme("Toy Story", 1995);
        filme2.avalia(9.5);
        Serie TheLastofUs = new Serie("TheLastofUS", 2023);
        TheLastofUs.avalia(10);

        Filme f1 =  filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme2);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(TheLastofUs);
        for (Titulo item: lista){
            System.out.println(item);
            if (  item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificacao " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Robert Downey Jr.");
        buscaPorArtista.add("Paul Rudd");
        buscaPorArtista.add("Charlize Teron");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
