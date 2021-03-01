package br.com.bandtec.saintseiyaapi.entities;

import br.com.bandtec.saintseiyaapi.services.ProjectFlow;

import java.util.ArrayList;
import java.util.List;

public class Localidade implements ProjectFlow {

    List<Santuario> listaSantuarios;

    public List<Santuario> getListaSantuarios() {
        return listaSantuarios;
    }

    public Santuario getSantuario(int posicao) {
        return listaSantuarios.get(posicao);
    }

    public Localidade() {
        this.listaSantuarios = new ArrayList<>();
    }

    @Override
    public void adicionar(Object classe) {
        listaSantuarios.add((Santuario) classe);
    }

    @Override
    public void atualizar(Object classe, int posicao) {
        listaSantuarios.set(posicao, (Santuario) classe);
    }

    @Override
    public void remover(int posicao) {
        listaSantuarios.remove(posicao);
    }
}
