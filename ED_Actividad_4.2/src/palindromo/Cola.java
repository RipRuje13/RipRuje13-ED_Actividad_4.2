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
public class Cola {
    int inicio,fin;
    int cola[];
    
    public Cola(){
        inicio= -1;
        fin=-1;
        cola = new int [50];
    }
    public void encolar(int dato){
        cola[++fin]=dato;
        
    }
    public int desencolar(){
        return cola[++inicio];
    }
    public boolean estaLlena(){
        return fin==50;
    }
    public boolean estaVacia(){
        return inicio==fin;
    }
    @Override
    public String toString(){
        String cad="";
        int i;
        for(i=inicio+1;i<=fin;i++)
        {
            cad+=cola[i];
            cad="\n";
        }
        return cad;
    }
}
