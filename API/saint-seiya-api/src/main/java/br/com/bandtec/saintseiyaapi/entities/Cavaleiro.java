package br.com.bandtec.saintseiyaapi.entities;

public abstract class Cavaleiro extends Personagem {

    //Atributos
    private Boolean bencaoDeus;
    private Double valorBencao;
    private String dataNascimento;
    private String constelacao;

    //Construtor

    public Cavaleiro(String nome,
                     Integer batalhasVencidas,
                     Integer batalhasPerdidas,
                     Double velocidadeSom,
                     Double velocidadeObjeto,
                     Double valorBencao,
                     String dataNascimento,
                     String constelacao) {
        super(nome,
                batalhasVencidas,
                batalhasPerdidas,
                velocidadeSom,
                velocidadeObjeto);
        bencaoDeus = false;
        this.valorBencao = valorBencao;
        this.dataNascimento = dataNascimento;
        this.constelacao = constelacao;
    }


    //Getters and setters


    public Boolean getBencaoDeus() {
        return bencaoDeus;
    }

    public void setBencaoDeus(Boolean bencaoDeus) {
        this.bencaoDeus = bencaoDeus;
    }

    public Double getValorBencao() {
        return valorBencao;
    }

    public void setValorBencao(Double valorBencao) {
        this.valorBencao = valorBencao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void setConstelacao(String constelacao) {
        this.constelacao = constelacao;
    }

    //Métodos
    public Double forcaCosmo() {
        Double resultado = ((super.getBatalhasVencidas()) / (super.getBatalhasPerdidas()) * 1.10) * 100;
        if (resultado <= 33) {
            return resultado;
        } else {
            bencaoDeus = true;
            resultado = resultado + valorBencao;
            return resultado;
        }
    }

    @Override
    public Double poderMach() {
        return ((super.getVelocidadeObjeto() / super.getVelocidadeSom()) * 1.10);
    }

}

