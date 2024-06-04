import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o número da Conta:");
        String numeroConta = scanner.next();
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.next();
        System.out.println("Qual o valor do saldo?");
        double saldo = scanner.nextDouble();
        //Resultado
        System.out.println("Olá, "+nomeCliente+"!"+"\nSua conta foi criada com sucesso!"+"\nAgência: "
        +agencia+"\nConta: "+ numeroConta+"\nSaldo: "+saldo+"\nEsse valor já está disponível para transações e saque.");
    }
}
