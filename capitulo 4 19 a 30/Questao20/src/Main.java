/*
Inicio

VAR
saldo,cliente;

Escreva -> "Digite o seu saldo "
Escreva -> "Digite o nome do cliente"

Se ((saldo<=200)&&(saldo >=0)
     Escreva ->" O saldo do " + cliente + " é zero "

Se Senão ((saldo>200)&&(saldo<=1000))
     Escreva ->" O saldo do " + cliente + " é " + (saldo*0.2)

Se Senão ((saldo>1000)&&(saldo<=2000))
     Escreva ->" O saldo do " + cliente + " é " + ( saldo * 0.3)

Se Senão (saldo>2000)
     Escreva ->" O saldo do " + cliente + " é " + ( saldo * 0.4)

Senão
     Escreva ->" inválido "

FIM
Teste de Mesa
Saldo Cliente Escreva
100     A       Zero
250     B       50.0
4000    C       1600.0

*/
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int saldo;
        String s_saldo,cliente;

        s_saldo = JOptionPane.showInputDialog("Digite o seu saldo");
        saldo = Integer.parseInt(s_saldo);
        cliente = JOptionPane.showInputDialog("Digite o nome do cliente");

        if((saldo<=200)&&(saldo>=0))
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " é zero ");
        }
        else if((saldo>200)&&(saldo<=1000))
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " é " + (saldo*0.2));
        }
        else if ((saldo>1000)&&(saldo<=2000))
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " é " + ( saldo * 0.3));
        }
        else if (saldo>2000)
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " é " + (saldo*0.4));
        }
        else
        {
            JOptionPane.showMessageDialog(null, " inválido ");
        }

    }
}