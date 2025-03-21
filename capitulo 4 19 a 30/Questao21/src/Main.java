/*
var
    salario, diferenca, novoSalario: real
    cargo: caractere

inicio

    escreva("Digite aqui o salário: ")
    leia(salario)

    escreva("Digite aqui o seu cargo: \n1- Gerente \n2- Analista \n3- Técnico \n")
    leia(cargo)

    Se (salario >0)
            escolha cargo
                  caso 91:
                     novoSalario <- salario + salario * 0.1
                     diferenca <- novoSalario - salario
                     escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)

                  caso 92:
                     novoSalario <- salario + salario * 0.2
                     diferenca <- novoSalario - salario
                     escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)

                  caso 93:
                     novoSalario <- salario + salario * 0.3
                     diferenca <- novoSalario - salario
                     escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)
                  padrão:
                     novoSalario <- salario + salario * 0.355
                     diferenca <- novoSalario - salario
                     escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)

    Senão
       Escreva("O valor do Sálario esta Inválido")

    FIM

TESTE DE MESA
SALARIO // CARGO // NOVO SALARIO // DIFERENÇA
1200   //  91  // 1320         120
1550   // 92  // 1860          310
1320    //93   //1716    //     396
-1500    //  QUALQUER // INVÁLIDO     -
 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int codigo;
        double salario;
        String s_codigo,s_salario;

        s_salario = JOptionPane.showInputDialog(null, "Digite o valor do Sálario");
        salario = Double.parseDouble(s_salario);
        s_codigo = JOptionPane.showInputDialog(null, "Digite o Código do Cargo");
        codigo = Integer.parseInt(s_codigo);


        if(salario > 0){

            switch (codigo)
            {
                case 91:
                    JOptionPane.showMessageDialog(null, String.format("O Sálario era de %.2f ficou %.2f e a diferança e de %.2f", + salario,salario+(salario*0.1),((salario+(salario*0.1))-salario)));
                    break;
                case 92:
                    JOptionPane.showMessageDialog(null, String.format("O Sálario era de %.2f ficou %.2f e a diferança e de %.2f", + salario,salario+(salario*0.2),((salario+(salario*0.2))-salario)));
                    break;
                case 93:
                    JOptionPane.showMessageDialog(null, String.format("O Sálario era de %.2f ficou %.2f e a diferança e de %.2f", + salario,salario+(salario*0.3),((salario+(salario*0.3))-salario)));
                    break;
                default :
                    JOptionPane.showMessageDialog(null, String.format("O Sálario era de %.2f ficou %.2f e a diferança e de %.2f", + salario,salario+(salario*0.3505),((salario+(salario*0.3505))-salario)));
                    break;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O valor do Sálario esta Inválido");
        }
    }
}