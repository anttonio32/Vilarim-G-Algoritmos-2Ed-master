/**
 inicio
 variáveis
 real volume, raio, altura, calculo

 escreva("Insira o raio da caixa d'água em centímetros: ")
 leia(raio)

 escreva("Insira a altura da caixa d'água em centímetros: ")
 leia(altura)

 calculo := 3.14 * (raio * raio) * altura  // Cálculo do volume em cm³
 volume := calculo / 1000                   // Conversão de cm³ para litros

 escreva("O volume da caixa d'água é de aproximadamente ", volume, " L")

 fim

 Entrada                       	raio	                     altura	                         cálculo (cm³)	               volume (L)
 insira o raio                    50                                                      3.14*2500*200/1000                  314L

 insira a altura                                              200

 **/

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        double volume, raio, altura;

        String sRaio, sAltura;

        sRaio = JOptionPane.showInputDialog(null, "Informe qual o raio da base da caixa d'água em metro: ");
        sAltura = JOptionPane.showInputDialog(null, "Informe qual a altura da caixa d'água em metro: ");

        raio = Double.parseDouble(sRaio);
        altura = Double.parseDouble(sAltura);

        volume = 3.14 * (raio * raio) * altura;

        JOptionPane.showMessageDialog(null, "O volume da caixa d'água vai ser aproximadamente: " + volume + "m^3");

    }

}
