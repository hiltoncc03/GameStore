import java.util.Scanner;

public class Menu {
    private int menu1;
    private int menu2;
    Scanner scanner = new Scanner(System.in);
    Funcionários funcionários = new Funcionários();
    Clientes clientes = new Clientes(); 

    public void iniciaMenu(){
        do{
            System.out.println("-Bem vindo ao Sistema de Cadastro da Loja X-");
            System.out.println(" Selecione a opção desejada: ");
            System.out.println("   1 - Jogos \n   2 - Funcionários\n   3 - Vender \n   0 - Sair");
            menu1 = scanner.nextInt();
            switch (menu1) {
                case 1:
                    clientes.compras.jogo.menuJogo(menu2);
                    break;
                case 2:
                    funcionários.menuFuncionario(menu2);
                    break;
                 case 3:
                    //clientes
                    clientes.comprar(menu2);
                    break;
                default:
                     break;
                }
        }while(menu1!=0);
    }

}

