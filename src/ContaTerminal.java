import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        exibirMensagem(numeroConta,agencia,nomeCliente,saldo);

        sc.close();
    }

    public static void exibirMensagem(int numeroConta, String agencia, String nomeCliente, double saldo){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia 
        + ", conta "+ numeroConta + " e seu saldo " + saldo + " já está disponível para saque." );
    }
}
