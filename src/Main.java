import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mensagens = true;
        MontaMensagem montaMensagem = new MontaMensagem();


        while (mensagens) {
            montaMensagem.recebeQuantidadePessoas();
            if (montaMensagem.getQuantidade() <= 0) {
                mensagens = false;
                break;
            }

            montaMensagem.recebePessoas();
            montaMensagem.recebeMensagem();
            montaMensagem.exibeMensagem();
            montaMensagem.limpaDados();
        }
    }
}