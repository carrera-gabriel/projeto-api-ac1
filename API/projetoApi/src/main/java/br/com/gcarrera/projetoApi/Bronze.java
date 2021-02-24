package br.com.gcarrera.projetoApi;

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

    //Métodos
    @Override
    public Double forcaCosmo() {
        return super.forcaCosmo() + cosmoBaixo;
    }

    public String leitorArma() {
        if (arma) {
            return "O(a) cavaleiro(a) " + super.getNome() + " tem uma arma.";
        } else {
            return "O(a) cavaleiro(a) " + super.getNome() + " não tem uma arma.";
        }
    }

}
