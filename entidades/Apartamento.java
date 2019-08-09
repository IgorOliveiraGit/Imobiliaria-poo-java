package entidades;

public class Apartamento extends Imoveis {

    private String posicao;
    private int numQuartos;
    private double valorCondominio;
    private int vagasGaragem;
    private double area;

    public Apartamento(double valor, boolean venda, String descricao, int tipo, Endereco endereco, String posicao, int numQuartos, double valorCondominio, int vagasGaragem, double area) {
        super(valor, venda, descricao, tipo, endereco);
        this.posicao = posicao;
        this.numQuartos = numQuartos;
        this.valorCondominio = valorCondominio;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public double getArea() {
        return area;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "posicao='" + posicao + '\'' +
                ", numQuartos=" + numQuartos +
                ", valorCondominio=" + valorCondominio +
                ", vagasGaragem=" + vagasGaragem +
                ", area=" + area +
                "} " + super.toString();
    }
}