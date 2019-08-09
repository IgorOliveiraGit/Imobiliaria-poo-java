package entidades;

public abstract class Imoveis {

    private double valor;
    private boolean venda;
    private String descricao;
    private int tipo;
    private Endereco endereco;

    public Imoveis(double valor, boolean venda, String descricao, int tipo, Endereco endereco) {
        this.valor = valor;
        this.venda = venda;
        this.descricao = descricao;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public boolean isVenda() {
        return venda;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imoveis{" +
                "valor=" + valor +
                ", venda=" + venda +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", endereco=" + endereco +
                '}';
    }
}
