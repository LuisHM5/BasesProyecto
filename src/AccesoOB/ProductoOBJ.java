/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoOB;
import Query.ProductoQRY;
import conn.Conexion;
import java.sql.Connection;
import javax.swing.JTable;
import setget.Producto;

/**
 *
 * @author G4M3R-PC
 */
public class ProductoOBJ {
    private String mensaje = "";
    private ProductoQRY pOb = new ProductoQRY();    
    private String filas []= new String[7];
    
    public String agregarProducto(Conexion conect, Producto prod)
    {
        Connection conn = conect.getConnection();
        try
        {
            mensaje=pOb.agregarProducto(conn, prod);
        } 
        catch (Exception e) 
        {
            mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje= mensaje +" "+e.getMessage();
            }
        }
        return mensaje;
    }
    public String modificarProducto(Conexion conect, Producto prod)
    {
        Connection conn = conect.getConnection();
        try 
        {
            mensaje=pOb.modificarProducto(conn, prod);
        } 
        catch (Exception e) 
        {
            mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje= mensaje +" "+e.getMessage();
            }
        }        
        return mensaje;
    }
    public String eliminarProducto(Conexion conect,int id)
    {
        Connection conn = conect.getConnection();
        try 
        {
            mensaje=pOb.eliminarProducto(conn, id);
        } 
        catch (Exception e) 
        {
            mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje= mensaje +" "+e.getMessage();
            }
        }        
        return mensaje;        
    }
    public String [] buscarProducto(Conexion conect,int id)
    {
        Connection conn = conect.getConnection();
        
        try 
        {
            filas=pOb.buscarProducto(conn, id);
        } 
        catch (Exception e) 
        {
            mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje= mensaje +" "+e.getMessage();
            }
        }
        return filas;
    }
    public String agregarStock(Conexion conect,int id,int cantActualizar)
    {
        Connection conn = conect.getConnection();
        try 
        {
            mensaje=pOb.agregarStock(conn, id,cantActualizar);
        } 
        catch (Exception e) 
        {
            mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje= mensaje +" "+e.getMessage();
            }
        }        
        return mensaje;        
    }
    public void listarStock(Conexion conect, JTable table)
    {
        Connection conn = conect.getConnection();
        pOb.listarStock(conn, table);       
        try 
        {
            conn.close();
        } 
        catch (Exception e) 
        {
           // mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                //mensaje= mensaje +" "+e.getMessage();
            }
        }               
    } 
    public void listarProductosOrdenes(Conexion conect, JTable table)
    {
        Connection conn = conect.getConnection();
        pOb.listarProductosOrdenes(conn, table);
        try 
        {
            conn.close();
        } 
        catch (Exception e) 
        {
           // mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                //mensaje= mensaje +" "+e.getMessage();
            }
        }               
    }     
    public void listarProductos(Conexion conect, JTable table)
    {
        Connection conn = conect.getConnection();
        pOb.listarProductos(conn, table);
        try 
        {
            conn.close();
        } 
        catch (Exception e) 
        {
           // mensaje= mensaje +" "+e.getMessage();
        }
        finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                //mensaje= mensaje +" "+e.getMessage();
            }
        }               
    }    
}
