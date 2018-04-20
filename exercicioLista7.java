import javax.swing.JOptionPane;
public class exercicioLista7{
   public static void main(String [] args){
       String lista = " ";
       int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:\n ")); if(numero %2 == 0){
           lista += numero + " Este numero é par\n ";          
       }else if (numero %2 != 0){
           lista += numero + " Este numero é impar\n ";      
       } if (numero == 0){
           lista += numero + " Numero Neutro\n";       
       }if (numero >= 1){
           lista += numero + " Numero Positivo\n";
       }if (numero <= -1){
           lista += numero + " Numero negativo\n";
       }if (numero > 10){
           lista += numero + " Numero maior que 10\n";
       }if (numero < 50){
           lista += numero + " Numero menor que 50\n";
       }if (numero == 50){
           lista += numero + " Numero igual 50\n";
       }if (numero < -10){
           lista += numero + " Numero menor que -10\n";
       }if (numero > 30){
           lista += numero + " Numero maior que 30\n";
       }if (numero == 30){
           lista += numero + " Igual a 30\n";
       }else if (numero == 1){
           lista += numero + " Diferente de 1";

       }
       

           JOptionPane.showMessageDialog(null, " Resultado\n"+ lista);









   }

}   