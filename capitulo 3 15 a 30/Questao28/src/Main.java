/**
 inicio
 variáveis
 real cheque, imposto
 cadeia s_cheque

 escreva("Insira o valor do cheque:")
 leia(s_cheque)

 cheque := converte_para_real(s_cheque)

 imposto := cheque * 0.0038

 escreva("Taxa de CPMF recolhida: R$ ", arredonda(imposto, 2))
 fim
 * TESTE DE MESA
 *     	         cheque	             imposto (0,0038 * cheque)	             Saída
 1000.00	                3.80	                             Taxa de CPMF recolhida: R$ 3.80"
 *
 *
 *
 **/

import javax.swing.JOptionPane;
public class Main {


    public static void main(String[] args) {

        double cheque, calculo;

        String s_cheque;

        s_cheque = JOptionPane.showInputDialog(null," Insira o valor do cheque: ");

        cheque = Double.parseDouble(s_cheque);

        calculo = (cheque * 0.0038);


        if(cheque>0){
            JOptionPane.showMessageDialog(null, "Taxa de CPMF recolhida: " + String.format("%.2f", calculo));
        }

        else{
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor positivo!");
        }

    }

}