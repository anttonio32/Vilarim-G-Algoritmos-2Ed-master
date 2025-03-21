/*
 VAR
inteiro: count->0,num->2
ler resultado->""

enquanto(count menor 5)
{
 se(ehPerfeito(num))
 {
  resultado -> resultado + num + "\n"
  count loop
 }
num loop
}

Escreva("Os 5 primeiros números perfeitos são:" + resultado)

ehPerfeito(inteiro:nume)
{
inteiro: soma->0,i

        para ( i->1; i menor igual nume / 2; i loop)
        {
            se (nume comparado i equivalente 0)
            {
                soma -> soma + i
            }
        }
        retorne soma equivalente nume
}

fim

TESTE DE MESA

ENQUANTO / PARA / ESCREVA
   V         V      6
                    28
                    496
                    8128
                    33550336

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int count = 0,num = 2;
        String resultado = "";

        while (count < 5)
        {
            if (ehPerfeito(num))
            {
                resultado += num + "\n";
                count++;
            }
            num++;
        }

        JOptionPane.showMessageDialog(null, "Os 5 primeiros números perfeitos são:\n" + resultado);
    }

    private static boolean ehPerfeito(int nume)
    {
        int soma = 0;
        for (int i = 1; i <= nume / 2; i++)
        {
            if (nume % i == 0)
            {
                soma += i;
            }
        }
        return soma == nume;
    }
}

