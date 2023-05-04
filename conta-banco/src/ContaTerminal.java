import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agencia, nome;
        int numero;
        double saldo;

        Scanner sc = new Scanner(System.in);
        {

            System.out.println("Por favor, digite o número da Agência!");
            agencia = sc.nextLine();

            System.out.println("Por favor, digite o número da Conta!");
            numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Por favor, digite o Nome!");
            nome = sc.nextLine();

            System.out.println("Digite o saldo!");
            saldo = sc.nextDouble();

            System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " está disponível para saque.");

        }
    }
}
