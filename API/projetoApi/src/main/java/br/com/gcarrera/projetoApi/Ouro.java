package br.com.gcarrera.projetoApi;

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

    //Construtor
    public Ouro(String nome, String nacionalidade, String dataNascimento, String constelacao, Integer batalhasVencidas,
                Integer batalhasPerdidas, Double velocidadeSom, Double velocidadeObjeto, Double setimoSentido,
                Double barreiraLuz) {
        super(nome, nacionalidade, dataNascimento, constelacao, batalhasVencidas, batalhasPerdidas, velocidadeSom,
                velocidadeObjeto);
        this.setimoSentido = setimoSentido;
        this.barreiraLuz = barreiraLuz;
    }


}
