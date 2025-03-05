import java.lang.reflect.Array;
import java.util.ArrayList;    // Para armazenar a lista de usuários
import java.util.List;         // Interface para manipulação da lista
import java.util.Scanner;      // Para entrada de dados pelo console

class Usuario{
    private String Nome;
    private String CPF;
    private int Idade;
    private String Email;

    public Usuario(String Nome, String CPF, int Idade, String Email){
        this Nome = Nome;
        this CPF = CPF;
        this Idade = Idade;
        this Email = Email;

    }

}

class Usuario_controle{
    private List<Usuario> usuarios = new ArrayList<>();


}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario_controle usuario_controle = new Usuario_controle
    }
}