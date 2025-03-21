/*
VAR
inteiro: num1->1,num2->1,prox,i
leia: result

para(i igual 0;i menor 16;i loop)
{

DEFINIÇÃO
prox -> num1 + num2
result -> result + ", " + prox
num -> num2
num2 -> prox

}

Escreva("Os primeiros números de fibonacci são: " + num1 + ", " + num2)

fim

TESTE DE MESA

PARA / ESCREVA
 V    1,1,2,3,5,8,13,21,34,55,89,144,233,377,610

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num1=1,num2=1,prox;
        String result = "Os primeiros números de fibonacci são: " + num1 + "," + num2;

        for(int i=3;i<16;i++)
        {
            prox=num1+num2;
            result+="," +  prox;
            num1=num2;
            num2=prox;
        }
        JOptionPane.showMessageDialog(null, result);
    }
}