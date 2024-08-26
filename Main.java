public class Main {
    public static void main(String args[]){

        Banco meu_banco = new Banco();
        Contabancaria conta1 = new Contabancaria();
        Contabancaria conta2 = new Contabancaria();

        meu_banco = Banco("Banco Central");
        conta1 = meu_banco.criar_conta("Ana Carla",    500)
        conta2 = meu_banco.criar_conta("João Silva", 500);
        conta1.vsaldo();
        conta1.vsaldo();
        conta2.vsaldo();    

    }
}