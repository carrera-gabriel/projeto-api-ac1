package br.com.gcarrera.projetoApi.application;

public class Bronze extends Cavaleiro {

    //Atributos
    private Double cosmoBaixo;
    private Boolean arma;

    //Getters and Setters
    public Double getCosmoBaixo() {
        return cosmoBaixo;
    }

    public void setCosmoBaixo(Double cosmoBaixo) {
        this.cosmoBaixo = cosmoBaixo;
    }

    public Boolean getArma() {
        return arma;
    }

    public void setArma(Boolean arma) {
        this.arma = arma;
    }

    // Construtor
    public Bronze(String nome, String nacionalidade, String dataNascimento, String constelacao, Integer batalhasVencidas,
                  Integer batalhasPerdidas, Double velocidadeSom, Double velocidadeObjeto, Double cosmoBaixo) {
        super(nome, nacionalidade, dataNascimento, constelacao, batalhasVencidas, batalhasPerdidas, velocidadeSom,
                velocidadeObjeto);
        this.cosmoBaixo = cosmoBaixo;
        this.arma = true;
    }

    //MÉTODOS
    @Override
    public Double forcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.35) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            super.setBencaoDeus(true);
            arma = false;
            resultado = resultado + cosmoBaixo;
            return resultado;
        }
    }

    @Override
    public Double poderMach() {
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.15;
        return valorMach;
    }

}