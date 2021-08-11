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
public class Perro extends Animal{
    
    private String nombre;
    
    public Perro(String especie, String nombre){
        super(especie);
        this.nombre = nombre;
    }
    
    public void printMensaje(){
        super.printMensaje();
        System.out.println("Soy un perro que ladra");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
