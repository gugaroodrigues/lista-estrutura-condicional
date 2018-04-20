import javax.swing.JOptionPane;
public class exercicioLista2{
   public static void main(String [] args){
      
      int solicitacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
      if (solicitacao < 0){
          JOptionPane.showMessageDialog(null, "Este numero é negativo");
      }else if (solicitacao > 0){
          JOptionPane.showMessageDialog(null, "Não é negativo");
      }



   }

}   