/*
VAR
inteiro:a->0,v_neg->0,i

INICIO

para(i igual 0;i menor 5;i loop)
{
 Leia("Digite um valor da variável 'A': " + (i+1) ":")

 se(a menor 0)
  {
   v_neg -> v_neg + 1
  }

}

Escreva("Valor(es) negado(s): " + v_neg)

fim


TESTE DE MESA

A1 / A2 / A3 / A4 / A5 / ESCREVA
-1   0    1    2    3      1
1    0    0    0    0      0
-9  -8   -7   -6   -5      5

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int a=0,v_neg=0;

        for(int i=0;i<5;i++)
        {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor da variável 'A': " +( i + 1) + ":" ));

            if(a<0)
            {
                v_neg+=1;
            }

        }
        JOptionPane.showMessageDialog(null,"Valor(es) negado(s): " + v_neg);
    }
}