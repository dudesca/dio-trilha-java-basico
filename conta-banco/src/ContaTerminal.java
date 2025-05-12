import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        System.out.println("Por favor, digite o seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o valor do Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + 
                            " e seu saldo é " + saldo + " já está disponível para saque.");
    }
}
