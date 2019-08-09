package entidades;

public class Terreno extends Imoveis {

    private double area;

    public Terreno(double valor, boolean venda, String descricao, int tipo, Endereco endereco, double area) {
        super(valor, venda, descricao, tipo, endereco);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "area=" + area +
                "} " + super.toString();
    }
}
