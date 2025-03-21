/**
 inicio
 variáveis
 real sanduiches, queijo, presunto, hamburguer

 escreva("Insira a quantidade de sanduíches:")
 leia(s_sanduiches)

 queijo := 0.100
 presunto := 0.050
 hamburguer := 0.100

 se (sanduiches > 1) entao
 queijo := 0.100 * sanduiches
 presunto := 0.050 * sanduiches
 hamburguer := 0.100 * sanduiches
 fimse

 escreva("Quantidade de ingredientes:")
 escreva("Queijo: ", queijo, "KG")
 escreva("Presunto: ", presunto, "KG")
 escreva("Hambúrguer: ", hamburguer, "KG")

 fim
 TESTE DE MESA
 sanduíches /       queijo	       /         presunto             /	            hambúrguer
 5             0.100 * 5 = 0.5 KG        0.50 * 5 = 0.25KG                0.100 * 5 = 0.5 KG

 1                0.100                      0.050                          0.100






 **/


import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        double queijo, presunto, hamburguer;
        int sanduiches;

        String s_Sanduiches;

        s_Sanduiches = JOptionPane.showInputDialog(null, "Lanchonete Gostosura \nQuantidade de sanduíches: ");

        sanduiches = Integer.parseInt(s_Sanduiches);

        queijo = sanduiches * 0.1;
        presunto = sanduiches * 0.05;
        hamburguer = sanduiches * 0.1;

        if (sanduiches < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        } else {
            JOptionPane.showMessageDialog(null, "Lanchonete Gostosura \nSanduíches: " + sanduiches + "\nIngredientes: \nQueijo " + queijo + " (kg)" + " \nPresunto " + presunto + " (kg)" + "\nRodela de hambúrguer " + hamburguer + " (kg)");
        }

    }
}