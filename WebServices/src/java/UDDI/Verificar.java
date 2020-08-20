/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

/**
 *
 * @author dennis
 */
public class Verificar {
    public static boolean primo(int n){
        int a = 0;
        int contador = 2;
        boolean primo = true;
        
        while ((primo) && (contador != n)){
            if(n % contador == 0){
                primo = false;
            }
            contador++;
        }
        return primo;        
    }
    
    
}
