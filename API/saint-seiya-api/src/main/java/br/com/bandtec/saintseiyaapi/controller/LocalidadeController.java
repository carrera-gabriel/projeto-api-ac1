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

    @GetMapping("/buscar/{posicao}")
    public Santuario getSantuario(int posicao) {
        return localidade.getSantuario(posicao);
    }

    @PostMapping
    public void adicionaSantuario(@RequestBody Santuario santuario) {
        localidade.adicionar(santuario);
    }

    @PutMapping("/atualizar/{posicao}")
    public void atualizaSantuario(@RequestBody Santuario santuario, int posicao) {
        localidade.atualizar(santuario, posicao);
    }

    @DeleteMapping ("/remover/{posicao}")
    public void removeSantuario(int posicao) {
        localidade.remover(posicao);
    }


//    public Localidade adicionaLocalidade(@RequestBody Object s) {
//        listarLocalidade().add();
//        System.out.println("Santuário adicionado com sucesso!");
//        return s;
//    }

//    @PostMapping("/adicionar/bronze")
//    public Personagem adicionaBronze(@RequestBody Bronze bronze) {
//        listarCavaleiro().add(bronze);
//        System.out.println("Cavaleiro de bronze adicionado com sucesso!");
//        return bronze;
//    }
//
//    @PostMapping("/adicionar/prata")
//    public Personagem adicionaPrata(@RequestBody Prata prata) {
//        listarCavaleiro().add(prata);
//        System.out.println("Cavaleiro de prata adicionado com sucesso!");
//        return prata;
//    }
//
//    @PostMapping("/adicionar/ouro")
//    public Personagem adicionarOuro(@RequestBody Ouro ouro) {
//        listarCavaleiro().add(ouro);
//        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
//        return ouro;
//    }
//
//    @PutMapping("/alterar/deus/{posicao}")
//    public String alteraDeus(@PathVariable int posicao,
//                              @RequestBody Deus deusAlterado) {
//        if (posicao < listaPersonagem.size()) {
//            listaPersonagem.set(posicao, deusAlterado);
//            return "Informações do deus atualizado com sucesso!";
//        } else {
//            return "Deus inexistente, verifique a posição!";
//        }
//    }
//
//    @PutMapping("/alterar/bronze/{posicao}")
//    public String alteraBronze(@PathVariable int posicao,
//                                @RequestBody Bronze bronzeAlterado) {
//        if (posicao < listaPersonagem.size()) {
//            listaPersonagem.set(posicao, bronzeAlterado);
//            return "Informações do cavaleiro de bronze atualizado com sucesso!";
//        } else {
//            return "Cavaleiro de bronze inexistente, verifique a posição!";
//        }
//    }
//
//    @PutMapping("/alterar/prata/{posicao}")
//    public String alteraPrata(@PathVariable int posicao,
//                               @RequestBody Prata prataAlterado) {
//        if (posicao < listaPersonagem.size()) {
//            listaPersonagem.set(posicao, prataAlterado);
//            return "Informações do cavaleiro de prata atualizado com sucesso!";
//        } else {
//            return "Cavaleiro de prata inexistente, verifique a posição!";
//        }
//    }
//
//    @PutMapping("/alterar/ouro/{posicao}")
//    public String alteraOuro(@PathVariable int posicao,
//                              @RequestBody Ouro ouroAlterado) {
//        if (posicao < listaPersonagem.size()) {
//            listaPersonagem.set(posicao, ouroAlterado);
//            return "Informações do cavaleiro de ouro atualizado com sucesso!";
//        } else {
//            return "Cavaleiro de ouro inexistente, verifique a posição!";
//        }
//    }
//
//    @DeleteMapping("/deletar/{posicao}")
//    public String deleta(@PathVariable int posicao) {
//        if (posicao < listaPersonagem.size()) {
//            listaPersonagem.remove(posicao);
//            return "Cavaleiro excluido com sucesso!";
//        } else {
//            return "Cavaleiro inexistente!";
//        }
//    }
//
//    @GetMapping("/cosmo/{id}")
//    public Double cosmo(@PathVariable int id) {
//        return listaPersonagem.get(id).forcaCosmo();
//    }
//
//    @GetMapping("/mach/{id}")
//    public Double mach(@PathVariable int id) {
//        return listaPersonagem.get(id).poderMach();
//    }

}

