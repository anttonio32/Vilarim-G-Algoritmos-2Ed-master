/**
 inicio
 variáveis
 real hpessoa, spessoa, spredio, hpredio

 escreva("Insira a altura da pessoa em metros:")
 leia(s_hpessoa)

 escreva("Insira o tamanho da sombra em metros:")
 leia(s_spessoa)

 escreva("Insira o tamanho da sombra do predio em metros:")
 leia(s_spredio)

 tente
 hpessoa := converte_para_real(s_hpessoa)
 spessoa := converte_para_real(s_spessoa)
 spredio := converte_para_real(s_spredio)

 hpredio := (hpessoa * spredio) / spessoa

 escreva("A altura do predio é ", arredonda(hpredio, 2), " m.")
 capture (NumberFormatException e)
 escreva("Por favor, insira um valor numérico válido")
 fimtente

 fim

 Entrada	       hpessoa	     spessoa        spredio	        hpredio	         Saída
 1.75	           1.75	      1.0	         2.0	           3.50	            A altura do prédio é 3.50 m.
 1.60	           1.60	      0.8	          1.6            	3.20            	A altura do prédio é 3.20 m.
 **/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double hPredio, sPredio, sPessoa, hPessoa;

        String s_hPredio, s_sPredio, s_sPessoa, s_hPessoa;

        s_sPredio = JOptionPane.showInputDialog(null, "Informe o comprimento da sombra do prédio em metros: ");
        s_sPessoa = JOptionPane.showInputDialog(null, "Informe o comprimento da sua sombra em metros: ");
        s_hPessoa = JOptionPane.showInputDialog(null, "Informe sua altura em metros: ");

        sPredio = Double.parseDouble(s_sPredio);
        sPessoa = Double.parseDouble(s_sPessoa);
        hPessoa = Double.parseDouble(s_hPessoa);

        hPredio = (sPredio / sPessoa) * hPessoa;

        JOptionPane.showMessageDialog(null, "Altura do prédio: " + String.format("%.2f", hPredio) + " m.");
    }

}
