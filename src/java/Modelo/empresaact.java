
package Modelo;

public class empresaact {
private String Nombre, Direccion, Email, Telefono;
private int IDEmpresa;

public empresaact(String Nombre, String Direccion, String Email, String Telefono,int IDEmpresa)
        
{
this.Nombre=Nombre;
this.Direccion=Direccion;
this.Email=Email;
this.Telefono=Telefono;
}

//metodo get y metodo set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getIDEmpresa() {
        return IDEmpresa;
    }

    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }



}
