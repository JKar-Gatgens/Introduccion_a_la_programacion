package introjava;

import javax.swing.JOptionPane;


/*comontario multilinea
 */

//comentaio de una sola linea
public class Main {
    public static void main(String[] args) {
        /* System.out.println(" Hello world");*/

//        String marca = "Toyota";
//        int modelo = 2004;
//        float precio = 10000.5F;
//        double precio2 = 10000.4;
//        char letra = 'A';
//       ctl + / con las lineas seleccionadas para comentar todas
//        System.out.println(marca);

//        String nombre;
//        nombre = JOptionPane.showInputDialog("Digite su nombre");
//        String lectura;
//        int edad;
//        double salario;
//
//        lectura = JOptionPane.showInputDialog("Ingrese su edad");
//        edad = Integer.parseInt(lectura);
//
//        lectura = JOptionPane.showInputDialog("Ingrese su salario");
//        salario = Double.parseDouble(lectura);
//        JOptionPane.showMessageDialog(null,"El nombre de la persona es:  " + nombre +" la persona tine: " +edad+ " Resibe un salario de :"+salario);
//        String linea1 = "Bienvenido al mundo de java \n Podras dar solucion a muchos problemas";;
//
//        JOptionPane.showMessageDialog(null, linea1 );
        // 1:49 minutos

//        int numero1 = 1;
//        int numero2 = 1;
//        int numero3 = 1;
//        int numero4 = 1;
//
//        int suma = numero1 + numero2 + numero3 + numero4;
//        double promedio = suma /4.;
//        System.out.println("La suma es: " + suma);
//        System.out.println("La promedio es: " + promedio);
//        JOptionPane.showMessageDialog(null, "La suma es : " + suma + " El promedio es : " + promedio);

//        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
//        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
//        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrse el tercer numero"));
//        int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto numero"));
//        int suma = numero1 + numero2 + numero3 + numero4;
//        double promedio = suma / 4;
//        JOptionPane.showMessageDialog(null, "La suma es : " + suma + " El promerio es: " + promedio);
//        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
//        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", bienveni@ a este programa desarrollado con intelliJ");


//        JOptionPane.showMessageDialog(null,"############## Este prgrama le mostrara su esdad en 5 años ##############");
//
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
//        JOptionPane.showMessageDialog(null, "Su edad en los 5 años sera: " + (edad + 5));
        double ingreso;
        ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ingreso"));
        double gasto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el gasto"));
        double porcentaje = (gasto / ingreso) * 100;
        double residuo = 100 - porcentaje;
        JOptionPane.showMessageDialog(null, "El porcentaje del gasto es : " + porcentaje + " \n  El porcentaje disponible es : " + residuo );
        //2:01 minutos

        //para git hub  1






    }
}