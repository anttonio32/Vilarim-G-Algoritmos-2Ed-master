/*
VAR
inteiro: voto,voto_f->0,voto_e->0,nulo->0,branco->0,total->0,i
leia: venc->""

INICIO

para(i igual 0;;i loop)
{

Escreva("Digite seu voto eleitor " + (i+1) + "\n" + "'1' para FIRMINO | '2' para EUGÊNIA | '0' para branco | '9' para nulo | '3' para sair")

se((voto equivalente 1)ou(voto equivalente 2)ou(voto equivalente 0)ou(voto equivalente 9)ou(voto equivalente 3))
{
 se(voto equivalente 1)
   {
    voto_f->voto_f+1
   }
  senao se(voto equivalente 2)
    {
     voto_e->voto_e+1
    }
  senao se(voto equivalente 0)
    {
     branco->branco+1
    }
  senao se(voto equivalente 9)
    {
     nulo->nulo+1
    }
   senao se(voto equivalente 3)
    {
     Escreva("Candidato vencedor: "+venc+"\n"+"Número de votos em branco: "+branco+"\n"+"Número de votos nulos: "+nulo+"\n"+"Número de eleitores: " + total);
     retorne
     }
  }
senao
{
Escreva("Voto inválido")
retorne
}

DEFINIÇÃO
voto -> voto_e + voto_f + branco + nulo
total -> voto

 se(voto_f maior voto_e)
 {
  venc -> "Firmino"
  }
  senao se(voto_e maior voto_f)
  {
   venc -> "Eugênia"
   }
   senao
   {
    venc -> "Firmino"
    }
}

fim

TESTE DE MESA

VOTO(2X) / VOTO(1X) / VOTO(4X) / VOTO(2X)/ VOTO(OPSAO SAIR) / SE1 / SENAO1 / ESCREVA
   2          1           0        9             3             V      F     CANDIDATO VENCEDOR:EUGÊNIA
                                                                            NÚMERO DE VOTOS EM BRANCO:4
                                                                            NUMERO DE VOTOS NULO:2
                                                                            NUMERO DE ELEITORES:9

VOTO(2X) / VOTO(2X) / VOTO(1X) / VOTO(OPSAO SAIR) / SE1 / SENAO1 / ESCREVA
    1         2          0              3           V       F    CANDIDATO VENCEDOR:Inválido
                                                                 NÚMERO DE VOTOS EM BRANCO:1
                                                                 NUMERO DE VOTOS NULO:0
                                                                 NUMERO DE ELEITORES:5

VOTO(1X) / SE1 / SENAO1 / ESCREVA
    4       F      V     VOTO INVÁLIDO

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int voto,voto_f=0,voto_e=0,nulo=0,branco=0,total=0;
        String venc="";

        for(int i=0;;i++)
        {
            voto=Integer.parseInt(JOptionPane.showInputDialog("Digite seu voto eleitor " + (i+1) + "\n" +
                    "'1' para FIRMINO | '2' para EUGÊNIA | '0' para branco | '9' para nulo | '3' para sair"));

            if((voto==1)||(voto==2)||(voto==0)||(voto==9)||(voto==3))
            {
                if(voto==1)
                {
                    voto_f+=1;
                }
                else if(voto==2)
                {
                    voto_e+=1;
                }
                else if(voto==0)
                {
                    branco+=1;
                }
                else if(voto==9)
                {
                    nulo+=1;
                }
                else if(voto==3)
                {
                    JOptionPane.showMessageDialog(null,"Candidato vencedor: "+venc+"\n"+"Número de votos em branco: "+branco+"\n"+"Número de votos nulos: "+nulo+"\n"+"Número de eleitores: " + total);
                    return;
                }
            }

            else
            {
                JOptionPane.showMessageDialog(null, "Voto inválido");
                return;
            }

            voto=voto_e+voto_f+branco+nulo;
            total=voto;

            if(voto_f>voto_e)
            {
                venc="Firmino";
            }
            else if (voto_e>voto_f)
            {
                venc="Eugênia";
            }
            else if(voto_f==voto_e)
            {
                venc="Inválido";
            }

        }
    }
}