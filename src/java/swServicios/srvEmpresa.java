
package swServicios;

import Modelo.csEmpresa;
import Modelo.empresaact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvEmpresa")
public class srvEmpresa {

    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "Nombre") String Nombre,@WebParam(name = "Direccion") String Direccion,
    @WebParam(name = "Email") String Email,@WebParam(name = "Telefono") String Telefono
    ) 
    {
        csEmpresa p = new csEmpresa();
        return p.InsertarEmpresa(Nombre, Direccion, Email, Telefono);
    }
    @WebMethod(operationName = "actualizar")
    public int actualizar(@WebParam(name = "Nombre") String Nombre,@WebParam(name = "Direccion") String Direccion,
    @WebParam(name = "Email") String Email,@WebParam(name = "Telefono") String Telefono,@WebParam(name = "IDEmpresa") int IDEmpresa
    ) 
    {
        csEmpresa p = new csEmpresa();
        return p.actualizar(Nombre, Direccion, Email, Telefono,IDEmpresa);
    }
    @WebMethod(operationName = "eliminar")
    public int eliminar( @WebParam(name = "IDEmpresa") int IDEmpresa
    ) 
    {
        csEmpresa p = new csEmpresa();
        return p.eliminar(IDEmpresa);
    }
    @WebMethod(operationName = "listar")
    public ArrayList<empresaact> listar(
    ) 
    {
        csEmpresa p = new csEmpresa();
        return p.listarEmpresa();
        
    }    
    @WebMethod(operationName = "listarPorID")
    public empresaact listarPorID( @WebParam(name = "IDEmpresa") int IDEmpresa
    )
    {
        csEmpresa p = new csEmpresa();
        return p.listarEmpresaPorID(IDEmpresa);
        
    }
}