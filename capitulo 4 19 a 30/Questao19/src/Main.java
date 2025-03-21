import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int sanduiche, bebida;
        double valorSanduiche = 0, valorBebida = 0, valorTotal;

        String sSanduiches = JOptionPane.showInputDialog(null, "Código do sanduíche: ");
        String sBebidas = JOptionPane.showInputDialog(null, "Código da bebida: ");

        sanduiche = Integer.parseInt(sSanduiches);
        bebida = Integer.parseInt(sBebidas);

        switch (sanduiche) {
            case 100:
                sSanduiches = "Cachorro quente";
                valorSanduiche = 1.20;
                break;
            case 101:
                sSanduiches = "Bauru simples";
                valorSanduiche = 1.30;
                break;
            case 102:
                sSanduiches = "Bauru com ovo";
                valorSanduiche = 1.50;
                break;
            case 103:
                sSanduiches = "Hambúrguer";
                valorSanduiche = 1.20;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código do sanduíche inválido!");
                return;
        }

        switch (bebida) {
            case 201:
                sBebidas = "Refrigerante";
                valorBebida = 1.00;
                break;
            case 202:
                sBebidas = "Suco";
                valorBebida = 1.50;
                break;
            case 203:
                sBebidas = "Água mineral";
                valorBebida = 0.70;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código da bebida inválido!");
                return;
        }

        valorTotal = valorSanduiche + valorBebida;

        JOptionPane.showMessageDialog(null, sSanduiches + " + " + sBebidas + "\nTotal a pagar: R$ " + String.format("%.2f", valorTotal));
    }
}
