package javabankcliente;

public abstract class conta {

    // declarações de variaveis
    private double saldo;
    String conta;
    int agencia;
    double cdi = 0.1238, slic = 0.1375, investido;

    cliente titular = new cliente();

    //entrada de dados
    //processamento
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    abstract double getinvestir();

    public boolean saca(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getsaldo() {

        return this.saldo;

    }

   abstract double getLucroAnual();
   
   public  double getLucroMensal(){
    return getLucroAnual()/12;
}
}

//saida dde dados

