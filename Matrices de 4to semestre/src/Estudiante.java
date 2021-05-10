public class Estudiante {
  private String nombre;
  private String apellido;
  private String correo;

  public String getNombre()
  {
    return nombre;
  }
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  public String getApellido()
  {
    return apellido;
  }
  public void setApellido(String apellido)
  {
    this.apellido = apellido;
  }
  public String getCorreo()
  {
    return correo;
  }
  public void setCorreo(String correo)
  {
    this.correo = correo;
  }
}

public class Principal
{
  public static void main(String args[]) {
    Estudiante estudiante1 = new Estudiante();
    estudiante1.setNombre("Marco");
    estudiante1.setApellido("muniz");
    estudiante1.setCorreo("marco.muniz@gmail.com");

    System.out.println(estudiante1.getNombre());
    System.out.println(estudiante1.getApellido());
    System.out.println(estudiante1.getCorreo());
  }
}