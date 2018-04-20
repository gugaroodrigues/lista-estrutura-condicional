import javax.swing.JOptionPane;
public class exercicioLista10{
   public static void main(String[] args){
       JOptionPane.showMessageDialog(null, "Digite um retangulo");
       int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro"));
       int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo"));
       int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Terceiro"));
       int lado4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Quarto"));

       if (lado1 == lado3 && lado2 == lado4){
           JOptionPane.showMessageDialog(null, "É um retangulo!");

       }else{
           JOptionPane.showMessageDialog(null, "Não é um retangulo");
       }
      
    

   }
}