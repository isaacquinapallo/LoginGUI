import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Implementar una aplicación de login que en el caso de ser correctas las credenciales me lleve a una segunda pantalla donde muestre su biografía.
//
//Posteriormente debe tener un botón que me lleve a una tercera pantalla donde se  muestre una foto de uno de sus hobbies.
//
//Desde la tercera pantalla debe haber un botón que me lleve a la segunda pantalla.
        JFrame frame = new JFrame("Login de Usuario");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar procesos
        frame.setSize(20000, 1000);
        frame.pack();
        frame.setVisible(true);

    }
}