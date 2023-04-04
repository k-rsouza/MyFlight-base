package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {

    //add o voo (voo: Voo) : void
    //listarTodos(): arraylist <Voo>
    //buscaData ( data: localdate): arraylist<Voo>


    //lista tudo (array)
    private ArrayList<Voo> lista;

    private GerenciadorVoos(){
        lista = new ArrayList<>();
    }

    private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance() {
        if (instance == null)
            instance = new GerenciadorVoos();

        return instance;

    }

    //add o voo

    public void inserir(Voo voo) {
        lista.add( voo );
    }


    //comando abaixo sera inserido na main, escrito aq p lembrar so
    //     public void inserir(int umCod, String umNome, double umPreco) {

    //     lista.add( new Produto(umCod, umNome, umPreco) );
    //    }

    //buscarData

    public Voo pesquisar(LocalDateTime datahora){
        for(Voo voo: lista){
           if (voo.getDatahora().equals(datahora))
               return voo;
        }
         return null;
    }


}
