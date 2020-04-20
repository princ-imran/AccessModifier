/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaccessmod;

import MyInfo.BoiInfo;

/**
 *
 * @author Spy Hacker
 */
public class PublicAccessMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int a = 20;
       BoiInfo pubObj = new BoiInfo();
       Test test = new Test();
       pubObj.display();
       test.display(); 
       String data = greet("Imran");
       System.out.print(data);
    }    
    
    private static String greet(String name){
        String greet = "Imran00";
         System.out.print("\nUser info");
        String data = "\nUser: "+name +"\nPass: "+greet;
        return data;
    }
   
}
