package br.com.bandtec.saintseiyaapi.entities;

public class Deus extends Personagem {

    //Atributos
    private Boolean artefato;
    private Double nonoSentido;
    private Integer guerrasVencidas;
    private Integer guerrasPerdidas;

    //Construtor
    public Deus(String nome,
                Integer batalhasVencidas,
                Integer batalhasPerdidas,
                Double velocidadeSom,
                Double velocidadeObjeto,
                Double nonoSentido,
                Integer guerrasVencidas,
                Integer guerrasPerdidas) {
        super(nome,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto
        );
        this.artefato = false;
        this.nonoSentido = nonoSentido;
        this.guerrasVencidas = guerrasVencidas;
        this.guerrasPerdidas = guerrasPerdidas;
    }

    // Métodos
    @Override
    public Double getForcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() + guerrasVencidas) / (super.getBatalhasPerdidas() + guerrasPerdidas) * 1.30) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            artefato = true;
            resultado = resultado + nonoSentido;
            return resultado;
        }
    }

    @Override
    public Double getPoderMach() {
        return ((super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.15);
    }

    //Getters and setters
    public Boolean getArtefato() {
        return artefato;
    }

    public Double getNonoSentido() {
        return nonoSentido;
    }

    public Integer getGuerrasVencidas() {
        return guerrasVencidas;
    }

    public Integer getGuerrasPerdidas() {
        return guerrasPerdidas;
    }

}
