package br.com.bandtec.saintseiyaapi.entities;

import br.com.bandtec.saintseiyaapi.services.ProjectFlow;

import java.util.ArrayList;
import java.util.List;

public class Santuario implements ProjectFlow {

    //Atributos
    List<Personagem> listaPersonagens;

    private String nomeSantuario;
    private Integer demografia;

    //Construtor
    public Santuario(String nomeSantuario,
                     Integer demografia) {
        this.nomeSantuario = nomeSantuario;
        this.demografia = demografia;
        listaPersonagens = new ArrayList<>();
    }

    //Métodos
    @Override
    public void adicionar(Object classe) {
        if (classe instanceof Bronze)
            listaPersonagens.add((Bronze) classe);
        else if (classe instanceof Prata)
            listaPersonagens.add((Prata) classe);
        else if (classe instanceof Ouro)
            listaPersonagens.add((Ouro) classe);
        else
            listaPersonagens.add((Deus) classe);
    }

    @Override
    public void atualizar(Object classe,
                          int posicao) {
        if (classe instanceof Bronze)
            listaPersonagens.set(posicao, (Bronze) classe);
        else if (classe instanceof Prata)
            listaPersonagens.set(posicao, (Prata) classe);
        else if (classe instanceof Ouro)
            listaPersonagens.set(posicao, (Ouro) classe);
        else
            listaPersonagens.set(posicao, (Deus) classe);
    }

    @Override
    public void remover(int posicao) {
        listaPersonagens.remove(posicao);
    }

    //Getters and Setters
    public List<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public String getNomeSantuario() {
        return nomeSantuario;
    }

    public Integer getDemografia() {
        return demografia;
    }


}


