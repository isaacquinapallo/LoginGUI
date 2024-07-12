import javax.swing.*;
import java.awt.*;

public class form3 {
    public JPanel mainPanel;
    private JLabel imagenHobby;
    private JLabel hobby;

    public form3(Datos datosUsuario) {
        mainPanel = new JPanel();

        if (datosUsuario != null) {
            hobby.setText("Hobby: " + datosUsuario.getHobby());
            ImageIcon imagen = new ImageIcon("C:/Users/User/Downloads/NavegacionEntreForms/src/basketball.jpg");
            // Ajusta el tamaño de la imagen
            Image img = imagen.getImage();
            Image imgRedimensionada = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen según sea necesario
            ImageIcon iconoRedimensionado = new ImageIcon(imgRedimensionada);

            imagenHobby.setIcon(iconoRedimensionado);
            mainPanel.add(hobby);
            mainPanel.add(imagenHobby);
        } else {
            hobby.setText("No hay datos disponibles.");
        }
    }
}
