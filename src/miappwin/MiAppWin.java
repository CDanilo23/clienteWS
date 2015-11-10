/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miappwin;

/**
 *
 * @author Administrador
 */
public class MiAppWin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MisServicios_Service puerto = new MisServicios_Service(); 
       MisServicios misServicios =  puerto.getMisServiciosPort();
       System.out.println(misServicios.sumarDosNumeros("10", "20"));
       
       MisServicios_Service puerto2 = new MisServicios_Service(); 
       MisServicios misServicios2 =  puerto2.getMisServiciosPort();
       System.out.println(misServicios.restarDosNumeros("30", "20"));
       
       
    }

}
