
package javabankcliente;

public class ContaBlack extends conta {
    double bonusConta=0.04,jurosTotal;

    
    @Override
    double getLucroAnual() {
       jurosTotal= cdi+bonusConta;
        return getsaldo()*jurosTotal;
       
    }

    @Override
      double getinvestir() {

       return getLucroAnual()+getsaldo();
       
    }
}
