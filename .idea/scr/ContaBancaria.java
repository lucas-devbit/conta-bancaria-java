public class ContaBancaria {
   private double saldo;
   private double chequeEspecial;
   private String titular;

   //Construtor
    public ContaBancaria(String titular, double saldo, double chequeEspecial){
        this.saldo = saldo;
        this.titular = titular;
        this.chequeEspecial = chequeEspecial;
    }

    //Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0){
            this.saldo = saldo;
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //MÉTODOS

    //Opção 1
    public void verificarSaldo(){
        System.out.println("Seu saldo atual é: $" + this.saldo);
    }

    //Opção 2
    public void consultarChequeEspecial(){
        System.out.println("O valor do Cheque Especial: $" + this.chequeEspecial);
    }

    //Opção 3
    public void depositarDinheiro(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.print("Valor de: $" + valor + " foi depositado com sucesso!");
        }else{
            System.out.print("O valor do deposito é inválido!");
        }
    }

    //Opção 4
    public void sacarDinheiro(double valor){
        if (valor > 0){
            this.saldo -= valor;
            System.out.println("O valor de: $" + valor + " foi retirado com sucesso!");
        }
        if (this.saldo < 0){
            System.out.println("Você entrou no Cheque especial!");
        }

    }

    //Opção 5
    public void verificarChequeEspecial(){
        if (this.saldo < 0){
            System.out.println("Você está usando o Cheque Especial!");
            System.out.println("Você já utilizou: $" + Math.abs(this.saldo) + " do Cheque Especial!");
        } else {
            System.out.print("Você não está usando o Cheque Especial!");
        }
    }



}
