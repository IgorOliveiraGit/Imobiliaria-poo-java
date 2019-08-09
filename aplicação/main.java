package aplicação;

import entidades.Endereco;
import entidades.Imoveis;
import entidades.SistemaImobiliaria;
import entidades.Terreno;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);

        Scanner ler = new Scanner(System.in);

        SistemaImobiliaria sistemaImobiliaria = new SistemaImobiliaria();
        Endereco endereco = new Endereco("rua algusto", 50, "jose", "João", "58074");
        Terreno terreno = new Terreno(500 ,true, "terreno bonito", 0, endereco, 30.0);
        sistemaImobiliaria.CadastraImovel(terreno);

        sistemaImobiliaria.CadastraImovel(addTerreno(ler));

        System.out.println(sistemaImobiliaria.getDescricaoImoveis());
        System.out.println(sistemaImobiliaria.getImoveisPorCidade("João"));
    }

    public static Imoveis addTerreno(Scanner ler){
        String logradouro = ler.nextLine();
        int numero = ler.nextInt();
        ler.nextLine();
        String bairro = ler.nextLine();

        String cidade = ler.nextLine();

        String cep = ler.nextLine();
        System.out.println("Digite agora os dados do terreno:");
        double valor = ler.nextDouble();
        boolean venda = ler.nextBoolean();
        ler.nextLine();
        String descricao = ler.nextLine();
        int tipo = ler.nextInt();
        double area = ler.nextDouble();
        Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, cep);
        Terreno terreno = new Terreno(valor, venda, descricao,tipo, endereco, area);
        return terreno;
    }

    /*public static Imoveis addApartamento(Scanner ler){

    }

    public static Imoveis addCasa(Scanner ler){

    }

     */
}

