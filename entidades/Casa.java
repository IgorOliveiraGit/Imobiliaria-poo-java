package entidades;

public class Casa extends Imoveis {

    private int numPavimentos;
    private int numQuartos;
    private double areaTerreno;
    private double areaConstruida;

    public Casa(double valor, boolean venda, String descricao, int tipo, Endereco endereco, int numPavimentos, int numQuartos, double areaTerreno, double areaConstruida) {
        super(valor, venda, descricao, tipo, endereco);
        this.numPavimentos = numPavimentos;
        this.numQuartos = numQuartos;
        this.areaTerreno = areaTerreno;
        this.areaConstruida = areaConstruida;
    }

    public int getNumPavimentos() {
        return numPavimentos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setNumPavimentos(int numPavimentos) {
        this.numPavimentos = numPavimentos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numPavimentos=" + numPavimentos +
                ", numQuartos=" + numQuartos +
                ", areaTerreno=" + areaTerreno +
                ", areaConstruida=" + areaConstruida +
                "} " + super.toString();
    }
}

