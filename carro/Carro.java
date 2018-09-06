
package carro;


public class Carro {
    
    double gas;
    double gasMax;
    int pass;
    int passMax;
    double km;;
    
    public Carro(){
        
        this.gas = 0;
        this.gasMax = 10;
        this.pass = 0;
        this.passMax = 2;
        this.km = 0;
        
    }
    
    public void show(){
        
        System.out.println("Passageiros:"+pass+","+" Gasolina:"+gas+","+" KM:"+km);
        
    }
    
    public void embarcar (){
        
        
        if (this.pass >= 2 ){
            System.out.println("Limite de passageiros atingido!");
        }else{
            this.pass ++;
            System.out.println("Feito");
        }
        
        
    }
    
    public void desembarcar(){
        
        if (this.pass <= 0){
            System.out.println("Não há ninguem no carro!");
            }else{
            this.pass --;
            System.out.println("Feito");
        }
        
    }
    
    public void abastecer (double combustivel){
        
        if (this.gas >= 10){
            System.out.println("Tanque cheio!");
        }else if(combustivel > 0){
            this.gas += combustivel;
        }if(this.gas > 10){
            this.gas = this.gasMax;
        }
        
    }
    
    public void dirigir(double distancia){
        
     if (this.pass == 0 ){
         
         System.out.println("Não há ninguem no caro!");
     }else if (this.gas * 10 < distancia){
         System.out.println("Gasolina insuficiente!");
     }else{
        this.gas -= distancia/10;
        this.km += distancia;
        System.out.println("Feito");
        }   
        
    }
}
