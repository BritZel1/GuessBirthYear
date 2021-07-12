import java.time.LocalDate;
import javax.swing.*;

public class App {
    public static void main(String[] args) {

       LocalDate data = LocalDate.now();
       int ano, idade, bornYear, yesOrNo;
       ano = data.getYear();

       do{
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ", "Descubra o ano de nascimento", JOptionPane.QUESTION_MESSAGE));
        //calcula o ano do nascimento
        bornYear = ano - idade;
        //0 = sim, 1= não.
        yesOrNo = JOptionPane.showConfirmDialog(null, "Nasicmento em " + bornYear + "\nDeseja verificar novamente?", "Descubra o ano de nascimento!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
       } while(yesOrNo == 0);

       JOptionPane.showMessageDialog(null, "Até mais!");

    }
        
}
