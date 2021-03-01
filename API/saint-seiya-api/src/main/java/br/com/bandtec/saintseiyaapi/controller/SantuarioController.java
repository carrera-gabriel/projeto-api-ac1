package br.com.bandtec.saintseiyaapi.controller;

import br.com.bandtec.saintseiyaapi.entities.*;
import org.springframework.web.bind.annotation.*;

import static br.com.bandtec.saintseiyaapi.injection.InjectGlobal.getLocalidade;

@RestController
@RequestMapping("/santuario")
public class SantuarioController {

    Localidade localidade = getLocalidade();

    @PostMapping("/deus")
    public void adicionaDeus(@RequestBody Personagem personagem) {
        localidade.adicionar(personagem);
    }

    @PostMapping("/ouro")
    public void adicionaOuro(@RequestBody Ouro ouro) {
        localidade.adicionar(ouro);
    }

    @PostMapping("/prata")
    public void adicionaPrata(@RequestBody Prata prata) {
        localidade.adicionar(prata);
    }

    @PostMapping("/bronze")
    public void adicionaBronze(@RequestBody Bronze bronze) {
        localidade.adicionar(bronze);
    }



    @PutMapping("/deus/{posicao}")
    public void alteraDeus(@RequestBody Deus deus, int posicao) {
        localidade.atualizar(deus, posicao);
    }

    @PutMapping("/ouro/{posicao}")
    public void alteraOuro(@RequestBody Ouro ouro, int posicao) {
        localidade.atualizar(ouro, posicao);
    }

    @PutMapping("/prata/{posicao}")
    public void alteraPrata(@RequestBody Prata prata, int posicao) {
        localidade.atualizar(prata, posicao);
    }

    @PutMapping("/bronze/{posicao}")
    public void alteraBronze(@RequestBody Bronze bronze, int posicao) {
        localidade.atualizar(bronze, posicao);
    }


    @DeleteMapping ("/{posicao}")
    public void removePersonagem(int posicao) {
        localidade.remover(posicao);
    }

}
