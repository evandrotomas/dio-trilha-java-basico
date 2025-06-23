import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Definir saldo
        var balance = 237.48;
        //TODO:Conhecer e importar a classe Scanner
        var scanner = new Scanner(System.in);
        //Exibir mensagem e capturar nome do cliente
        System.out.println("Por favor, digite seu nome.");
        var name = scanner.next();
        //Exibir mensagem e agencia
        System.out.println("Por favor, digite o número da Agência!");
        var agency = scanner.next();
        //Exibir mensagem e capturar conta
        System.out.println("Por favor, digite o número da conta!");
        var account = scanner.nextInt();
        //Exibir mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$ %s já está disponível para saque.", name, agency, account, balance);
    }
}
