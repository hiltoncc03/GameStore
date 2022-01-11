import java.util.ArrayList;
import java.util.Scanner;

public class Clientes extends Pessoa{
    public Clientes(ArrayList<String> _nome, ArrayList<Endereço> _endereço, ArrayList<Integer> _dataNascimento, ArrayList<String> _cpf, Scanner _scanner){
        super(_nome, _endereço, _dataNascimento, _cpf, _scanner);
    }
    
    public Clientes() {
        super();
    }

    private ArrayList<Boolean> possuiCadastro = new ArrayList<>();
    private Integer j = 0;
    private Integer i = 0;
    Compras compras = new Compras();
    private Integer menu;

    public void comprar(Integer menu2){
        do{
            System.out.println("\nCadastrar Novo Cliente???\n   1 - SIM\n   2 - NÃO\n   0 - VOLTAR");
            menu2 = scanner.nextInt();
            switch(menu2){
                case 1:
                    //cadastra cliente -> inicia compra  
                    cadastraCliente();
                    realizaCompra(menu2);
                    menu2 = 0;
                    break;
                case 2:
                listaClientes();
                    System.out.println("\nDigite o ID do cliente que realizará a compra, ou digite 0 para realizar o cadastro de um novo cliente: ");
                    menu2 = scanner.nextInt();
                    realizaCompra(menu2);
                    break;
                default:
                    break;
            }
        }while(menu2!=0);
    }

    public void cadastraCliente(){
        System.out.println("Digite o nome do cliente a ser cadastrado: ");
        nome.add(scanner.next());
        System.out.println("Digite o endereço do cliente a ser cadastrado: ");
        endereço.add(new Endereço());
        endereço.get(j).cadastraEndereço();
        System.out.println("Digite a Data de nascimento do cliente a ser cadastrado: ");
        dataNascimento.add(scanner.nextInt());
        System.out.println("Digite o CPF do cliente a ser cadastrado: ");
        cpf.add(scanner.next());
        possuiCadastro.add(j, true);
        j++; // Contador que armazena a posição do ultimo cadastro no ArrayList
    }

    public void realizaCompra(Integer idClienteAtual){
        if(idClienteAtual == 0){
            cadastraCliente();
            idClienteAtual=j;
        }
        System.out.println("   Jogos Disponíveis:");
        compras.jogo.listaJogo();
        do{
            System.out.println("Digite o id do jogo que deseja colocar no carrinho, ou 0 concluir a compra: ");
            menu = scanner.nextInt();
            if(menu!=0){
                compras.carrinho.add(menu);
            }
        }while(menu!=0);
        compras.imprimeCarrinho();
        System.out.println("O valor total da compra foi de R$ " + compras.totalCompra());
        System.out.println("Finalizar compra?\n   1 - SIM\n   2 - NÃO\n   0 - VOLTAR");
        menu = scanner.nextInt();
        switch(menu){
            case 1:
                System.out.println("COMPRA FINALIZADA!!!");
                break;
            case 2:
                System.out.println("COMPRA CANCELADA!!!");
            default:
                break;
        }
    }

    public void listaClientes(){
        for(i=0; i< nome.size();i++){
            if(nome != null){
                System.out.println("\n\n\n- Cliente:" + (i+1)+ nome.get(i) + "\nEndereço: "+ endereço.get(i).imprimeEndereço()+ "\nData de Nascimento:  "+ dataNascimento.get(i) + "\nCPF:  "+ cpf.get(i));    
            }

        }  
    }

}