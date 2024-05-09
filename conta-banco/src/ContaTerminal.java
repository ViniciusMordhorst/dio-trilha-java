import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;

/**
 * Conhecendo a classe scanner e desenvolvendo desafio proposto
 * 
 * 
 * 
 */

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}


    

