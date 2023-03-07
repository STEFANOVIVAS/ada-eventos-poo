import java.util.ArrayList;
import java.util.Scanner;

public class MontaMensagem implements NotificarEventos {

    private Integer quantidade;
    private ArrayList<Pessoa> pessoas = new ArrayList();
    private String mensagem;



    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList getPessoas() {
        return pessoas;
    }

    public void adicionarPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void recebeQuantidadePessoas() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o número de pessoas que irá receber a notificação.");
        String quantidadeString = sc.next();
        int quantidade=Integer.valueOf(quantidadeString);
        setQuantidade(quantidade);
    }

    @Override
    public void recebePessoas() {
        System.out.println("Digite o nome das pessoas que irão receber a mensagem");
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < this.getQuantidade(); i++) {
            Pessoa pessoa = new Pessoa();
            String nome = sc.next();
            pessoa.setNomePessoa(nome);
            this.adicionarPessoas(pessoa);
        }

    }


    @Override
    public void recebeMensagem() {
        System.out.println("Digite a mensagem da notificação:");
        Scanner sc =new Scanner(System.in);
        var mensagem=sc.nextLine();
        this.setMensagem(mensagem);
    }



    @Override
    public void exibeMensagem() {

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNomePessoa() + " received a message: "+ "-> " + this.getMensagem());
            System.out.println("{"+ pessoa.getNomePessoa()+"=received a message: "+ "-> " + this.getMensagem()+ "}");
        }

    }


    @Override
    public void limpaDados() {
        this.pessoas.clear();
        quantidade = 0;
        mensagem = "";

    }
}
