/**
 inicio
 variáveis
 real g, m, p, ano, calculo
 cadeia s_g, s_m, s_p, s_ano

 escreva("Insira o total de projetos de grande porte feitos: ")
 leia(s_g)

 escreva("Insira o total de projetos de médio porte feitos: ")
 leia(s_m)

 escreva("Insira o total de projetos de pequeno porte feitos: ")
 leia(s_p)

 escreva("Insira o total de anos trabalhados na empresa: ")
 leia(s_ano)

 calculo := (g * 10) + (m * 5) + (p * 2) + (ano * 2)

 se (ano > 0) entao
 escreva("O total de pontos acumulados é de: ", calculo)
 senao
 escreva("Você deve trabalhar na empresa para consultar esta informação.")
 fimse
 fim

 * G          M           P            ANO                                       calculo                                                 escreva
 * 3           2           1            5                   calculo = (3 * 10) + (2 * 5) + (1 * 2) + (5 * 2)                     "O total de pontos acumulados é de: 52"
 * 2           1           3            0                                    ''                                               "Você deve trabalhar na empresa para consultar esta informação."
 *

 **/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int projetoG, projetoM, projetoP, tempEmpresa, totalPontos;
        String s_projetoG, s_projetoM, s_projetoP, s_tempEmpresa;

        s_projetoG = JOptionPane.showInputDialog(null, "Participação em um projeto de grande porte \nQuantidade de vezes participadas:");
        s_projetoM = JOptionPane.showInputDialog(null, "Participação em um projeto de médio porte \nQuantidade de vezes participadas:");
        s_projetoP = JOptionPane.showInputDialog(null, "Participação em um projeto de pequeno porte \nQuantidade de vezes participadas:");
        s_tempEmpresa = JOptionPane.showInputDialog(null, "Tempo do funcionário na empresa em anos:");

        projetoG = Integer.parseInt(s_projetoG);
        projetoM = Integer.parseInt(s_projetoM);
        projetoP = Integer.parseInt(s_projetoP);
        tempEmpresa = Integer.parseInt(s_tempEmpresa);

        totalPontos = (projetoG * 10) + (projetoM * 5) + (projetoP * 2) + (tempEmpresa * 2);

        JOptionPane.showMessageDialog(null, "Total de pontos acumulados do funcionário: " + totalPontos + " pontos.");

    }

}
