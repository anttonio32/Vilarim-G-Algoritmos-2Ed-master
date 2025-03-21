/*
 algoritmo "VerificaPertence"

var
    x, y, resultado: inteiro

inicio

    // Entrada de dados
    escreva("Digite o valor de X: ")
    leia(x)

    escreva("Digite o valor de Y: ")
    leia(y)

    // Cálculo do resultado
    resultado <- 2 * x + y

    // Verificação se pertence
    se resultado = 3 entao
        escreva("PERTENCE")
    senao
        escreva("NAO PERTENCE")
    fimse

FIM
Teste de Mesa
X	Y	Resultado (2*X + Y)	Pertence?
1	1	3	                PERTENCE
2	2	6	                NAO PERTENCE
0	3	3	                PERTENCE
 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int x,y,result;
        String s_x, s_y;

        s_x = JOptionPane.showInputDialog(null, "Digite o valor de X");
        x = Integer.parseInt(s_x);
        s_y = JOptionPane.showInputDialog(null, "Digite o valor de Y");
        y = Integer.parseInt(s_y);

        result = 2*x+y;
        if(result==3)
        {
            JOptionPane.showMessageDialog(null, " PERTENCE ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " NAO PERTENCE ");
        }
    }
}