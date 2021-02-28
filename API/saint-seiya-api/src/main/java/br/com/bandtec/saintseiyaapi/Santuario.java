package br.com.bandtec.saintseiyaapi;

import java.util.ArrayList;
import java.util.List;

public class Santuario {

    //Atributos
    private List<Cavaleiro> cavaleiro;
    private List<Deus> deus;
    private String nomeSantuario;
    private String localidade;
    private Integer numeroHabitantes;

    //Construtor
    public Santuario(String nomeSantuario, String localidade, Integer numeroHabitantes) {
        this.nomeSantuario = nomeSantuario;
        this.localidade = localidade;
        this.numeroHabitantes = numeroHabitantes;
        this.cavaleiro = new ArrayList<Cavaleiro>();
        this.deus = new ArrayList<Deus>();
    }

    //Getters and Setters
    public List<Cavaleiro> getCavaleiro() {
        return cavaleiro;
    }

    public List<Deus> getDeus() {
        return deus;
    }

    public String getNomeSantuario() {
        return nomeSantuario;
    }

    public String getLocalidade() {
        return localidade;
    }

    public Integer getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void adicionaSantuario(Cavaleiro p) {
        cavaleiro.add(p);
    }

    public void setCavaleiro(List<Cavaleiro> cavaleiro) {
        this.cavaleiro = cavaleiro;
    }

    public void setDeus(List<Deus> deus) {
        this.deus = deus;
    }


    public void buscaCavaleiro(String nomeCavaleiro) {
        for (Cavaleiro c : cavaleiro) {
            if (c.getNome().equals(nomeCavaleiro)) {
                System.out.println(c);
            } else {
                System.out.println("Nome do cavaleiro não encontrado!");
            }
        }
    }

    public void adicionaSantuario(Deus d) {
        deus.add(d);
    }

    public void buscaDeus(String nomeDeus) {
        for (Deus d : deus) {
            if (d.getNome().equals(nomeDeus)) {
                System.out.println(d);
            } else {
                System.out.println("Nome do Deus não encontrado!");
            }
        }
    }

    public void exibeSantuario(List<?> p) {
        if (p.equals(cavaleiro)) {
            for (Cavaleiro c : cavaleiro) {
                System.out.println(c);
            }
        } else {
            for (Deus d : deus) {
                System.out.println(d);
            }
        }
    }

}


