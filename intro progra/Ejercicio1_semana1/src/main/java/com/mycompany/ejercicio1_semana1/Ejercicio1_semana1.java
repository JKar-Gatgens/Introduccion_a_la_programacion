/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_semana1;
import javax.swing.JOptionPane;
/**
 *
 * @author josea
 */
public class Ejercicio1_semana1 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 3: "));
        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 4: "));
        
        int suma = numero1 + numero2 + numero3 + numero4;
        double promedio = suma / 4;
        
        JOptionPane.showMessageDialog(null, "suma: " + suma + " promedio: " + promedio);
    }
}
