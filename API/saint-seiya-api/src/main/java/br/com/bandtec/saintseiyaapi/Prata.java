package br.com.bandtec.saintseiyaapi;

public class Prata extends Cavaleiro {

    //Atributos
    private Double cosmoMedio;
    private Double barreiraSom;

    //Construtor
    public Prata(String nome,
                 String nacionalidade,
                 String dataNascimento,
                 String constelacao,
                 Integer batalhasVencidas,
                 Integer batalhasPerdidas,
                 Double velocidadeSom,
                 Double velocidadeObjeto,
                 Double cosmoMedio,
                 Double barreiraSom) {
        super(nome,
                nacionalidade,
                dataNascimento,
                constelacao,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto);
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
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.25) * 100;
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
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.25;
        valorMach = valorMach + barreiraSom;
        return valorMach;
    }
}
