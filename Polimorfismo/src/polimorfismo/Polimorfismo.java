/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author 50672
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal fido, miau;
        
        fido = new Perro("Perro", "Fido");
        miau = new Gato("Gato", "Miau");
        
        fido.printMensaje();
        miau.printMensaje();
    }
    
}
