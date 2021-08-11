/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author 50672
 */
public class HerenciaMain {

    public static void main(String[] args) {
        
        Empleados pedro = new Empleados( );
        
        pedro.setNombre("PEDRO");
        pedro.setEdad(20);
        pedro.setSexo('M');
        
        pedro.setNumeroEmpleado(1521);
        pedro.setPuesto("ADMINISTRADOR");
        pedro.setDepartamento("SISTEMAS");
        
        System.out.println("Nombre del empleado: " + pedro.getNombre());
        System.out.println("Puesto del empleado: " + pedro.getPuesto());
                
    }
}
