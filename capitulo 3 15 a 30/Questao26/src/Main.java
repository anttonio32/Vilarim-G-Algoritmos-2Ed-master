/**
 inicio
 inteiro primeiro, segundo, terceiro
 cadeia s_primeiro, s_segundo, s_terceiro
 real pprimeiro, psegundo, pterceiro, total

 escreva("Insira os pontos do 1º colocado:")
 leia(s_primeiro)
 escreva("Insira os pontos do 2º colocado:")
 leia(s_segundo)
 escreva("Insira os pontos do 3º colocado:")
 leia(s_terceiro)

 primeiro := inteiro(s_primeiro)
 segundo := inteiro(s_segundo)
 terceiro := inteiro(s_terceiro)
 total := primeiro + segundo + terceiro

 pprimeiro := (primeiro / total) * 500000
 psegundo := (segundo / total) * 500000
 pterceiro := (terceiro / total) * 500000

 escreva("Premiações:")
 escreva("1º: ", pprimeiro, " R$")
 escreva("2º: ", psegundo, " R$")
 escreva("3º: ", pterceiro, " R$")
 fim
 * primeiro                segundo             terceiro                 total                      calculo                                      saida
 * 300                        200                    100                      600                       (100 / 600) * 500000                 166666.67
 *                                                                                                                   (200 / 600) * 500000               333333.33
 *
 **/


import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        int primeiro, segundo, terceiro;

        String s_primeiro, s_segundo, s_terceiro;

        s_primeiro = JOptionPane.showInputDialog(null, "Insira a quantidade de pontos do primeiro colocado: ");
        s_segundo = JOptionPane.showInputDialog(null, "Insira a quantidade de pontos do segundo colocado: ");
        s_terceiro = JOptionPane.showInputDialog(null, "Insira a quantidade de pontos do terceiro colocado: ");

        primeiro = Integer.parseInt(s_primeiro);
        segundo = Integer.parseInt(s_segundo);
        terceiro = Integer.parseInt(s_terceiro);

        double pprimeiro, psegundo, pterceiro, total;


        total = primeiro + segundo + terceiro;
        pprimeiro = (double) primeiro/total * 500000;
        psegundo =  (double) segundo/total * 500000;
        pterceiro = (double) terceiro/total * 500000;

        JOptionPane.showMessageDialog(null, "Premiações de acordo com os pontos:" + "\n1º: R$" + String.format("%.2f", pprimeiro)+ "\n2º: R$" + String.format("%.2f", psegundo) + "\n3º: R$" + String.format("%.2f", pterceiro));
    }

}
