import javax.swing.JOptionPane;
public class exercicioLista11{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Digite 5 notas");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("terceira nota"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Quarta nota"));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("Quinta nota"));
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        if (media >= 0 && media <= 5.99){
            JOptionPane.showMessageDialog(null, "Reprovado!\n" +media);
        }if (media >= 6 && media <= 7.99){
            JOptionPane.showMessageDialog(null, "Recuperação!\n" + media);
        }else{
            JOptionPane.showMessageDialog(null, "Aprovado!\n" + media);
        }


    }
}