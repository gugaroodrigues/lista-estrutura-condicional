import javax.swing.JOptionPane;
public class exercicioLista13{
   public static void main(String[] args){
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero"));

       if (numero1 < numero2){
           JOptionPane.showMessageDialog(null, "Numero Menor: " + numero1);
       }else{
           JOptionPane.showMessageDialog(null, "Numero Menor: " + numero2);
       }



   }

}