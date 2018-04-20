import javax.swing.JOptionPane;
public class exercicioLista14{
   public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seus numeros"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ultimo"));

        if (numero1 > numero2 && numero2 > numero3){
            JOptionPane.showMessageDialog(null, "Ordem crescente:\n" +
            numero1 + "\n" + numero2 + "\n" + numero3);
        }if (numero2 > numero1 && numero1 > numero3){
            JOptionPane.showMessageDialog(null, "Ordem crescente:\n" +
            numero2 + "\n" + numero1 + "\n" + numero3);
        }if (numero3 > numero2 && numero2 > numero1){
            JOptionPane.showMessageDialog(null, "Ordem crescente:\n" +
            numero3 + "\n" + numero2 + "\n" + numero1);
        }if (numero2 > numero3 && numero3 > numero1){
            JOptionPane.showMessageDialog(null, "Ordem crescente:\n" +
            numero2 + "\n" + numero2 + "\n" + numero3);
        }if (numero3 > numero2 && numero2 > numero1){
            JOptionPane.showMessageDialog(null, "Ordem crescente:\n" +
            numero3 + "\n" + numero2 + "\n" + numero1);
        }

        
    }
}