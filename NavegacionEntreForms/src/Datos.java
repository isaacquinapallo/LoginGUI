public class Datos {
    String Usuario;
    String Password;
    String Nombre;
    String Apellido;
    String Correo;
    String Direccion;
    String Celular;
    String DescripcionUsuario;
    String Hobby;

    public Datos(){}

    public Datos(String hobby, String descripcionUsuario, String celular, String direccion, String correo, String apellido, String nombre, String password, String usuario) {
        Hobby = hobby;
        DescripcionUsuario = descripcionUsuario;
        Celular = celular;
        Direccion = direccion;
        Correo = correo;
        Apellido = apellido;
        Nombre = nombre;
        Password = password;
        Usuario = usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getDescripcionUsuario() {
        return DescripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        DescripcionUsuario = descripcionUsuario;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
