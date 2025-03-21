/**
 inicio
 variáveis
 real hnormal, hextra, salariob, salarioL, desconto

 escreva("Insira o total de horas normais trabalhadas:")
 leia(s_hnormal)

 escreva("Insira o total de horas extras trabalhadas:")
 leia(s_hextra)

 hnormal := converte_para_real(s_hnormal)
 hextra := converte_para_real(s_hextra)

 salariob := (hnormal * 10) + (hextra * 15)
 desconto := salariob * 0.1
 salarioL := salariob - desconto

 escreva("Salário bruto: ", salariob, "R$")
 escreva("Salário líquido: ", salarioL, "R$")

 fim
 TESTE DE MESA
 Entrada	                   hnormal	           hextra	        salariob	desconto	salarioL
 160 horas normais	         160	             10	            1750.00	       175.00	1575.00
 180 horas normais	         180	             20	            1950.00	       195.00	1755.00

 **/

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        double horaNormal, horaExtra, salarioBruto, salarioLiquido,desconto;

        String s_horaNormal, s_horaExtra;

        s_horaNormal = JOptionPane.showInputDialog(null, "Hipotheticus \nInforme o total de horas normais trabalhadas: ");
        s_horaExtra= JOptionPane.showInputDialog(null, "Hipotheticus \nInforme o total de horas extras trabalhadas: ");

        horaNormal = Double.parseDouble(s_horaNormal);
        horaExtra = Double.parseDouble(s_horaExtra);


        salarioBruto = (horaNormal * 10) + (horaExtra * 15);
        salarioLiquido = salarioBruto * 0.9;
        JOptionPane.showMessageDialog(null, "Hipotheticus \nSalario bruto: R$" + salarioBruto + "\nSalario liquido: R$"+ salarioLiquido);

    }

}
