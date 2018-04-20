import javax.swing.JOptionPane;
public class exercicioLista5{
   public static void main(String [] args){
       int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));

       
        if (numero != 0){
           JOptionPane.showMessageDialog(null, "Este numero é impar: ");
       
       }else if (numero %2 == 0){
           JOptionPane.showMessageDialog(null, "Este numero não é impar: ");
       
       }


       



   }
}