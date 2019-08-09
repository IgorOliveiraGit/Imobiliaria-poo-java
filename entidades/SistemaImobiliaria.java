package entidades;

import java.util.ArrayList;
import java.util.List;

public class SistemaImobiliaria {
    private List<Imoveis> ar = new ArrayList<>();
    
    public void CadastraImovel(Imoveis imovel){
        ar.add(imovel);
    }

    public List<Imoveis> getAr() {
        return ar;
    }
    
    public List<String> getDescricaoImoveis(){
        List<String> arDescricao = new ArrayList<>();
        for (Imoveis i: ar) {
            arDescricao.add(i.getDescricao());
        }
        return arDescricao;
    }

    public List<Imoveis> getImoveisPorTipo(int tipo){
        List<Imoveis> arTipos = new ArrayList<>();
        for(Imoveis i: ar){
            if(i.getTipo()==tipo){
                arTipos.add(i);
            }
        }
        return arTipos;
    }

    public List<Imoveis> getImoveisParaAlugarPorBairro(String bairro){
        List<Imoveis> arBairro = new ArrayList<>();
        for (Imoveis i: ar){
            if (i.getEndereco().getBairro()==bairro && i.isVenda()==false){
                arBairro.add(i);
            }
        }
        return arBairro;
    }

    public List<Imoveis> getImoveisParaVenderPorBairro(String bairro){
        List<Imoveis> arBairro = new ArrayList<>();
        for (Imoveis i: ar){
            if (i.getEndereco().getBairro()==bairro && i.isVenda()==true){
                arBairro.add(i);
            }
        }
        return arBairro;
    }
    public List<Imoveis> getImoveisPorCidade(String cidade){
        List<Imoveis> arCidade = new ArrayList<>();
        for(Imoveis i: ar){
            if(i.getEndereco().getCidade()==cidade){
                arCidade.add(i);
            }
        }
        return arCidade;
    }

}
