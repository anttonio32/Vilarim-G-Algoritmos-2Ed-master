/**
 inicio
 variáveis
 real c5, c10, c25, c50, real1, calculo

 escreva("Insira a quantidade de moedas de 5 centavos:")
 leia(sc5)

 escreva("Insira a quantidade de moedas de 10 centavos:")
 leia(sc10)

 escreva("Insira a quantidade de moedas de 25 centavos:")
 leia(sc25)

 escreva("Insira a quantidade de moedas de 50 centavos:")
 leia(sc50)

 escreva("Insira a quantidade de moedas de 1 real:")
 leia(sreal1)

 c5 := converte_para_real(sc5) / 100
 c10 := converte_para_real(sc10) / 10
 c25 := converte_para_real(sc25) / 4
 c50 := converte_para_real(sc50) / 2
 real1 := converte_para_real(sreal1)

 calculo := (c5 * 0.05) + (c10 * 0.10) + (c25 * 0.25) + (c50 * 0.50) + (real1 * 1.0)

 escreva("Você tem ", arredonda(calculo, 2), " R$ no cofre.")

 fim
 Entrada	        c5	    c10	      c25	   c50	    real1	      calculo	      Saída
 10	             5	     3	       2	    4	      1         	3.55         	Você tem 3.55 R$ no cofre.
 0	             0	     0	       0	    0	      0	            0.00	        Você tem 0.00 R$ no cofre.
 **/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double c1, c5, c10, c25, c50, real1,calculo;

        String s_c1, s_c5, s_c10, s_c25, s_c50, s_real1;

        s_c1 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 1 centavo.");
        s_c5 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 5 centavos.");
        s_c10 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 10 centavos.");
        s_c25 =   JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 25 centavos.");
        s_c50 =   JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 50 centavos.");
        s_real1 =  JOptionPane.showInputDialog(null, "Insira a quantidade de moedas de 1 real.");

        c1 = Double.parseDouble(s_c1);
        c5 = Double.parseDouble(s_c5);
        c10 = Double.parseDouble(s_c10);
        c25 = Double.parseDouble(s_c25);
        c50 = Double.parseDouble(s_c50);
        real1 = Double.parseDouble(s_real1);


        calculo = (c1 * 0.01) + (c5 * 0.5) + (c10 * 0.10) + (c25 * 0.25) + (c50 * 0.50) + (real1 * 1.0);

        JOptionPane.showMessageDialog(null, "Pedrinho tem: R$"+ String.format("%.2f", calculo) + " no cofre.");

    }

}
