package br.com.gcarrera.projetoApi;

public class Prata extends Cavaleiro {

    //Atributos
    private Double cosmoMedio;
    private Double barreiraSom;

    //Getters and Setters
    public Double getCosmoMedio() {
        return cosmoMedio;
    }

    public void setCosmoMedio(Double cosmoMedio) {
        this.cosmoMedio = cosmoMedio;
    }

    public Double getBarreiraSom() {
        return barreiraSom;
    }

    public void setBarreiraSom(Double barreiraSom) {
        this.barreiraSom = barreiraSom;
    }

    //Construtor
    public Prata(String nome, String nacionalidade, String dataNascimento, String constelacao, Integer batalhasVencidas,
                 Integer batalhasPerdidas, Double velocidadeSom, Double velocidadeObjeto, Double cosmoMedio,
                 Double barreiraSom) {
        super(nome, nacionalidade, dataNascimento, constelacao, batalhasVencidas, batalhasPerdidas, velocidadeSom,
                velocidadeObjeto);
        this.cosmoMedio = cosmoMedio;
        this.barreiraSom = barreiraSom;
    }

    //Métodos
    @Override
    public Double forcaCosmo() {
        return super.forcaCosmo() + cosmoMedio;
    }

    @Override
    public Double poderMach() {
        return super.poderMach() + barreiraSom;
    }

}
