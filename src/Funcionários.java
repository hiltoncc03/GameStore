import java.util.Scanner;
import java.util.ArrayList;

public class Funcionários extends Pessoa {
    
    public Funcionários(ArrayList<String> _nome, ArrayList<Endereço> _endereço, ArrayList<Integer> _dataNascimento, ArrayList<String> _cpf, Scanner _scanner){
        super(_nome, _endereço, _dataNascimento, _cpf, _scanner);
    }
    
    public Funcionários() {
        super();
    }

    private ArrayList<String> cargo = new ArrayList<>();
    private ArrayList<String> dataContrato = new ArrayList<>();
    private Integer j = 0;
    private Integer i;
    //Scanner scanner = new Scanner(System.in);

    public void menuFuncionario(int menu2){
        do{
            System.out.println("   1 - Listar funcionarios contratados\n   2 - Cadastrar novo funcionario\n   3 - Remover funcionario cadastrado\n   0 - Voltar");
            menu2 = scanner.nextInt();
            switch(menu2){
                case 1:
                    listaFuncionario();
                    break;
                case 2:
                    cadastraFuncionario(menu2);
                    break;
                case 3:
                    removeFuncionario(menu2);
                    break;
                default:
                    break;

            }
        }while(menu2!=0);
    }
    
    public void listaFuncionario(){
        for(i=0; i< nome.size();i++){
            if(nome != null){
                System.out.println("\n\n\n-"+ nome.get(i) + "\nEndereço: "+ endereço.get(i).imprimeEndereço()+ "\nData de Nascimento:  "+ dataNascimento.get(i) + "\nCPF:  "+ cpf.get(i) + "\nCargo: "+ cargo.get(i)+"\nData de Contrato: "+ dataContrato.get(i));    
            }

        }  
    }
    
    public void cadastraFuncionario(Integer menu2){
        do{
            System.out.println("Digite o nome do funcionario a ser cadastrado: ");
            nome.add(scanner.next());
            System.out.println("Digite o endereço do funcionário a ser cadastrado: ");
            endereço.add(new Endereço());
            endereço.get(j).cadastraEndereço();
            System.out.println("Digite a Data de nascimento do funcionário a ser cadastrado: ");
            dataNascimento.add(scanner.nextInt());
            System.out.println("Digite o CPF do funcionário a ser cadastrado: ");
            cpf.add(scanner.next());
            System.out.println("Digite o cargo do funcionário a ser cadastrado: ");
            cargo.add(scanner.next());
            System.out.println("Digite a data de contrato do funcionário a ser cadastrado: ");
            dataContrato.add(scanner.next());
            System.out.println(" Deseja cadastrar outro funcionário?: ");
            System.out.println("   1 - Sim\n   0 - Não");
            menu2=scanner.nextInt();
            j++; // Contador que armazena a posição do ultimo cadastro no ArrayList
        }while(menu2!=0);
    }
    
    public void removeFuncionario(Integer menu2){
        do{
            int a;
            System.out.println("Os funcionários cadastrados serão listados a seguir, sendo relacionados à identificadores de acordo com a ordem de numeração.\n ");
            for(i=0;i<nome.size();i++){
                System.out.println("- Funcionário "+ i + ": " + nome.get(i));
            }
            System.out.println("Digite o identificador referente ao funcionário que deseja remover do registro.");
            a = scanner.nextInt();
            nome.remove(nome.get(a));
            dataNascimento.remove(dataNascimento.get(a));
            cpf.remove(cpf.get(a));
            cargo.remove(cargo.get(a));
            dataContrato.remove(dataContrato.get(a));
            endereço.remove(endereço.get(a));
            j--;
            break;
        }while(menu2!=0);
    
    }
}
