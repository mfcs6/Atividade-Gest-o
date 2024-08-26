class Banco extends Contabancaria {
    String Banco;
    String conta;

    public void criar_conta(String titular, int Saldo_inicial){
        super(titular,Saldo_inicial);
        this.titular = titular;
        this.Saldo_inicial = Saldo_inicial;
    }

    public void encontrar_conta(int numero){
        super(numero);
        return titular;
    }

    public void tranferir(int valor,String titular1, String titular2){
        super(conta)

        if(conta == titular1 && conta == titular2){
            
        }
    }

}
