package traz_aqui;

/**
 * Escreva a descrição da classe traz_aqui.LinhaEncomenda aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */
public class LinhaEncomenda {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String codLinha;
    private String descricao;
    private Double preco;
    private Double quantidade;

    /**
     * COnstrutor para objetos da classe Produto
     */
    public LinhaEncomenda() {
        this.codLinha = "";
        this.descricao = "";
        this.preco = 0.0;
        this.quantidade = 0.0;
    }

    public LinhaEncomenda(String codLinha, String descicao, double preco, double quantidade) {
        this.codLinha = codLinha;
        this.descricao = descicao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public LinhaEncomenda(LinhaEncomenda l) {
        this.codLinha = l.getcodLinha();
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescicao(String descicao) {
        this.codLinha = descicao;
    }

    public String getcodLinha() {
        return this.codLinha;
    }

    public void setcodLinha(String codLinha) {
        this.codLinha = codLinha;
    }

    public LinhaEncomenda clone() {
        return new LinhaEncomenda(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        LinhaEncomenda v = (LinhaEncomenda) obj;
        return this.getcodLinha() == v.getcodLinha();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.getcodLinha());
        res.append(this.getDescricao());
        res.append(this.getPreco());
        res.append(this.getQuantidade());
        System.out.println(res.toString());
        return (res.toString());
    }

    public String stringtoFile() {

        return this.getcodLinha() +
                "," + this.getDescricao() +
                "," + this.getQuantidade() +
                "," + this.getPreco();
    }


}
