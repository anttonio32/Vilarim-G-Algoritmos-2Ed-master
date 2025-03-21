/*
VAR
inteiro: total_p->50,count_m->0
real: i,alt,ma_alt->(VALORMINIMO),me_alt->(VALORMAXIMO),soma->0,soma_m->0,media_m->0,media_alt->0
caractere: sexo

INICIO

para(i->0;i<total_p;i loop)
{
Escreva("Digite a altura em metros " + (i + 1) + ":")

DEFINIÇÃO
soma -> soma + alt

se((alt maior 0) e (alt menor 3.00))
 {
  se(alt maior ma_alt)
  {
    ma_alt -> alt
  }
  se(alt menor me_alt)
 {
  me_alt -> alt
 }
 }

senao
 {
  Escreva("Valor inválido")
  retorne
 }

Escreva("Digite o sexo " + (i + 1) + " ('m' para masculino, 'f' para feminino):")

se((sexo diferente 'f') e (sexo diferente 'm'))
 {
  Escreva("Caractére inválido")
  retorne
 }
senao se(sexo equialente 'f')
 {
  soma_m -> soma_m + alt
  count_m loop
 }
}

media_alt -> soma / total_p

 se (count_m maior 0)
  {
    media_m -> soma_m / count_m
   }

Escreva("Maior altura: " + ma_alt + "Menor altura: " + me_alt +
        "Média da altura das mulheres: " + media_m + "Média da altura da turma: " + media_alt)

fim

TESTE DE MESA

ALT(25X)1 / SEXO(25X)1 / ALT(25X)2 / SEXO(25X)2 / SE1 / SENAO1 / SENAO SE / MA_ALT / ME_ALT / MEDIA_M / MEDIA_ALT
   1.72         M          1.70          F        V       F       V           V      1.72      1.70       1.7
    0           -            -           -        F       V       -           -       -         -         -
   1.70         E            -           -        V       F       F           F       -         -         -

*/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int total_p = 50,count_m = 0;
        double alt,ma_alt = Double.MIN_VALUE,me_alt = Double.MAX_VALUE,soma = 0,soma_m = 0,media_m=0,media_alt=0;
        char sexo;
        String ssexo;

        for (int i = 0; i < total_p; i++)
        {
            alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros " + (i + 1) + ":"));
            soma += alt;
            if((alt>0)&&(alt<3.00))
            {
                if (alt > ma_alt)
                {
                    ma_alt = alt;
                }
                if (alt < me_alt)
                {
                    me_alt = alt;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Valor inválido");
                return;
            }
            ssexo = JOptionPane.showInputDialog("Digite o sexo " + (i + 1) + " ('m' para masculino, 'f' para feminino):");
            sexo = ssexo.toUpperCase().charAt(0);

            if (sexo=='f')
            {
                soma_m += alt;
                count_m++;
            }
        }
        media_alt = soma / total_p;
        if (count_m > 0) {
            media_m = soma_m / count_m;
        }
        JOptionPane.showMessageDialog(null,"Maior altura: " + ma_alt + "\n" + "Menor altura: " + me_alt + "\n" +
                "Média da altura das mulheres: " + media_m + "\n" + String.format("Média da altura da turma: %.2f", media_alt));
    }
}