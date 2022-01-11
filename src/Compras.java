import java.util.ArrayList;
import java.util.Scanner;

public class Compras {
    public ArrayList<Integer> carrinho = new ArrayList<>();
    private Integer i;
    Scanner scanner = new Scanner(System.in);
    Jogo jogo = new Jogo();
    //cada jogo é representado por seu id, que é equivalente a sua posição no vetor + 1.
    

    public double totalCompra(){
        double total=0;
        for(i=0;i<carrinho.size(); i++){
            total+=jogo.preço.get(carrinho.get(i)-1);
        }return total;
    }

    public void imprimeCarrinho(){
        System.out.println("- Itens no Carrinho-");
        for(i=0;i<carrinho.size();i++){
            System.out.println("   + " + jogo.titulo.get(carrinho.get(i)-1));//?????????
        }
    }

}
