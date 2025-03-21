/*
algoritmo "VerificaPertence"

var
    a, b, x, numero: inteiro

inicio

    // Entrada de dados
    escreva("Digite o valor de A: ")
    leia(a)

    escreva("Digite o valor de B: ")
    leia(b)

    escreva("Digite o número: ")
    leia(numero)

    // Cálculo de x
    x <- (a + b) * (a + b)

    // Verificação se x é igual ao número
    se x = numero entao
        escreva("PERTENCE")
    senao
        escreva("NAO PERTENCE")
    fimse

FIM
Teste de Mesa
A	B	Número	X = (A + B)²	Pertence?
1	2	9	9	        PERTENCE
3	4	49	49	        PERTENCE
2	2	15	16	        NAO PERTENCE
 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int numero,soma,resultado,parte1,parte2;
        String s_numero;

        s_numero = JOptionPane.showInputDialog("Digite um número para verificar a característica:");
        numero = Integer.parseInt(s_numero);

        if (numero > 1000 || numero < 9999)
        {
            parte1 = numero / 100;
            parte2 = numero % 100;

            soma = parte1 + parte2;
            resultado = soma * soma;

            if (resultado == numero) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " satisfaz a característica.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não satisfaz a característica.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número deve ter exatamente 4 dígitos.");

        }
    }
}