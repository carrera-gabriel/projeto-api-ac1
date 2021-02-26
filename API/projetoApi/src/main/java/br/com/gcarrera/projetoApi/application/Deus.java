package br.com.gcarrera.projetoApi.application;

public class Deus implements Personagem {

    //Atributos
    private String nome;
    private Boolean artefato;
    private Double nonoSentido;
    private Double velocidadeSom;
    private Double velocidadeObjeto;
    private Integer batalhasVencidas;
    private Integer batalhasPerdidas;
    private Integer guerrasVencidas;
    private Integer guerrasPerdidas;

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getArtefato() {
        return artefato;
    }

    public void setArtefato(Boolean artefato) {
        this.artefato = artefato;
    }

    public Double getNonoSentido() {
        return nonoSentido;
    }

    public void setNonoSentido(Double nonoSentido) {
        this.nonoSentido = nonoSentido;
    }

    public Double getVelocidadeSom() {
        return velocidadeSom;
    }

    public void setVelocidadeSom(Double velocidadeSom) {
        this.velocidadeSom = velocidadeSom;
    }

    public Double getVelocidadeObjeto() {
        return velocidadeObjeto;
    }

    public void setVelocidadeObjeto(Double velocidadeObjeto) {
        this.velocidadeObjeto = velocidadeObjeto;
    }

    public Integer getBatalhasVencidas() {
        return batalhasVencidas;
    }

    public void setBatalhasVencidas(Integer batalhasVencidas) {
        this.batalhasVencidas = batalhasVencidas;
    }

    public Integer getBatalhasPerdidas() {
        return batalhasPerdidas;
    }

    public void setBatalhasPerdidas(Integer batalhasPerdidas) {
        this.batalhasPerdidas = batalhasPerdidas;
    }

    public Integer getGuerrasVencidas() {
        return guerrasVencidas;
    }

    public void setGuerrasVencidas(Integer guerrasVencidas) {
        this.guerrasVencidas = guerrasVencidas;
    }

    public Integer getGuerrasPerdidas() {
        return guerrasPerdidas;
    }

    public void setGuerrasPerdidas(Integer guerrasPerdidas) {
        this.guerrasPerdidas = guerrasPerdidas;
    }

    //Construtor
    public Deus(String nome, Double nonoSentido, Double velocidadeSom, Double velocidadeObjeto,
                Integer batalhasVencidas, Integer batalhasPerdidas, Integer guerrasVencidas, Integer guerrasPerdidas) {
        this.nome = nome;
        this.artefato = false;
        this.nonoSentido = nonoSentido;
        this.velocidadeSom = velocidadeSom;
        this.velocidadeObjeto = velocidadeObjeto;
        this.batalhasVencidas = batalhasVencidas;
        this.batalhasPerdidas = batalhasPerdidas;
        this.guerrasVencidas = guerrasVencidas;
        this.guerrasPerdidas = guerrasPerdidas;
    }

    // Métodos
    @Override
    public Double forcaCosmo() {
        Double resultado = ((batalhasVencidas + guerrasVencidas) / (batalhasPerdidas + guerrasPerdidas) * 1.55) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            artefato = true;
            resultado = resultado + nonoSentido;
            return resultado;
        }
    }

    @Override
    public Double poderMach() {
        return ((velocidadeObjeto / velocidadeSom) * 1.55) + nonoSentido;
    }


}
