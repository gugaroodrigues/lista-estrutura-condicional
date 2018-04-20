import javax.swing.JOptionPane;
public class exercicioLista24{
    public static void main(String[] args) {    

       double valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da compra?"));
       double valorDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor ganho em Desconto"));
       double resultado1 = (valorDesconto * 100)/valorCompra;

       JOptionPane.showMessageDialog(null, "Valor total da compra: "+ valorCompra + "\nValor do desconto recebido: " + valorDesconto + "\nPercentual do desconto: " + resultado1);
    }
    
}