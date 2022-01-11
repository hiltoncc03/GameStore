import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    public ArrayList<String> nome = new ArrayList<>();
    public ArrayList<Endereço> endereço = new ArrayList<>();
    public ArrayList<Integer> dataNascimento = new ArrayList<>();
    public ArrayList<String> cpf = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Pessoa(ArrayList<String> _nome, ArrayList<Endereço> _endereço, ArrayList<Integer> _dataNascimento, ArrayList<String> _cpf, Scanner _scanner) {
        this.nome = _nome;
        this.endereço = _endereço;
        this.dataNascimento = _dataNascimento;
        this.cpf = _cpf;
        this.scanner = _scanner;
    }

    public Pessoa() {
    }
}
