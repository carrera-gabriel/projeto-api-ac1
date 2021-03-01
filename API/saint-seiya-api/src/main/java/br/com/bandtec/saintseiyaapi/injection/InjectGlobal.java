package br.com.bandtec.saintseiyaapi.injection;

import br.com.bandtec.saintseiyaapi.entities.Localidade;

public class InjectGlobal {

    private static Localidade localidade = new Localidade();

    public static Localidade getLocalidade() {
        return localidade;
    }
}
