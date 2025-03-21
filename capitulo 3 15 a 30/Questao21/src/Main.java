/**
 inicio
 variáveis
 inteiro lata, garrafa1, garrafa2
 real calculo

 escreva("Insira a quantidade de latas compradas:")
 leia(s_lata)

 escreva("Insira a quantidade de garrafas de 600ml compradas:")
 leia(s_garrafa1)

 escreva("Insira a quantidade de garrafas de 2L compradas:")
 leia(s_garrafa2)

 lata := converte_para_inteiro(s_lata)
 garrafa1 := converte_para_inteiro(s_garrafa1)
 garrafa2 := converte_para_inteiro(s_garrafa2)

 se (lata < 0 ou garrafa1 < 0 ou garrafa2 < 0) entao
 escreva("Por favor, insira um valor numérico positivo.")
 senao
 calculo := (lata * 0.300) + (garrafa1 * 0.600) + (garrafa2 * 2.000)
 escreva("Foram adquiridos ", arredonda(calculo, 2), " litros de refrigerante.")
 fimse

 fim
 Entrada	    lata	garrafa1	garrafa2	calculo	        Saída
 10	          5	      3          	9	      23.30	        Foram adquiridos 23.30 litros de refrigerante.
 0	          2	      0	            1	      2.20	        Foram adquiridos 2.20 litros de refrigerante.
 -1	          5	      2	            3	      ---           Por favor, insira um valor numérico positivo.
 **/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double quantLata, quantGarrafa, quantGarrafaG, quantLitros;

        String s_quantLata, s_quantGarrafa, s_quantGarrafaG;

        s_quantLata = JOptionPane.showInputDialog(null, "Meia-Cola \n Lata (350ml) \nQuantidade: ");
        s_quantGarrafa = JOptionPane.showInputDialog(null, "Meia-Cola \n Garrafa (600ml) \nQuantidade: ");
        s_quantGarrafaG = JOptionPane.showInputDialog(null, "Meia-Cola \n Garrafa grande (2L) \nQuantidade: ");

        quantLata = Double.parseDouble(s_quantLata);
        quantGarrafa = Double.parseDouble(s_quantGarrafa);
        quantGarrafaG = Double.parseDouble(s_quantGarrafaG);

        quantLitros = ((350 * quantLata) + (600 * quantGarrafa) + (2000 * quantGarrafaG)) / 1000;

        JOptionPane.showMessageDialog(null,
                "Meia-Cola \nQuantidade em litros de refrigerante comprado: " + quantLitros + "(L)");

    }

}
