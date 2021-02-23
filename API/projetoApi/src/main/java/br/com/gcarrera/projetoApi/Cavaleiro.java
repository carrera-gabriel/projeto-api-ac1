package br.com.gcarrera.projetoApi;

public abstract class Cavaleiro implements Personagem{

    //Atributos
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    private Boolean bencaoDeus;
    private Integer batalhasVencidas;
    private Integer batalhasPerdidas;
    private Double velocidadeSom;
    private Double velocidadeObjeto;

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public void setBatalhasVencidas(Integer batalhasVencidas) {
        this.batalhasVencidas = batalhasVencidas;
    }

    public Integer getBatalhasPerdidas() {
        return batalhasPerdidas;
    }

    public void setBatalhasPerdidas(Integer batalhasPerdidas) {
        this.batalhasPerdidas = batalhasPerdidas;
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

    //Construtor
    public Cavaleiro(String nome, String nacionalidade, String dataNascimento, Integer batalhasVencidas, Integer batalhasPerdidas, Double velocidadeSom, Double velocidadeObjeto) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.bencaoDeus = true;
        this.batalhasVencidas = batalhasVencidas;
        this.batalhasPerdidas = batalhasPerdidas;
        this.velocidadeSom = velocidadeSom;
        this.velocidadeObjeto = velocidadeObjeto;
    }

    //Métodos
    @Override
    public Double forcaCosmo() {
        Double resultado = ((batalhasVencidas / batalhasPerdidas) * 1.15) * 100;
        if (resultado <= 33) {
            System.out.println("O(a) cavaleiro(a) " + nome + " não recebeu ajuda dos deuses!");
            return resultado;
        } else {
            bencaoDeus = true;
            System.out.println("O(a) cavaleiro(a) " + nome + " obteve ajuda dos deuses, têm o poder de cosmo equivalente a " + resultado + "%.");
            return resultado;
        }
    }

    public String leitorBencaoDeus() {
        if (bencaoDeus) {
            return "O(a) cavaleiro(a) " + nome + " foi abençoado pelos deuses.";
        } else {
            return "O(a) cavaleiro(a) " + nome + " não foi abençoado pelos deuses.";
        }
    }

    @Override
    public Double poderMach() {
        return (velocidadeObjeto / velocidadeSom) * 1.35;
    }

    @Override
    public String toString() {
        return "Cavaleiro{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bencaoDeus=" + leitorBencaoDeus() +
                ", batalhasVencidas=" + batalhasVencidas +
                ", batalhasPerdidas=" + batalhasPerdidas +
                ", velocidadeSom=" + velocidadeSom +
                ", velocidadeObjeto=" + velocidadeObjeto +
                ", forcaCosmo=" + forcaCosmo() +
                ", poderMach=" + poderMach() +
                '}';
    }
}

