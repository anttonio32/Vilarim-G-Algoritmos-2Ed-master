/*
algoritmo "VerificaAlturasIdades"

var
    alt1, alt2, alt3, idad1, idad2, idad3, media: real
    nome1, nome2, nome3: caractere

inicio

    // Entrada de dados
    escreva("Digite o valor da Altura do primeiro: ")
    leia(alt1)

    escreva("Digite o valor da altura do segundo: ")
    leia(alt2)

    escreva("Digite o valor da altura do terceiro: ")
    leia(alt3)

    escreva("Digite a idade do primeiro: ")
    leia(idad1)

    escreva("Digite a idade do segundo: ")
    leia(idad2)

    escreva("Digite a idade do terceiro: ")
    leia(idad3)

    escreva("Digite o nome do primeiro: ")
    leia(nome1)

    escreva("Digite o nome do segundo: ")
    leia(nome2)

    escreva("Digite o nome do terceiro: ")
    leia(nome3)

    // Cálculo da média das alturas
    media <- (alt1 + alt2 + alt3) / 3

    // Verificação das alturas
    se (alt1 >= 0) e (alt2 >= 0) e (alt3 >= 0) entao
        se (alt1 > alt2) e (alt1 > alt3) entao
            escreva(nome1, " É O MAIOR")
        senao se (alt2 > alt1) e (alt2 > alt3) entao
            escreva(nome2, " É O MAIOR")
        senao se (alt3 > alt1) e (alt3 > alt2) entao
            escreva(nome3, " É O MAIOR")
        senao
            escreva("INVÁLIDO")
        fimse

        se (alt1 < alt2) e (alt1 < alt3) entao
            escreva(nome1, " É O MAIS BAIXO")
        senao se (alt2 < alt1) e (alt2 < alt3) entao
            escreva(nome2, " É O MAIS BAIXO")
        senao se (alt3 < alt1) e (alt3 < alt2) entao
            escreva(nome3, " É O MAIS BAIXO")
        senao
            escreva("INVÁLIDO")
        fimse
    fimse

    // Verificação das idades
    se (idad1 >= 0) e (idad2 >= 0) e (idad3 >= 0) entao
        se (idad1 > idad2) e (idad1 > idad3) entao
            escreva(nome1, " É O MAIS VELHO")
        senao se (idad2 > idad1) e (idad2 > idad3) entao
            escreva(nome2, " É O MAIS VELHO")
        senao se (idad3 > idad1) e (idad3 > idad2) entao
            escreva(nome3, " É O MAIS VELHO")
        fimse

        se (idad1 < idad2) e (idad1 < idad3) entao
            escreva(nome1, " É O MAIS NOVO")
        senao se (idad2 < idad1) e (idad2 < idad3) entao
            escreva(nome2, " É O MAIS NOVO")
        senao se (idad3 < idad1) e (idad3 < idad2) entao
            escreva(nome3, " É O MAIS NOVO")
        fimse
    fimse

    // Exibição da média das alturas
    se media >= 0 entao
        escreva("A altura média é: ", media)
    senao
        escreva("INVÁLIDO")
    fimse

FIM

Teste de Mesa

N1 / ID1 / ALT1 / N2 / ID2 / ALT2 / N3 / ID3 / ALT3 / MAISALTO / MAISBAIXO / ALTURAMEDIA / MAISVELHO / MAIS MOCO
A    18   1.70    B    20    1.75   C    16    1.69     B           C           1.71          B             C
D    20   1.75    E    20    1.75   F    18    1.74     D           F           1.75          D             F

 */

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int id1,id2,id3;
        double alt1,alt2,alt3,altura_m;
        String n1,n2,n3,m_alto,m_baixo,m_velho,m_moco;


        n1 = JOptionPane.showInputDialog("Digite o nome da pessoa 1:");
        id1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + n1 + " :"));
        alt1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n1 + " :"));
        n2 = JOptionPane.showInputDialog("Digite o nome da pessoa 2:");
        id2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + n2 + " :"));
        alt2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n2 + " :"));
        n3 = JOptionPane.showInputDialog("Digite o nome da pessoa 3:");
        id3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a)" + n3 + " :"));
        alt3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n3 + " :"));
        m_alto = n1;

        if (alt2 > alt1 && alt2 > alt3) {
            m_alto = n2;
        }
        if (alt3 > alt1 && alt3 > alt2) {
            m_alto = n3;
        }

        m_baixo = n1;
        if (alt2 < alt1 && alt2 < alt3) {
            m_baixo = n2;
        }
        if (alt3 < alt1 && alt3 < alt2) {
            m_baixo = n3;
        }

        altura_m = (alt1 + alt2 + alt3) / 3;

        m_velho = n1;
        if (id2 > id1 && id2 > id3) {
            m_velho = n2;
        }
        if (id3 > id1 && id3 > id2) {
            m_velho = n3;
        }

        m_moco = n1;
        if (id2 < id1 && id2 < id3) {
            m_moco = n2;
        }
        if (id3 < id1 && id3 < id2) {
            m_moco = n3;
        }

        JOptionPane.showMessageDialog(null,"Mais alto: " + m_alto + "\n" + "Mais baixo: " + m_baixo + "\n" + "Altura média: " +
                String.format("%.2f", altura_m) + " metros" + "\n" + "Mais velho: " + m_velho + "\n" + "Mais moço: " + m_moco );
    }
}