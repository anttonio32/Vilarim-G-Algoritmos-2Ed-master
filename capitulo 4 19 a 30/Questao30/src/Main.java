/*
 algoritmo "CalculaPrecoProduto"

var
    codigo, tipo, quantidade: inteiro
    precototal1N, precototal1D, precototal2N, precototal2D, precototal3N, precototal3D: real
    s_codigo, s_tipo, s_quantidade: caractere

inicio

    // Entrada de dados
    escreva("O Código do Produto \nApenas Números Inteiros \n1 - Meia-Cola \n2 - Limonax \n3 - Orange: ")
    leia(codigo)

    escreva("O Tipo do Produto \nApenas Números Inteiros \n1 - Normal \n2 - Diet: ")
    leia(tipo)

    escreva("A Quantidade do Produto \nApenas Números Inteiros: ")
    leia(quantidade)

    // Verificação do código do produto
    se (codigo > 0) e (codigo < 4) entao
        // Verificação do tipo do produto
        se (tipo > 0) e (tipo < 3) entao
            // Verificação se o preço total é maior que 100
            se (precototal1N > 100) ou (precototal1D > 100) ou (precototal2N > 100) ou (precototal2D > 100) ou (precototal3N > 100) ou (precototal3D > 100) entao
                // Verificação da quantidade
                se quantidade > 0 entao
                    // Verificação do tipo (Normal ou Diet)
                    se tipo = 1 entao
                        escolha codigo
                            caso 1:
                                escreva("O preço fica: ", precototal1N - (precototal1N * 0.05))
                            caso 2:
                                escreva("O preço fica: ", precototal2N - (precototal2N * 0.05))
                            caso 3:
                                escreva("O preço fica: ", precototal3N - (precototal3N * 0.05))
                            outrocaso:
                                escreva("Produto Inválido")
                        fimescolha
                    senao
                        escolha codigo
                            caso 1:
                                escreva("O preço fica: ", precototal1D - (precototal1D * 0.05))
                            caso 2:
                                escreva("O preço fica: ", precototal2D - (precototal2D * 0.05))
                            caso 3:
                                escreva("O preço fica: ", precototal3D - (precototal3D * 0.05))
                            outrocaso:
                                escreva("Produto Inválido")
                        fimescolha
                    fimse
                senao
                    escreva("Quantidade de Produto Inválido")
                fimse
            senao
                // Verificação da quantidade
                se quantidade > 0 entao
                    // Verificação do tipo (Normal ou Diet)
                    se tipo = 1 entao
                        escolha codigo
                            caso 1:
                                escreva("O preço fica: ", precototal1N)
                            caso 2:
                                escreva("O preço fica: ", precototal2N)
                            caso 3:
                                escreva("O preço fica: ", precototal3N)
                            outrocaso:
                                escreva("Produto Inválido")
                        fimescolha
                    senao
                        escolha codigo
                            caso 1:
                                escreva("O preço fica: ", precototal1D)
                            caso 2:
                                escreva("O preço fica: ", precototal2D)
                            caso 3:
                                escreva("O preço fica: ", precototal3D)
                            outrocaso:
                                escreva("Produto Inválido")
                        fimescolha
                    fimse
                senao
                    escreva("Quantidade de Produto Inválido")
                fimse
            fimse
        senao
            escreva("Tipo de Produto Inválido")
        fimse
    senao
        escreva("Código de Produto Inválido")
    fimse

FIM
Teste de Mesa
Código	Tipo Quantidade	Preço Total (Normal)	Preço Total (Diet)	Condição (Preço > 100)	Saída Esperada
1	1	10	120.0 110.0	Sim	"O preço fica: 114.00" (120.0 - 5% de desconto)
2	2	5	90.0  80.0	Não	"O preço fica: 80.00" (sem desconto)
3	1	20	150.0 140.0	Sim	"O preço fica: 142.50" (150.0 - 5% de desconto)
1	2	0	120.0 110.0	Sim	"Quantidade de Produto Inválido"
4	1	10	-	-	-	"Código de Produto Inválido"
2	3	5	-	-	-	"Tipo de Produto Inválido"
*/

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int codigo,tipo,quantidade;
        double preco1N,preco1D,preco2N,preco2D,preco3N,preco3D,precototal1N,precototal1D,precototal2N,precototal2D,precototal3N,precototal3D;
        String s_codigo,s_tipo,s_quantidade;

        s_codigo = JOptionPane.showInputDialog("o Codigo do Produto \nApenas Números Inteiros \n1 - Meia-Cola \n2 - Limonax \n3 - Orange ");
        codigo = Integer.parseInt(s_codigo);
        s_tipo = JOptionPane.showInputDialog("o Tipo do Produto \nApenas Números Inteiros \n1 - Normal \n2 - Diet");
        tipo = Integer.parseInt(s_tipo);
        s_quantidade = JOptionPane.showInputDialog("A Quantidade do Produto \nApenas Números Inteiros");
        quantidade = Integer.parseInt(s_quantidade);

        preco1N = 1.50;
        preco1D = 1.70;
        preco2N = 1.60;
        preco2D = 1.70;
        preco3N = 1.40;
        preco3D = 1.45;
        precototal1N = (quantidade*preco1N);
        precototal1D = (quantidade*preco1D);
        precototal2N = (quantidade*preco2N);
        precototal2D = (quantidade*preco2D);
        precototal3N = (quantidade*preco3N);
        precototal3D = (quantidade*preco3D);


        if ((codigo > 0) && (codigo < 4))
        {
            if ((tipo >0) && (tipo <3))

            {
                if ((precototal1N > 100) ||(precototal1D > 100) ||(precototal2N > 100) ||(precototal2D > 100) ||(precototal3N > 100) ||(precototal3D > 100))
                {
                    if (quantidade >0)
                    {
                        if (tipo == 1)
                        {
                            switch (codigo)
                            {
                                case 1:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +(precototal1N - (precototal1N*0.05))));
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +(precototal2N - (precototal2N*0.05))));
                                    break;

                                case 3:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +(precototal3N - (precototal3N*0.05))));
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Produto Inválido");
                                    break;
                            }
                        }
                        else
                        {
                            switch (codigo)
                            {
                                case 1:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +(precototal1D - (precototal1D*0.05))));
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +(precototal2D - (precototal2D*0.05))));
                                    break;

                                case 3:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", + (precototal3D - (precototal3D*0.05))));
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Produto Inválido");
                                    break;

                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Quantidade de Produto Inválido");
                    }
                }
                else
                {
                    if (quantidade >0)
                    {
                        if (tipo == 1)
                        {
                            switch (codigo)
                            {
                                case 1:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal1N));
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal2N));
                                    break;

                                case 3:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal3N));
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Produto Inválido");
                                    break;
                            }
                        }
                        else
                        {
                            switch (codigo)
                            {
                                case 1:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal1D));
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal2D));
                                    break;

                                case 3:
                                    JOptionPane.showMessageDialog(null, String.format("O preco fica : %.2f", +precototal3D));
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Produto Inválido");
                                    break;

                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Quantidade de Produto Inválido");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Tipo de Produto Inválido");
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Codigo de Produto Inválido");
        }

    }
}