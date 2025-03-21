/*
 VAR
inteiro:num
longo:fat -> 0

INICIO

Leia("Digite o número:")

DEFINIÇÃO
fat -> 1

para(i igual 1;i menor igual num; i loop)
 {
 fat -> fat * i
 }

Escreva("Fatorial de " + num + "Resultado: " + fat)

fim


TESTE DE MESA

NUM / ESCREVA
0        1
1        1
5       120
10    3.628.800

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num;
        long fat=0;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número:"));

        fat=1;

        for (int i = 1; i <= num; i++)
        {
            fat *= i;
        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + num + "!" + "\n" + "Resultado: " + fat);

    }
}