import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //todo: Conhecer as mensagens para o nosso usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);
        int numero;
        String Agencia;
        String nomeCliente;
        float  Saldo;

        System.out.println("Digite Nome do Cliente: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Digite o código da Agência:  ");
        Agencia = sc.nextLine();

        System.out.println("Digite o número da Agência!: ");
        numero = sc.nextInt();

        System.out.println("Digite seu saldo: ");
        Saldo = sc.nextFloat();

        
        System.out.println("Olá, "+nomeCliente+ ", obrigado por criar uma conta em nosso banco,"
            + "sua agência é: "+ Agencia + 
               " conta: " + numero + " e o saldo e o seu: "+ Saldo +" já está disponivel para saque");


    }
}
