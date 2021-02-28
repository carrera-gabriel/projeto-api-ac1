package br.com.bandtec.saintseiyaapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

        /*

        A utilização da classe abstrata e interface foi necessária nesse projeto, porquê fora preciso que
        tivesse uma assinatura de poder dos personagens, idependente se ele é um Deus ou um cavaleiro,
        dessa forma não seria preciso ficar repetindo a conta nas classes diversas, tendo apenas esse método
        atribuído aos demais personagens.

         */

@RestController
@RequestMapping("/cavaleiro")
public class SaintSeiyaController {

    private List<Personagem> listaPersonagem = new ArrayList<Personagem>();

    @GetMapping("/listar")
    public List<Personagem> listarCavaleiro() {
        return listaPersonagem;
    }

    @PostMapping("/adicionar/deus")
    public Personagem adicionaDeus(@RequestBody Deus deus) {
        listarCavaleiro().add(deus);
        System.out.println("Deus adicionado com sucesso!");
        return deus;
    }

    @PostMapping("/adicionar/bronze")
    public Personagem adicionaBronze(@RequestBody Bronze bronze) {
        listarCavaleiro().add(bronze);
        System.out.println("Cavaleiro de bronze adicionado com sucesso!");
        return bronze;
    }

    @PostMapping("/adicionar/prata")
    public Personagem adicionaPrata(@RequestBody Prata prata) {
        listarCavaleiro().add(prata);
        System.out.println("Cavaleiro de prata adicionado com sucesso!");
        return prata;
    }

    @PostMapping("/adicionar/ouro")
    public Personagem adicionarOuro(@RequestBody Ouro ouro) {
        listarCavaleiro().add(ouro);
        System.out.println("Cavaleiro de ouro adicionado com sucesso!");
        return ouro;
    }

    @PutMapping("/alterar/deus/{posicao}")
    public String alteraDeus(@PathVariable int posicao,
                              @RequestBody Deus deusAlterado) {
        if (posicao < listaPersonagem.size()) {
            listaPersonagem.set(posicao, deusAlterado);
            return "Informações do deus atualizado com sucesso!";
        } else {
            return "Deus inexistente, verifique a posição!";
        }
    }

    @PutMapping("/alterar/bronze/{posicao}")
    public String alteraBronze(@PathVariable int posicao,
                                @RequestBody Bronze bronzeAlterado) {
        if (posicao < listaPersonagem.size()) {
            listaPersonagem.set(posicao, bronzeAlterado);
            return "Informações do cavaleiro de bronze atualizado com sucesso!";
        } else {
            return "Cavaleiro de bronze inexistente, verifique a posição!";
        }
    }

    @PutMapping("/alterar/prata/{posicao}")
    public String alteraPrata(@PathVariable int posicao,
                               @RequestBody Prata prataAlterado) {
        if (posicao < listaPersonagem.size()) {
            listaPersonagem.set(posicao, prataAlterado);
            return "Informações do cavaleiro de prata atualizado com sucesso!";
        } else {
            return "Cavaleiro de prata inexistente, verifique a posição!";
        }
    }

    @PutMapping("/alterar/ouro/{posicao}")
    public String alteraOuro(@PathVariable int posicao,
                              @RequestBody Ouro ouroAlterado) {
        if (posicao < listaPersonagem.size()) {
            listaPersonagem.set(posicao, ouroAlterado);
            return "Informações do cavaleiro de ouro atualizado com sucesso!";
        } else {
            return "Cavaleiro de ouro inexistente, verifique a posição!";
        }
    }

    @DeleteMapping("/deletar/{posicao}")
    public String deleta(@PathVariable int posicao) {
        if (posicao < listaPersonagem.size()) {
            listaPersonagem.remove(posicao);
            return "Cavaleiro excluido com sucesso!";
        } else {
            return "Cavaleiro inexistente!";
        }
    }

    @GetMapping("/cosmo/{id}")
    public Double cosmo(@PathVariable int id) {
        return listaPersonagem.get(id).forcaCosmo();
    }

    @GetMapping("/mach/{id}")
    public Double mach(@PathVariable int id) {
        return listaPersonagem.get(id).poderMach();
    }

}

