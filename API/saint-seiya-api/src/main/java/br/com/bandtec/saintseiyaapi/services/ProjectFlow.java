package br.com.bandtec.saintseiyaapi.services;

public interface ProjectFlow {

    public void adicionar(Object classe);
    public void atualizar(Object classe, int posicao);
    public void remover(int posicao);

}
