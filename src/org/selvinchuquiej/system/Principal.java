/*
Nombre: Selvin Raúl Chuquiej Andrade
Codigo Tecnico: IN5AM
Carné: 2018354
Fecha de Creacion: 14/03/2022
Fecha de Modificaciones: 25/03/2022
 */
package org.selvinchuquiej.system;

import javax.swing.JOptionPane;
import org.selvinchuquiej.bean.Dividir;
import org.selvinchuquiej.bean.Multiplicacion;
import org.selvinchuquiej.bean.Resta;
import org.selvinchuquiej.bean.Salida;
import org.selvinchuquiej.bean.Suma;

public class Principal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programador: Selvin Raúl Chuquiej Andrade");

        String entrada;
        int opcion;

        entrada = JOptionPane.showInputDialog(null, "Elije una opcion:\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Division\n 5. Salir");

        opcion = Integer.parseInt(entrada);
       
        switch (opcion) {

            case 1:
                Suma suma = new Suma(0, 0);
                suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer Valor")));
                suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo Valor")));
                JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
                break;

            case 2:
                Resta resta = new Resta(0, 0);
                resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer Valor")));
                resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo Valor")));
                JOptionPane.showMessageDialog(null, "La resta es: " + String.valueOf(resta.restario(resta.getNum1(), resta.getNum2())));
                break;

            case 3:
                Multiplicacion multi = new Multiplicacion(0, 0);
                multi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer Valor")));
                multi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo Valor")));
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + String.valueOf(multi.multiplicar(multi.getNum1(), multi.getNum2())));
                break;

            case 4:
                Dividir dividir = new Dividir(0, 0);
                dividir.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer Valor")));
                dividir.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo Valor")));
                JOptionPane.showMessageDialog(null, "La division es: " + String.valueOf(dividir.division(dividir.getNum1(), dividir.getNum2())));
                break;

            case 5:
                Salida mensaje = new Salida();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Escoje una opcion correcta :/");
        }
    }
}
