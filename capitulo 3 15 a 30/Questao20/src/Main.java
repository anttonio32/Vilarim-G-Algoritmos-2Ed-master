/**
 inicio
 variáveis
 inteiro novelos, blusas
 real calculo

 escreva("Informe a quantidade de blusas para a confecção:")
 leia(s_blusas)

 escreva("Informe a quantidade total de novelos:")
 leia(s_novelos)

 blusas := converte_para_inteiro(s_blusas)
 novelos := converte_para_inteiro(s_novelos)

 se (blusas > 0) entao
 calculo := novelos / blusas
 escreva("Serão usados ", arredonda(calculo, 2), " novelos por blusa.")
 senao
 escreva("ATENÇÃO!!! O número de blusas deve ser maior que 0.")
 fimse

 fim

 Entrada      	blusas	     novelos	      calculo	       Saída
 5	              5	           10	            2.00	        Serão usados 2.00 novelos por blusa
 3	              3	           15	            5.00	        Serão usados 5.00 novelos por blusa
 0	              0	           10	            ---	            ATENÇÃO!!! O número de blusas deve ser maior que 0

 **/

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        int novelos,blusas;
        double calculo;

        String s_novelos, s_blusas;

        s_blusas = JOptionPane.showInputDialog(null, "Informe a quantidade de blusas para a confeção: ");
        s_novelos = JOptionPane.showInputDialog(null, "Informe a quantidade total de novelos: ");

        novelos = Integer.parseInt(s_novelos);
        blusas = Integer.parseInt(s_blusas);



        if(blusas > 0) {
            calculo = (double) novelos / blusas;

            JOptionPane.showMessageDialog(null, "Serão usados " + calculo + " novelos por blusa.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Informe uma quantidade maior que 0.");
        }

    }

}