/*
INICIO

VAR
car;

Escreva ->"Digite o Caractere"

Se ( (car.equals("a")) || (car.equals("e")) || (car.equals("i")) || (car.equals("o")) || (car.equals("u")))
     Escreva ->"O Caractere e uma Vogal"

Se Senão ((car.equals("b")) ||(car.equals("c")) ||(car.equals("d")) ||(car.equals("f")) ||(car.equals("g")) ||(car.equals("h")) ||(car.equals("j")) ||
         (car.equals("k")) ||(car.equals("l")) ||(car.equals("m")) ||(car.equals("n")) ||(car.equals("p")) ||(car.equals("q")) ||(car.equals("r")) ||(car.equals("s")) ||
         (car.equals("t")) ||(car.equals("v")) ||(car.equals("w")) ||(car.equals("x")) ||(car.equals("y")) ||(car.equals("z")))
     Escreva ->"O Caractere e uma Consoante"

Senão
     Escreva ->"O Caractere e Outro"

FIM

Teste de Messa
Car Escreva
A   Vogal
D   Consoante
I   Vogal
*/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String car;

        car = JOptionPane.showInputDialog("Digite o Caractere");

        if ( (car.equals("a")) || (car.equals("e")) || (car.equals("i")) || (car.equals("o")) || (car.equals("u")))
        {
            JOptionPane.showMessageDialog(null, "O Caractere e uma Vogal");
        }
        else if ((car.equals("b")) ||(car.equals("c")) ||(car.equals("d")) ||(car.equals("f")) ||(car.equals("g")) ||(car.equals("h")) ||(car.equals("j")) ||
                (car.equals("k")) ||(car.equals("l")) ||(car.equals("m")) ||(car.equals("n")) ||(car.equals("p")) ||(car.equals("q")) ||(car.equals("r")) ||(car.equals("s")) ||
                (car.equals("t")) ||(car.equals("v")) ||(car.equals("w")) ||(car.equals("x")) ||(car.equals("y")) ||(car.equals("z")))
        {
            JOptionPane.showMessageDialog(null, "O Caractere e uma Consoante");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O Caractere e Outro");
        }
    }
}