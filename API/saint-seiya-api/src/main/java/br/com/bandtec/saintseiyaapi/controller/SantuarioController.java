package br.com.bandtec.saintseiyaapi.controller;

import br.com.bandtec.saintseiyaapi.entities.*;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.bandtec.saintseiyaapi.injection.InjectGlobal.getLocalidade;

@RestController
@RequestMapping("/santuario")
public class SantuarioController {

    Localidade localidade = getLocalidade();

    @GetMapping("/{posicao}")
    public List<Personagem> buscar(@PathVariable int posicao) {
        return localidade.getSantuario(posicao).getListaPersonagens();
    }

    @PostMapping("/deus/{posicao}")
    public void adicionaDeus(@RequestBody Deus deus,
                             @PathVariable int posicao) {
        localidade.getSantuario(posicao).adicionar(deus);
    }

    @PostMapping("/ouro/{posicao}")
    public void adicionaOuro(@RequestBody Ouro ouro,
                             @PathVariable int posicao) {
        localidade.getSantuario(posicao).adicionar(ouro);
    }

    @PostMapping("/prata/{posicao}")
    public void adicionaPrata(@RequestBody Prata prata,
                              @PathVariable int posicao) {
        localidade.getSantuario(posicao).adicionar(prata);
    }

    @PostMapping("/bronze/{posicao}")
    public void adicionaBronze(@RequestBody Bronze bronze,
                               @PathVariable int posicao) {
        localidade.getSantuario(posicao).adicionar(bronze);
    }

    @PutMapping("/deus/{posicaoSantuario}/{posicaoPersonagem}")
    public void alteraDeus(@RequestBody Deus deus,
                           @PathVariable int posicaoSantuario,
                           @PathVariable int posicaoPersonagem) {
        localidade.getSantuario(posicaoSantuario).atualizar(deus, posicaoPersonagem);
    }

    @PutMapping("/ouro/{posicaoSantuario}/{posicaoPersonagem}")
    public void alteraOuro(@RequestBody Ouro ouro,
                           @PathVariable int posicaoSantuario,
                           @PathVariable int posicaoPersonagem) {
        localidade.getSantuario(posicaoSantuario).atualizar(ouro, posicaoPersonagem);
    }

    @PutMapping("/prata/{posicaoSantuario}/{posicaoPersonagem}")
    public void alteraPrata(@RequestBody Prata prata,
                            @PathVariable int posicaoSantuario,
                            @PathVariable int posicaoPersonagem) {
        localidade.getSantuario(posicaoSantuario).atualizar(prata, posicaoPersonagem);
    }

    @PutMapping("/bronze/{posicaoSantuario}/{posicaoPersonagem}")
    public void alteraBronze(@RequestBody Bronze bronze,
                             @PathVariable int posicaoSantuario,
                             @PathVariable int posicaoPersonagem) {
        localidade.getSantuario(posicaoSantuario).atualizar(bronze, posicaoPersonagem);
    }

    @DeleteMapping("/{posicaoSantuario}/{posicaoPersonagem}")
    public void removePersonagem(@PathVariable int posicaoSantuario,
                                 @PathVariable int posicaoPersonagem) {
        localidade.getSantuario(posicaoSantuario).remover(posicaoPersonagem);
    }

}
