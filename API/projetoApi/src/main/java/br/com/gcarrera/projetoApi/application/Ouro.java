package br.com.gcarrera.projetoApi.application;

public class Ouro extends Cavaleiro {

    //Atributos
    private Double setimoSentido;
    private Double barreiraLuz;

    //Getters and setters
    public Double getSetimoSentido() {
        return setimoSentido;
    }

    public void setSetimoSentido(Double setimoSentido) {
        this.setimoSentido = setimoSentido;
    }

    public Double getBarreiraLuz() {
        return barreiraLuz;
    }

    public void setBarreiraLuz(Double barreiraLuz) {
        this.barreiraLuz = barreiraLuz;
    }

    //COSNTRUTOR
    public Ouro(String nome, String nacionalidade, String dataNascimento, String constelacao, Integer batalhasVencidas,
                Integer batalhasPerdidas, Double velocidadeSom, Double velocidadeObjeto, Double setimoSentido,
                Double barreiraLuz) {
        super(nome, nacionalidade, dataNascimento, constelacao, batalhasVencidas, batalhasPerdidas, velocidadeSom,
                velocidadeObjeto);
        this.setimoSentido = setimoSentido;
        this.barreiraLuz = barreiraLuz;
    }

    //MÉTODOS
    @Override
    public Double forcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.45) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            super.setBencaoDeus(true);
            resultado = resultado + setimoSentido;
            return resultado;
        }
    }

    @Override
    public Double poderMach() {
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.35;
        valorMach = valorMach + barreiraLuz;
        return valorMach;
    }

}
