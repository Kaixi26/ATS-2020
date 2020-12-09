package traz_aqui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aceite implements Serializable {
    private final ArrayList<String> aceites;

    public Aceite() {
        this.aceites = new ArrayList<>();
    }

    public List<String> getAceites() {
        return new ArrayList<>(this.aceites);
    }

    /**
     * Método que adiciona um código válido a lista de aceites
     *
     * @param a Código TrazAqui.traz_aqui.Encomenda
     */
    public void adicionaAceite(String a) {
        this.aceites.add(a);
    }

    /**
     * Método que retorna uma lista das encomendas default
     */
    public List<String> encDef() {
        return this.aceites.stream().collect(Collectors.toList());
    }
}

