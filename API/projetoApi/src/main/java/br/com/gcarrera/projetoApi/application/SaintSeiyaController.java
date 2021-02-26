package br.com.gcarrera.projetoApi.application;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cavaleiro")
public class SaintSeiyaController{

    private List<Personagem> listaCavaleiro = new ArrayList<Personagem>();

    @GetMapping("/listar")
    public List<Personagem> listarCavaleiro() {
        return listaCavaleiro;
    }

    @PostMapping("/adicionar/deus")
    public Personagem adicionarDeus(@RequestBody Deus deus) {
        listarCavaleiro().add(deus);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return deus;
    }

    @PostMapping("/adicionar/bronze")
    public Personagem adicionar(@RequestBody Bronze bronze) {
        listarCavaleiro().add(bronze);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return bronze;
    }

    @PostMapping("/adicionar/prata")
    public Personagem adicionar(@RequestBody Prata prata) {
        listarCavaleiro().add(prata);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return prata;
    }

    @PostMapping("/adicionar/ouro")
    public Personagem adicionar(@RequestBody Ouro ouro) {
        listarCavaleiro().add(ouro);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return ouro;
    }

    @GetMapping("/cosmo/{id}")
    public Double cosmo(@PathVariable int id){
        return listaCavaleiro.get(id).forcaCosmo();
    }

    @GetMapping("/mach/{id}")
    public Double mach(@PathVariable int id){
        return listaCavaleiro.get(id).poderMach();
    }

}
