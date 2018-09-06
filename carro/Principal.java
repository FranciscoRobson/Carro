
package carro;
import java.util.Scanner;


public class Principal {
static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
    String help = "-----------------------------------------------------------------------\n"+
                  "=== Lista de comndos ===\n" +
                  "Embarcar\n"+
                  "Desembarcar\n"+
                  "Abastecer(Ao digitar o comando, informe o valor a abastecer !)\n"+
                  "Dirigir (Ao digitar o comando, informe a quantidade de km a dirigir !)\n"+
                  "------------------------------------------------------------------------" ;
    Carro c1 = new Carro();
    
    while(true){
        
        System.out.print("Digite help para lista de comandos !\n"+"Digite um comando: ");
        String comando = input.nextLine();
        if (comando.equals("help")){
            System.out.println(help);
        }else{
            
            String c[] = comando.split(" ");
            switch(c[0]){
                
                case "Embarcar":
                    c1.embarcar();
                    break;
                case "Desembarcar":
                    c1.desembarcar();
                    break;
                case "Abastecer":
                    c1.abastecer(Double.parseDouble(c[1]));
                    break;
                case "Dirigir":
                    c1.dirigir(Double.parseDouble(c[1]));
                    break;
                case "show":
                    c1.show();
                    break;
                default:
                    System.out.println("Comando invalido !");
            }
            
        }
    }
       
       
    }
    
}
