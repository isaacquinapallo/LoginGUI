import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form2 {
    public JPanel mainPanel;
    private JLabel nombreTxtForm2;
    private JLabel correoTxtForm2;
    private JLabel usuarioTxtForm2;
    private JLabel direccionTxtForm2;
    private JLabel celularTxtForm2;
    private JLabel descripcionTxtForm2;
    private JButton buttonHobby;


    public form2(Datos datosUsuario) {
        // Aquí usar los datos de la instancia de Datos
        if (datosUsuario != null) {
            usuarioTxtForm2.setText("Usuario: " + datosUsuario.getUsuario());
            nombreTxtForm2.setText("Nombre: " + datosUsuario.getNombre());
            correoTxtForm2.setText("Correo: " + datosUsuario.getCorreo());
            direccionTxtForm2.setText("Dirección: " + datosUsuario.getDireccion());
            celularTxtForm2.setText("Celular: " + datosUsuario.getCelular());
            descripcionTxtForm2.setText("Descripción: " + datosUsuario.getDescripcionUsuario());
        } else {
            usuarioTxtForm2.setText("No hay datos disponibles");
            nombreTxtForm2.setText("");
            correoTxtForm2.setText("");
            direccionTxtForm2.setText("");
            celularTxtForm2.setText("");
            descripcionTxtForm2.setText("");
        }
        buttonHobby.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Biografia Usuario");
                form3 form3Instance = new form3(datosUsuario);
                frame.setContentPane(form3Instance.mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar procesos
                frame.setSize(20000, 20000);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


}
