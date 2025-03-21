/*
var
    x, y, resultado: inteiro

inicio

    escreva("Digite o valor de X: ")
    leia(x)

    escreva("Digite o valor de Y: ")
    leia(y)


    resultado <- 2 * x + y


    se resultado = 3 entao
        escreva("PERTENCE")
        escreva("A = (", x, ",", y, ")")
        escreva("B = (", x, ",", y, ")")
    senao
        escreva("NAO PERTENCE")
    fimse

    FIM
Teste de Mesa
X	Y	Resultado (2*X + Y)	Pertence?	Saída
1	1	3	                PERTENCE	"PERTENCE"
"A = (1,1)"
"B = (1,1)"
2	2	6	                NAO PERTENCE	"NAO PERTENCE"
0	3	3	                PERTENCE	"PERTENCE"
"A = (0,3)"
"B = (0,3)"
-1	5	3	                PERTENCE	"PERTENCE"
"A = (-1,5)"
"B = (-1,5)"
3	-3	3	                PERTENCE	"PERTENCE"
"A = (3,-3)"
"B = (3,-3)"

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int x,y,a,b,result;
        String s_x, s_y, s_a, s_b;

        s_a = JOptionPane.showInputDialog(null, "Digite o valor de A");
        a = Integer.parseInt(s_a);
        s_b = JOptionPane.showInputDialog(null, "Digite o valor de B");
        b = Integer.parseInt(s_b);
        s_x = JOptionPane.showInputDialog(null, "Digite o valor de X");
        x = Integer.parseInt(s_x);
        s_y = JOptionPane.showInputDialog(null, "Digite o valor de Y");
        y = Integer.parseInt(s_y);

        result = 2*x+y;
        if(result==3)
        {
            JOptionPane.showMessageDialog(null, " PERTENCE ");
            JOptionPane.showMessageDialog(null, " A = ("+ a + "," + b + ")");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " NAO PERTENCE ");
            JOptionPane.showMessageDialog(null, " A = ("+ a + "," + b + ")");
        }
    }
}