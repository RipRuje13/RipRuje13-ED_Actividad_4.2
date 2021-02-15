/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author Enrique
 */
public class Pila {
    int inicio,fin;
    int pila [];
    
    public Pila (){
        fin=-1;
        pila =new int[50];
    }
    
    public void push (int dato){
        pila[++fin]=dato;
    }
    public int pop(){
        return pila[fin--];
    }
    public boolean estaLleno(){
        return fin==50;
    }
    
    public boolean estaVacio(){
        return fin==-1;
    }
    public String toString(){
        String cod="";
        int i;
        for(i=inicio+1;i<=fin;i++){
            cod+=pila[i];
            cod="\n";
        }
        return cod;
    }
}
