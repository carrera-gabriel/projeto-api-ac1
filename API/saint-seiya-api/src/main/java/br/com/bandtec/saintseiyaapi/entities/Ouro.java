package br.com.bandtec.saintseiyaapi.entities;

public class Ouro extends Cavaleiro {

    //Atributos
    private Double setimoSentido;
    private Double barreiraLuz;

    //COSNTRUTOR


    public Ouro(String nome,
                Integer batalhasVencidas,
                Integer batalhasPerdidas,
                Double velocidadeSom,
                Double velocidadeObjeto,
                Double valorBencao,
                String dataNascimento,
                String constelacao,
                Double setimoSentido,
                Double barreiraLuz) {
        super(nome,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto,
                valorBencao,
                dataNascimento,
                constelacao);
        this.setimoSentido = setimoSentido;
        this.barreiraLuz = barreiraLuz;
    }

    //MÉTODOS
    @Override
    public Double getForcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas() / super.getBatalhasPerdidas()) * 1.08) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            super.setBencaoDeus(true);
            resultado = resultado + setimoSentido;
            return resultado;
        }
    }


    @Override
    public Double getPoderMach() {
        Double valorMach = (super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.05;
        valorMach = valorMach + barreiraLuz;
        return valorMach;
    }


    //Getters and setters
    public Double getSetimoSentido() {
        return setimoSentido;
    }

    public Double getBarreiraLuz() {
        return barreiraLuz;
    }

}
