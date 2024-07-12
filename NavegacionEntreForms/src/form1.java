import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

public class form1 {

    public JPanel mainPanel;
    private JTextField usuarioTxt;
    private JPasswordField contraseniaTxt;
    private JButton submitButton;
    private JLabel datosincorrectos;


    public form1() {
            Datos datosUsuario = null;
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/login";
                    String user = "root";
                    String password = "12345";
                    try (Connection connection = DriverManager.getConnection(url, user, password)) {
                        System.out.println("Conectado a Base de Datos");

                        String usuario = usuarioTxt.getText();
                        String contrasenia = new String(contraseniaTxt.getPassword());

                        //Verifica si el usuario existe y la contraseña es correcta
                        String query = "SELECT * FROM datosusuario WHERE usuario = ? AND contrasenia = ?";
                        try (PreparedStatement statement = connection.prepareStatement(query)) {
                            statement.setString(1, usuario);
                            statement.setString(2, contrasenia);

                            try (ResultSet resultSet = statement.executeQuery()) {
                                if (resultSet.next()) {

                                    Datos u1 = new Datos(
                                            resultSet.getString("hobby"),
                                            resultSet.getString("descripcionUsuario"),
                                            resultSet.getString("celular"),
                                            resultSet.getString("direccion"),
                                            resultSet.getString("correo"),
                                            resultSet.getString("apellido"),
                                            resultSet.getString("nombre"),
                                            resultSet.getString("contrasenia"),
                                            resultSet.getString("usuario")
                                    );

                                    //Abre form2
                                    JFrame frameForm2 = new JFrame("Biografía Usuario");
                                    form2 form2Instance = new form2(u1);
                                    frameForm2.setContentPane(form2Instance.mainPanel);
                                    frameForm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    frameForm2.setSize(600, 400); // Ajusta el tamaño a valores razonables
                                    frameForm2.pack();
                                    frameForm2.setVisible(true);

                                } else {
                                    datosincorrectos.setText("Datos incorrectos, inténtelo de nuevo");
                                    usuarioTxt.setText("");
                                    contraseniaTxt.setText("");
                                }
                            }
                        }
                    } catch (SQLException a) {
                        System.out.println(a.getMessage());
                    }
                }
            });
        }
    }
