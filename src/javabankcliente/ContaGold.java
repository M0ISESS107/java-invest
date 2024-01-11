
package javabankcliente;


public class ContaGold extends conta {

    double bonusConta=0.02;
   
    double getLucroAnual() {
        return getsaldo()*slic+bonusConta;
       
    }

      double getinvestir() {

       return getLucroAnual()+getsaldo();
       
    }

   
     
}
