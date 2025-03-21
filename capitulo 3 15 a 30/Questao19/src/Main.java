/**
 inicio
 variáveis
 inteiro frangos
 real custo

 escreva("Insira a quantidade de frangos contidos na granja:")
 leia(s_frangos)

 frangos := converte_para_inteiro(s_frangos)
 custo := frangos * 11

 escreva("O valor total gasto com os frangos é: ", arredonda(custo, 2), "R$")

 fim

 TESTE

 Entrada	frangos	custo
 100	     100	    1100.00 R$
 200	     200	  2200.00 R$
 **/

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        double quantFrangos, anelChip, anel, gastoTotal;

        String s_quantFrangos;

        s_quantFrangos = JOptionPane.showInputDialog(null, "Frangotech \nQuantidade de frangos: ");

        quantFrangos = Double.parseDouble(s_quantFrangos);

        anelChip = 4;
        anel = 3.50 * 2;
        gastoTotal = (quantFrangos * anelChip) + (quantFrangos * anel);

        JOptionPane.showMessageDialog(null, "Frangotech \nGasto total da granja: R$ " + gastoTotal);

    }

}
