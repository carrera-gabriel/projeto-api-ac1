package br.com.bandtec.saintseiyaapi.entities;

public abstract class Personagem {

    private String nome;
    private Integer batalhasVencidas;
    private Integer batalhasPerdidas;
    private Double velocidadeSom;
    private Double velocidadeObjeto;

    public Personagem(String nome,
                      Integer batalhasVencidas,
                      Integer batalhasPerdidas,
                      Double velocidadeSom,
                      Double velocidadeObjeto) {
        this.nome = nome;
        this.batalhasVencidas = batalhasVencidas;
        this.batalhasPerdidas = batalhasPerdidas;
        this.velocidadeSom = velocidadeSom;
        this.velocidadeObjeto = velocidadeObjeto;
    }

    public String getNome() {
        return nome;
    }

    public Integer getBatalhasVencidas() {
        return batalhasVencidas;
    }

    public Integer getBatalhasPerdidas() {
        return batalhasPerdidas;
    }

    public Double getVelocidadeSom() {
        return velocidadeSom;
    }

    public Double getVelocidadeObjeto() {
        return velocidadeObjeto;
    }


    public Double forcaCosmo() {
        Double resultado = 0.0;
        return resultado = ((batalhasVencidas / batalhasPerdidas) * 1.30) * 100;
    }

    public Double poderMach() {
        Double valorMach = 0.0;
        return valorMach = (getVelocidadeObjeto() / getVelocidadeSom());
    }
}
