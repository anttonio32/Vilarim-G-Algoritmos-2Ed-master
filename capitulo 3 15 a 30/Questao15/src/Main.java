/**
 inicio
 variáveis
 real totalConta, carlos, andre, felipe
 inteiro valorInteiroCarlos, valorInteiroAndre

 escreva("Insira o valor total da conta R$: ")
 leia(s_totalConta)

 totalConta := converte_para_real(s_totalConta)

 carlos := valorInteiroCarlos
 andre := valorInteiroAndre
 felipe := totalConta - (carlos + andre)

 se (totalConta <= 0) entao
 escreva("Número inválido.")
 senao
 valorInteiroCarlos := parte_inteira(totalConta / 3)
 valorInteiroAndre := parte_inteira(totalConta / 3)


 escreva("Carlos pagará: R$ ", arredonda(carlos, 2))
 escreva("André pagará: R$ ", arredonda(andre, 2))
 escreva("Felipe pagará: R$ ", arredonda(felipe, 2))

 fim

 TESTE DE MESA

 Entrada	valorconta	valordividido	valorsemcentavos	diferenca	Carlos	André	Felipe
 100.00	100.00	33.33	33	0.01	33	33	33.34
 150.00	150.00	50.00	50	0.00	50	50	50.00


 **/
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double totalConta, carlos, andre, felipe;

        String s_totalConta;

        s_totalConta = JOptionPane.showInputDialog(null, "Valor total da conta R$:");

        totalConta = Double.parseDouble(s_totalConta);

        carlos = Math.floor(totalConta / 3);
        andre = Math.floor(totalConta / 3);
        felipe = totalConta - (carlos + andre);

        if (totalConta <= 0){
            JOptionPane.showMessageDialog(null, "Número Inválido.");
        } else {
            JOptionPane.showMessageDialog(null, "Conta" + "\nCarlos: R$ " + carlos + "\nAndré: R$ " + andre + "\nFelipe: R$ " + felipe + "\n------------------------" + "\nValor total: R$ " + totalConta);
        }

    }
}