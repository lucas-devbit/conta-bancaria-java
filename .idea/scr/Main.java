import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Objetos
        Scanner sc = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria("João Lucas Rodrigues Barros", 1521, 50);

        int escolha = 0;

        //Desing Inicial do Sistema
        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------------------BANCO JAVA-----------------------------------");
        System.out.println("------------------------------------------------------------------------");

        do {

            //Opções de escolha
            System.out.println("\n[1]Consultar o saldo");
            System.out.println("\n[2]Consultar cheque especial");
            System.out.println("\n[3]Depositar dinheiro");
            System.out.println("\n[4]Sacar dinheiro");
            System.out.println("\n[5]Verificar se a conta está usando cheque especial");
            System.out.println("\n[6]Exit");

            System.out.print("\nEscolha:   ");
            escolha = sc.nextInt();

            if (escolha == 1){
                minhaConta.verificarSaldo();
            } else if (escolha == 2){
                minhaConta.consultarChequeEspecial();
            } else if (escolha == 3) {
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                minhaConta.depositarDinheiro(valorDeposito);
            } else if (escolha == 4) {
                System.out.print("Valor do saque: ");
                double valorSaque = sc.nextDouble();
                minhaConta.sacarDinheiro(valorSaque);
            } else if (escolha == 5) {
                minhaConta.verificarChequeEspecial();
            } else if (escolha == 6) {
                break;
            } else { System.out.println("Valor inválido!");}


        }while(escolha != 6);

        System.out.println("Programa encerrado!");
    }

}
