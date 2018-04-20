import javax.swing.JOptionPane;
public class exercicioLista9{
    public static void main(String [] args){
    
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo numero:"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Terceiro numero: "));
        int lado4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ultimo numero: "));
                
        if (lado1 == lado2 && lado1 == lado3 && lado1 == lado4){
           JOptionPane.showMessageDialog(null, "É um quadrado");
        }else{
            JOptionPane.showMessageDialog(null, "Não é um quadrado");

        }




    }
}



