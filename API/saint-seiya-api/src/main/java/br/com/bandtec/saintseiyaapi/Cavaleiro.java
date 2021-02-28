package br.com.bandtec.saintseiyaapi;

import java.util.List;

public abstract class Cavaleiro implements Personagem {

    //Atributos
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    private String constelacao;
    private Boolean bencaoDeus;
    private Integer batalhasVencidas;
    private Integer batalhasPerdidas;
    private Double velocidadeSom;
    private Double velocidadeObjeto;

    //Construtor
    public Cavaleiro(String nome,
                     String nacionalidade,
                     String dataNascimento,
                     String constelacao,
                     Integer batalhasVencidas,
                     Integer batalhasPerdidas,
                     Double velocidadeSom,
                     Double velocidadeObjeto) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.constelacao = constelacao;
        this.bencaoDeus = false;
        this.batalhasVencidas = batalhasVencidas;
        this.batalhasPerdidas = batalhasPerdidas;
        this.velocidadeSom = velocidadeSom;
        this.velocidadeObjeto = velocidadeObjeto;
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getConstelacao() {
        return constelacao;
    }

    public Boolean getBencaoDeus() {
        return bencaoDeus;
    }

    public void setBencaoDeus(Boolean bencaoDeus) {
        this.bencaoDeus = bencaoDeus;
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



}

