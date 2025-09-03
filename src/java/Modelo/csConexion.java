
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class csConexion {
    
    public String user,password;
    public String url, driver;
    public Connection cn;
    
    public csConexion(){
    this.user="admin";
    this.password="admin1234.";
    this.url="jdbc:sqlserver://dbtickets.ch2woi2k6hq4.us-east-2.rds.amazonaws.com:1433;databaseName=Proyectoticket;encrypt=true;trustServerCertificate=true";
    this.driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    this.cn=null;
   }
   
    public Connection conectar(){
    try{
        Class.forName(this.driver);
        cn = DriverManager.getConnection(url,user,password);
        return cn;
    }
            catch (Exception ex){
                return null;
            }
        
    }

public void desconectar() throws SQLException
{
cn.close();
}
}
