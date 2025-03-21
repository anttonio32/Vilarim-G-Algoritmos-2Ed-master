/**
 inicio
 variáveis
 real compra1, compra2, compra3, compra4, total
 cadeia s_compra1, s_compra2, s_compra3, s_compra4

 escreva("Insira o valor da primeira compra:")
 leia(s_compra1)
 escreva("Insira o valor da segunda compra:")
 leia(s_compra2)
 escreva("Insira o valor da terceira compra:")
 leia(s_compra3)
 escreva("Insira o valor da quarta compra:")
 leia(s_compra4)

 compra1 := converte_para_real(s_compra1)
 compra2 := converte_para_real(s_compra2)
 compra3 := converte_para_real(s_compra3)
 compra4 := converte_para_real(s_compra4)

 compra1 := compra1 / 5
 compra2 := compra2 / 5
 compra3 := compra3 / 5
 compra4 := compra4 / 5
 total := compra1 + compra2 + compra3 + compra4

 escreva("Pontos adquiridos com cada compra:\n")
 escreva("Primeira compra: ", compra1, " pontos\n")
 escreva("Segunda compra: ", compra2, " pontos\n")
 escreva("Terceira compra: ", compra3, " pontos\n")
 escreva("Quarta compra: ", compra4, " pontos\n")
 escreva("Total: ", total, " pontos\n")
 fim

 Passo   	s_compra	  compra	   Pontos
 Leitura  	"15"	     15.00	       3.00
 Leitura	  "25"	     25.00      	5.00
 Leitura	  "10"	     10.00      	2.00
 Leitura	  "20"	     20.00      	4.00
 Total		                         14.00 pontos



 **/

import javax.swing.JOptionPane;
public class Main {


    public static void main(String[] args) {

        double compra1, compra2, compra3, compra4, total;

        String s_compra1, s_compra2, s_compra3, s_compra4;

        s_compra1 = JOptionPane.showInputDialog(null, "Insira o valor da primeira compra:");
        s_compra2 = JOptionPane.showInputDialog(null, "Insira o valor da segunda compra:");
        s_compra3 = JOptionPane.showInputDialog(null, "Insira o valor da terceira compra:");
        s_compra4 = JOptionPane.showInputDialog(null, "Insira o valor da quarta compra:");

        compra1 = Double.parseDouble(s_compra1);
        compra2 = Double.parseDouble(s_compra2);
        compra3 = Double.parseDouble(s_compra3);
        compra4 = Double.parseDouble(s_compra4);

        compra1 = compra1/5;
        compra2 = compra2/5;
        compra3 = compra3/5;
        compra4 = compra4/5;
        total = compra1 + compra2  + compra3 + compra4;

        JOptionPane.showMessageDialog(null, "Pontos adquiridos com cada compra:"+ "\nPrimeira compra: "+ compra1+ " pontos" + "\nSegunda compra: " + compra2 + " pontos"+ "\nTerceira compra: " + compra3+ " pontos" + "\nQuarta compra: " + compra4+ " pontos" + "\nTotal :"+ total+ " pontos");

    }

}