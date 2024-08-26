class Contabancaria extends Banco {
int numconta;
String nome;
double saldo;
double saque;

public void depositar(double valord){
    valord = saldo;

}public void sacar (double valors){
    
    if (saldo >= saque){
        System.out.println(" Saldo suficiente para saque.");
        valors = saldo - saque;
    }

    else{
        System.out.println(" Saldo insuficiente.");
    }
}

public double vsaldo(){
    System.out.println(" Seu saldo é: " + vsaldo());
    return saldo;
}
}