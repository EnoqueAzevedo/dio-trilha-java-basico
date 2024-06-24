import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        Scanner teclado = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obeter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nome = teclado.next();
        
        System.out.println("Por favor, digite a Agência !");
        String agencia = teclado.next();

        System.out.println("Por favor, digite a Conta !");
        int conta = teclado.nextInt();
        
        System.out.println("Por favor, digite o Saldo !");
        double saldo = teclado.nextDouble();           
        
        //Exibir a mensagem conta criada

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");




    }
}
