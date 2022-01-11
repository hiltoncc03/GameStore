import java.util.Scanner;

public class Endereço {
    private String pais;
    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;

    /*
    public Endereço(String pais, String cidade, String estado, String bairro, String rua, String numero, String cep) {
        this.pais = pais;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }
    */
    Scanner scanner = new Scanner(System.in);
    public String imprimeEndereço(){
        String endCompleto = (cidade + ", "+ cep + ", " + bairro + ", " + rua + ", " + numero + ", " + estado + ", " + pais + "." );
        return endCompleto;
    }
    public void cadastraEndereço(){
        System.out.println("País: ");
        pais = scanner.nextLine();
        System.out.println("Estado: ");
        estado = scanner.nextLine();
        System.out.println("Cidade: ");
        cidade = scanner.nextLine();
        System.out.println("Bairro: ");
        bairro = scanner.nextLine();
        System.out.println("Rua: ");
        rua = scanner.nextLine();
        System.out.println("Número: ");
        numero = scanner.nextLine();
        System.out.println("CEP: ");
        cep = scanner.nextLine();
    }
}
