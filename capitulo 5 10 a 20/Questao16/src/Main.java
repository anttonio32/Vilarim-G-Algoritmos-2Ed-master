/*
 VAR
inteiro:num_sec,palp=0,tent=0

INICIO

Escreva("Usuário 1, Digite o seu número:")

para(tent->0;palp diferente num_sec;tent loop)
{
 se(palp equivalente num_sec)
 {
  Escreva("Parabéns! Você acertou!" + "\n" + "Número de tentatias: " + tent)
  retorne
 }
 senao se(palp  menor num_sec)
 {
 Escreva("Seu número é menor do que o meu.")
 }
 senao
 {
  JOptionPane.showMessageDialog(null, "Seu número é maior do que o meu.")
 }
}

fim

TESTE DE MESA

NUM_SEC / TENT / PALP / SE / SENAO SE / SENAO / ESCREVA
  1        1      1     V       F         F        V

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num_sec,palp=0;

        num_sec = Integer.parseInt(JOptionPane.showInputDialog("Usuário 1, Digite o seu número:"));

        for (int tent=0;palp!=num_sec ; tent++)
        {
            palp = Integer.parseInt(JOptionPane.showInputDialog("Usuário 2, adivinhe o número:"));

            if (palp == num_sec)
            {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!" + "\n" + "Número de tentatias: " + tent );
                return;
            }
            else if (palp < num_sec)
            {
                JOptionPane.showMessageDialog(null, "Seu número é menor do que o meu.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Seu número é maior do que o meu.");
            }
        }
    }
}