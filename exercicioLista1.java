import javax.swing.JOptionPane;
public class exercicioLista1{
   public static void main(String [] args){
      
      int solicitacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
      if (solicitacao > 0){
          JOptionPane.showMessageDialog(null, "Este numero é positivo");
      }else if (solicitacao < 0){
          JOptionPane.showMessageDialog(null, "Não é positivo");
      }



   }

}   