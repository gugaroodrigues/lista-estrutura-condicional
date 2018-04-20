import javax.swing.JOptionPane;
public class exercicioLista3{
   public static void main(String [] args){
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
      
      int opcao = Integer.parseInt(JOptionPane.showInputDialog("                         MENU  " + "\nSomar:                                                              1" +  "\nSubtrair                                                             2" + "\nMultiplicar                                                         3" +  "\nDivisão                                                               4" ));
      if (opcao == 1){
         int soma = numero1 + numero2;
         JOptionPane.showMessageDialog(null, "Resultado Soma: " + soma);
      }else if (opcao == 2){
         int subtracao = numero1 - numero2;
         JOptionPane.showMessageDialog(null, "Resultado Subtração: " + subtracao);
      }else if (opcao == 3){
         int multiplicacao = numero1 * numero2;
         JOptionPane.showMessageDialog(null, "Resultado Multiplicação: " + multiplicacao);
      }else if (opcao == 4){
         double divisao = numero1 / numero2;
         JOptionPane.showMessageDialog(null, "Resultado Divisão: " + divisao);
      }else if (opcao >= 5){
          JOptionPane.showMessageDialog(null, "Opção inexistente: ");

      
      

               

      }
       
    
    }

      
      




  
}