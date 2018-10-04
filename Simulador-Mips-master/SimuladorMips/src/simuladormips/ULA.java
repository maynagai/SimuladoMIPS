/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormips;

/**
 *
 * @author a120185
 */
//fazer generico

public class ULA extends Memoria {
   //load
   //store
    public int add(int a , int b, int c){
    c=a+b;
        return (c);
    }
    
    public int sub(int a, int b, int c){
    c=a-b;    
        return (c);
    }

    public int mul(int a, int b, int c){
    c=a*b;    
        return (c);
    }
    
    
    public int div(int a, int b, int c){
    c=a/b;    
        return (c);
    }

               
            
}
