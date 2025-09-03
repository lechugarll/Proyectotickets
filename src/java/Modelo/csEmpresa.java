package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class csEmpresa {

private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csEmpresa(){
this.con=null;
this.stm=null;

}

//insercion de datos

public int InsertarEmpresa(String Nombre, String Direccion, String Email, String Telefono)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Empresa(Nombre,Direccion,Email,Telefono)"
            + "values('"+ Nombre + "', '" + Direccion + "', '" + Email + "', '" + Telefono + "')");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizar(String Nombre, String Direccion, String Email, String Telefono,int IDEmpresa)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.Empresa set "
            + "Nombre='" + Nombre + "', "
            + "Direccion = '" + Direccion + "', "
            + "Email = '" + Email + "', "
            + "Telefono = '" + Telefono + "'"
            + "where IDEmpresa = " + IDEmpresa + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminar(int IDEmpresa){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Empresa where IDEmpresa = " 
                + IDEmpresa + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <empresaact> listarEmpresa()
{
    empresaact  p = null;
    ArrayList<empresaact> lista = new ArrayList<empresaact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Empresa");
        
        while (rs.next())
            
        {
            p = new empresaact(rs.getString("Nombre"),rs.getString("Direccion"),rs.getString("Email"),rs.getString("Telefono"),
            rs.getInt(1));
            lista.add(p);
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return lista;
    
}
public empresaact listarEmpresaPorID(int IDEmpresa)
{
    empresaact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Empresa where IDEmpresa = " + IDEmpresa + "");
        
        while (rs.next())
            
        {
            p = new empresaact(rs.getString("Nombre"),rs.getString("Direccion"),rs.getString("Email"),rs.getString("Telefono"),
            rs.getInt(1));
            
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return p;
    
}

}
