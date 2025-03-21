/*
VAR
inteiro: i
ler num=""

INICIO

para(i->1000;i<1999;i + i -> 11)
{
 num -> num + i + "\n"
}
Escreva("Números entre 1000 e 1999 que diididos por 11 dão resto 5:" + num)

fim

TESTE DE MESA

PARA / ESCREVA
 V       V

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String num="";

        for(int i=1000;i<1999;i+=11)
        {
            num+=i+"\n";
        }
        JOptionPane.showMessageDialog(null, "Números entre 1000 e 1999 que divididos por 11 dão resto 5:\n" + num);
    }
}