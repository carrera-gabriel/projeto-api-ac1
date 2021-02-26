package br.com.gcarrera.projetoApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cavaleiro")
public class SaintSeiyaController{

    private List<Cavaleiro> listaCavaleiro = new ArrayList<Cavaleiro>();

    @GetMapping("/listar")
    public List<Cavaleiro> listarCavaleiro() {
        return listaCavaleiro;
    }

    @PostMapping("/adicionar")
    public Cavaleiro adicionar(@RequestBody Ouro ouro) {
        listarCavaleiro().add(ouro);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return ouro;
    }

    @GetMapping("/cosmo/{id}")
    public Double cosmo(@PathVariable Integer id){
        return listaCavaleiro.get(id).forcaCosmo();
    }

    @GetMapping("/mach/{id}")
    public Double mach(@PathVariable Integer id){
        return listaCavaleiro.get(id).poderMach();
    }

}
