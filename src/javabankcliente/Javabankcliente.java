
package javabankcliente;


public class Javabankcliente {

    
    public static void main(String[] args) {
       
        cliente clienteMoises= new cliente();
        
        clienteMoises.nome="moises";
        clienteMoises.setCpf("912.212.312-54");
        clienteMoises.profissao="vigilante";
        
        ClienteBlack moisescblack = new ClienteBlack();
       
       moisescblack.setCpf("912.212.312-54");
       moisescblack.nome=("moisesss");
       moisescblack.profissao=("programador");
       System.out.println( moisescblack.getCpf());
       System.out.println(moisescblack.profissao);
       System.out.println(moisescblack.nome);
      
    
        ContaBlack contaBMoises = new ContaBlack();
        
        contaBMoises.agencia=5;
        contaBMoises.conta="8-J";
        contaBMoises.deposita(1000);
        contaBMoises.titular=clienteMoises; //associação ponteiros
        System.out.println(contaBMoises.titular.profissao);
        System.out.println("meu saldo era : "+contaBMoises.getsaldo());
        System.out.println("meu patrimonio e : "+contaBMoises.getinvestir());
        System.out.println("meu lucro e : "+contaBMoises.getLucroAnual());
        
        ContaGold contaGMoises = new ContaGold();
        
        contaGMoises.agencia=4;
        contaGMoises.conta="18-J";
        contaGMoises.deposita(5000);
        System.out.println("meu saldo era : "+contaGMoises.getsaldo());
        System.out.println("meu patrimonio e : "+contaGMoises.getinvestir());
        System.out.println("meu lucro anual foi : "+contaGMoises.getLucroAnual());
       
        
    }
    
}
