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
//        double ingreso;
//        ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ingreso"));
//        double gasto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el gasto"));
//        double porcentaje = (gasto / ingreso) * 100;
//        double residuo = 100 - porcentaje;
//        JOptionPane.showMessageDialog(null, "El porcentaje del gasto es : " + porcentaje + " \n  El porcentaje disponible es : " + residuo );
//        //2:01 minutos

        // Escriba un programa que lea el nombre del trabajador y su salario semanal, con esta información
        //calcule su salario mensual sin deducciones (salario bruto), el monto de las deducciones (que
        //corresponden a un 9.34%) y el salario después de aplicadas las deducciones (salario neto), finalmente
        //debe mostrar los datos al usuario de la siguiente manera

//        String nombre;
//        double salario;
//        double salario_Bruto;
//        double deducciones;
//        double salario_Neto;
//        nombre = JOptionPane.showInputDialog("Digite su nombre");
//        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario semanal"));
//
//        salario_Bruto = (salario  * 4);
//        deducciones  =  salario_Bruto * 0.0934;
//        salario_Neto = salario_Bruto - deducciones;
//        JOptionPane.showMessageDialog(null, "Esatimado " + nombre +", el salario de este mes se desglosa de la siguente manera. \n Salario Bruto: " + salario_Bruto +
//                ". \n Deducciones: " + deducciones + ". \n Salario Neto: " + salario_Neto);

//        Escriba un nuevo programa en JAVA que le solicite al usuario su
//        edad y le indique si puede o no puede votar.
//        Considere que en nuestro país, solo las personas con 18 años o
//        más pueden votar
//        int edad;
//        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
//            if (edad>=18){
//                    JOptionPane.showMessageDialog(null, "Si puede votar");
//            } else {
//                JOptionPane.showMessageDialog(null, "No puede votar");
//            }

//        Escriba un nuevo programa en JAVA que le solicite al usuario la
//        nota final del curso anterior y le indique si aprobó o no.
//        Considere que para aprobar debe obtener una nota igual o
//        superior a 70
//       double nota;
//       nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
//       if (nota >= 70){
//           JOptionPane.showMessageDialog(null, "Aprobo");
//       }else{
//           JOptionPane.showMessageDialog(null, "Reprobo");
//       }
//        Escriba un programa que le solicite al usuario el número de día y le indique el nombre del día.
//                Por ejemplo 1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 =
//                Sábado
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la semana"));
       switch (numero){
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Lunes");
               break;
           case 3:
               System.out.println("Martes");
               break;
           case 4:
               System.out.println("Miercoles");
               break;
           case 5:
               System.out.println("Juves");
               break;
           case 6:
               System.out.println("Viernes");
               break;
           default:
               System.out.println("Sabado");
       }
       //####################
//        if (numero == 1){
//            System.out.println("Domingo");
//        }else if (numero == 2){
//            System.out.println("Lunes");
//        }else if (numero == 3){
//            System.out.println("Martes");
//        }else if (numero == 4){
//            System.out.println("Miercoles");
//        }else if (numero == 5){
//            System.out.println("Jueves");
//        }else if (numero == 6){
//            System.out.println("Viernes");
//        }else if (numero == 7){
//            System.out.println("Sabado");
//        }
//        Modifique el programa para que muestre cuáles días son laborales y cuales son libres.
//        A pesar de que esto está en función de horarios muy variados

//        if ((numero >= 2) && (numero <= 6)){
//            System.out.println("Dia LABORAL");
//        }else{
//            System.out.println("Dia libre");
//        }
//        Escriba un programa que le solicite al usuario 4 números y le muestre cuál es el mayor

//        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero1: "));
//        int numeroMayor = numero1;
//
//        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero2: "));
//
//        if(numero2 >  numeroMayor){
//            numeroMayor = numero2;
//        }
//        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero3: "));
//
//        if(numero3 >  numeroMayor){
//            numeroMayor = numero3;
//        }
//        int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero4: "));
//
//        if(numero4 >  numeroMayor){
//            numeroMayor = numero4;
//        }
//        System.out.println("Numero Mayor " + numeroMayor);


    }
 }
