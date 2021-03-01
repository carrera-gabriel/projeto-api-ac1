package br.com.bandtec.saintseiyaapi.entities;

public class Bronze extends Cavaleiro {

    //Atributos
    private Double cosmoBaixo;
    private Boolean arma;

    //Construtor
    public Bronze(String nome,
                  Integer batalhasVencidas,
                  Integer batalhasPerdidas,
                  Double velocidadeSom,
                  Double velocidadeObjeto,
                  Double valorBencao,
                  String dataNascimento,
                  String constelacao,
                  Double cosmoBaixo) {
        super(nome,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto,
                valorBencao,
                dataNascimento,
                constelacao);
        this.cosmoBaixo = cosmoBaixo;
        arma = false;
    }

    //MÉTODOS
    @Override
    public Double getForcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.05) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            super.setBencaoDeus(true);
            arma = true;
            resultado = resultado + cosmoBaixo;
            return resultado;
        }
    }

    @Override
    public Double getPoderMach() {
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom());
        return valorMach;
    }

    //Getters and Setters
    public Double getCosmoBaixo() {
        return cosmoBaixo;
    }

    public Boolean getArma() {
        return arma;
    }

}
