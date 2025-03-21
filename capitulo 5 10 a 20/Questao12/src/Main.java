/*
 VAR
inteiro: num,ma(VALORMINIMO),me(VALORMAXIMO),soma->0,quant->500
real:med

INICIO

para(inteiro i->0;i<500;i loop)
{
Leia("Digite o valor " + (i+1) + ":")

se(num maior 0)
 {
  se(num maior ma)
  {
   ma->num
  }
  se(num menor me)
  {
   me->num
  }
 }
senao
 {
  Escreva("Valor inválido")
  pare
 }

soma -> soma + num
}

med -> soma/quant

Escreva("Maior número: " + ma + "Menor número: " + me + "Média de números lidos: " +  med)

fim


TESTE DE MESA

250X(METADE1) / 250X(METADE2) / SE1 / SENAO / MA / ME / MED
     1              2            V      F     2    1    1.5
     0              -            F      V     -    -     -
     1              0            F      V     -    -     -

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num,ma=Integer.MIN_VALUE,me=Integer.MAX_VALUE,soma=0,quant=500;
        double med;

        for(int i=0;i<500;i++)
        {
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor " + (i+1) + ":"));

            if(num>0)
            {
                if(num>ma)
                {
                    ma=num;
                }
                if(num<me)
                {
                    me=num;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Valor inválido");
                return;
            }

            soma+=num;
        }

        med = soma/quant;

        JOptionPane.showMessageDialog(null,"Maior número: " + ma + "\n" + "Menor número: " + me + "\n" + "Média de números lidos: " +  med);
    }
}