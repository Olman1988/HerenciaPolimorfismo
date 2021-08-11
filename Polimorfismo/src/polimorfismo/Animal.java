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
public class Animal {
    
    private String especie;
    
    public Animal(String especie){
        this.especie = especie;
    }
    
    public void printMensaje(){
        System.out.println("Soy un animal de la especie: " + this.getEspecie());
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}