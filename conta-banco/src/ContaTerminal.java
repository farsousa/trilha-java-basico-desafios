import java.util.Scanner;

import models.ContaBancaria;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ContaBancaria contaBancaria = new ContaBancaria();

    System.out.println("Por favor, digite o número da Agência !");
    contaBancaria.setAgencia(entrada.next());
    System.out.println("Por favor, digite o número da Conta!");
    contaBancaria.setNumero(entrada.nextInt());
    System.out.println("Por favor, digite o seu Nome!");
    contaBancaria.setNomeCliente(entrada.next());
    System.out.println("Por favor, digite o Saldo!");
    contaBancaria.setSaldo(entrada.nextDouble());

    entrada.close();

    System.out.println(
        "Olá " + contaBancaria.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + contaBancaria.getAgencia() + ", conta " + contaBancaria.getNumero() + " e seu saldo "
            + contaBancaria.getSaldo() + " já está disponível para saque");

  }
}