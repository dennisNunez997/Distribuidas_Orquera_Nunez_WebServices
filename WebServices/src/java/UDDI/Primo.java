/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author dennis
 */
@WebService(serviceName = "Primo")
public class Primo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Primo")
    public String primo(@WebParam(name = "primo") int a) {
       Verificar var = new Verificar();
       if(var.primo(a) == true){
           return "El numero es primo";
       }
       else
       {
        return "El numero no es primo";
       }
       
        
    }
}
