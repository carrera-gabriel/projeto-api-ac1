package br.com.bandtec.saintseiyaapi;

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

    //Construtor
    public Deus(String nome,
                Double nonoSentido,
                Double velocidadeSom,
                Double velocidadeObjeto,
                Integer batalhasVencidas,
                Integer batalhasPerdidas,
                Integer guerrasVencidas,
                Integer guerrasPerdidas) {
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

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public Boolean getArtefato() {
        return artefato;
    }

    public Double getNonoSentido() {
        return nonoSentido;
    }

    public Double getVelocidadeSom() {
        return velocidadeSom;
    }

    public Double getVelocidadeObjeto() {
        return velocidadeObjeto;
    }

    public Integer getBatalhasVencidas() {
        return batalhasVencidas;
    }

    public Integer getBatalhasPerdidas() {
        return batalhasPerdidas;
    }

    public Integer getGuerrasVencidas() {
        return guerrasVencidas;
    }

    public Integer getGuerrasPerdidas() {
        return guerrasPerdidas;
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
