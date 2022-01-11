import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    ArrayList<String> titulo = new ArrayList<>();
    ArrayList<Double> preço = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String nomeJogo;
    private Double preçoJogo;

    public Jogo(){
        titulo.add("Minecraft");
        titulo.add("The Last of Us");
        titulo.add("Uncharted 4");
        titulo.add("GTA 5");
        titulo.add("Celeste");

        preço.add(50.00);
        preço.add(75.00);
        preço.add(80.300);
        preço.add(119.99);
        preço.add(49.99);
    }

    public void menuJogo(int menu2){
        do{
            System.out.println("   1 - Listar jogos cadastrados\n   2 - Cadastrar novo jogo\n   0 - Voltar");
            menu2 = scanner.nextInt();
            switch(menu2){
                case 1:
                    listaJogo();
                    break;
                case 2:
                    cadastraJogo(menu2);
                    break;
                default:
                    break;

            }
        }while(menu2!=0);
    }
    
    public void listaJogo(){
        int i;
        for(i=0; i<titulo.size();i++){
            if(titulo != null){
                System.out.println("\n-JOGO "+ (i+1) + "\nJogo: "+ titulo.get(i)+ " - R$ "+ preço.get(i));    
            }

        }  
    }
    
    public void cadastraJogo(Integer menu2){
        do{
            System.out.println("Digite o título do jogo a ser cadastrado: ");
            nomeJogo = scanner.nextLine();
            nomeJogo = scanner.nextLine();
            titulo.add(nomeJogo);
            System.out.println("Digite o preço do jogo a ser cadastrado: ");
            preçoJogo = scanner.nextDouble();
            preço.add(preçoJogo);
            System.out.println("Deseja cadastrar outro jogo?");
            System.out.println("   1 - Sim\n   0 - Não");
            menu2=scanner.nextInt();
        }while(menu2!=0);
    }
}
