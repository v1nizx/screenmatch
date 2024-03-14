package br.com.jt.screenmach.modelo.calculo;

import Modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulos titulos){
        this.tempoTotal += titulos.getDuracaoEmMinutos();
    }
}
