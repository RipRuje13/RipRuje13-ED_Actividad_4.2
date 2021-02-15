
package palindromo;
import java.util.Scanner;


public class Palindromo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args ) {
     Scanner sc= new Scanner (System.in);
     String cad;
     int i;
     char c1 = 0;
     Cola c=new Cola();
     
     Pila p= new Pila();
     System.out.println("frase");
     
     cad=sc.nextLine();
     
     for(i=0;i<cad.length();i++){
         c1=cad.charAt(i);
         if (c1 != ' '){
         c.encolar(c1);
         p.push(c1);
     }
     }
     
  
  while(!p.estaVacio()&& p.pop()==c.desencolar());
  
  if(p.estaVacio())    
      System.out.println("palindromo");
    else    
      System.out.println("no es palindromo");
                      
   
    }
    
}
