/**
 inicio
 variáveis
 real a, b, x
 cadeia s_a, s_b

 escreva("Insira o coeficiente A: ")
 leia(s_a)

 escreva("Insira o coeficiente B: ")
 leia(s_b)

 a := converte_para_real(s_a)
 b := converte_para_real(s_b)

 se (a != 0) então
 x := -b / a
 escreva("A reta toca o eixo X na coordenada: X = ", arredonda(x, 2))
 senao
 escreva("O coeficiente A deve ser diferente de 0.")
 fimse
 fim
 *
 *  A           B              calculo                                         saida
 *  2           4            x = -b/a = -4/2 = -2"                       A reta toca o eixo X na coordenada: X = -2.00"
 *
 *
 **/

import javax.swing.JOptionPane;
public class Main {


    public static void main(String[] args) {

        double a, b, x;

        String  s_a, s_b;

        s_a = JOptionPane.showInputDialog(null,"Insira o coeficiente A: ");
        s_b = JOptionPane.showInputDialog(null,"Insira o coeficiente B: ");

        a = Double.parseDouble(s_a);
        b = Double.parseDouble(s_b);

        x = -b/a;


        if(a!=0){
            JOptionPane.showMessageDialog(null, "A reta toca o eixo X na coordenada: X ="+ String.format("%.2f",x));
        }

        else{
            JOptionPane.showMessageDialog(null, "O coeficiente deve ser diferente de 0.");
        }


    }

}