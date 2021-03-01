package br.com.bandtec.saintseiyaapi.controller;

import br.com.bandtec.saintseiyaapi.entities.Localidade;
import br.com.bandtec.saintseiyaapi.entities.Santuario;
import org.springframework.web.bind.annotation.*;

import static br.com.bandtec.saintseiyaapi.injection.InjectGlobal.getLocalidade;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    Localidade localidade = getLocalidade();

    @GetMapping
    public Localidade get() {
        return localidade;
    }

    @GetMapping("/{posicao}")
    public Santuario getSantuario(@PathVariable int posicao) {
        return localidade.getSantuario(posicao);
    }

    @PostMapping
    public void adicionaSantuario(@RequestBody Santuario santuario) {
        localidade.adicionar(santuario);
    }

    @PutMapping("/{posicao}")
    public void atualizaSantuario(@RequestBody Santuario santuario,
                                  @PathVariable int posicao) {
        localidade.atualizar(santuario, posicao);
    }

    @DeleteMapping ("/{posicao}")
    public void removeSantuario(@PathVariable int posicao) {
        localidade.remover(posicao);
    }

}

