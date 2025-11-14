/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author jparedes
 */
public class gestor {
    static int x[] = new int[20];
    
    public static String Mostrar()
    {
        String y = "";
        for (int i = 0; i < x.length; i++) {
            y+= x[i]+" | "; 
        }
        return y;
    }
    
}
