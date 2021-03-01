package br.com.bandtec.saintseiyaapi.entities;

public class Prata extends Cavaleiro {

    //Atributos
    private Double cosmoMedio;
    private Double barreiraSom;

    //Construtor


    public Prata(String nome,
                 Integer batalhasVencidas,
                 Integer batalhasPerdidas,
                 Double velocidadeSom,
                 Double velocidadeObjeto,
                 Double valorBencao,
                 String dataNascimento,
                 String constelacao,
                 Double cosmoMedio,
                 Double barreiraSom) {
        super(nome,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto,
                valorBencao,
                dataNascimento,
                constelacao);
        this.cosmoMedio = cosmoMedio;
        this.barreiraSom = barreiraSom;
    }

    //Getters and Setters
    public Double getCosmoMedio() {
        return cosmoMedio;
    }

    public Double getBarreiraSom() {
        return barreiraSom;
    }

    //MÉTODOS
    @Override
    public Double forcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.06) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            super.setBencaoDeus(true);
            resultado = resultado + cosmoMedio;
            return resultado;
        }
    }

    @Override
    public Double poderMach() {
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom());
        valorMach = valorMach + barreiraSom;
        return valorMach;
    }
}
