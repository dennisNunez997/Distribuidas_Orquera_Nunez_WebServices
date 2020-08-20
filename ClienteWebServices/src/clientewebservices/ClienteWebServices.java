/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebservices;

/**
 *
 * @author dennis
 */
public class ClienteWebServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(primo(3));
    }

    private static String primo(int primo) {
        uddi.Primo_Service service = new uddi.Primo_Service();
        uddi.Primo port = service.getPrimoPort();
        return port.primo(primo);
    }
    
}
