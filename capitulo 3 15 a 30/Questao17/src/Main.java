/**
 inicio
 variáveis
 real c, f

 escreva("Insira a temperatura em Celsius:")
 leia(s_c)

 c := converte_para_real(s_c)
 f := (c * 1.8) + 32

 escreva("Temperatura em Celsius: ", c, "°C")
 escreva("Temperatura em Fahrenheit: ", f, "°F")

 fim

 TESTE DE MESA
 Entrada      	c      	f
 0	            0	     32.00
 25	           25	     77.00
 **/

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        double celsius, fahrenheit;

        String s_celsius;

        s_celsius = JOptionPane.showInputDialog(null, "Celsius para Fahrenheit \nTemperatura em Celsius: ");

        celsius = Double.parseDouble(s_celsius);

        fahrenheit = (celsius * 1.8) + 32;

        JOptionPane.showMessageDialog(null, "Temperatura em Fahreiheit: " + fahrenheit + "°F");

    }

}
