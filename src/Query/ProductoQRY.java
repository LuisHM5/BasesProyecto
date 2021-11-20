/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;


import conn.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import setget.Producto;
/**
 *
 * @author G4M3R-PC
 */
public class ProductoQRY {
    private String mensaje = "";
    private String filasBusc[] = new String[7];
    public String agregarProducto(Connection conn, Producto prod)
    {
        PreparedStatement pst = null;
        String sql = "INSERT INTO PRODUCTOS (NOMBRE,DESCRIPCION,CANTIDAD,PRECIO,COSTO)"+ "VALUES(?,?,?,?,?)";
        try 
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, prod.getNombre());
            pst.setString(2, prod.getDescripcion());
            pst.setInt(3, prod.getCantidad());
            pst.setDouble(4, prod.getPrecio());
            pst.setDouble(5, prod.getCosto()); 
            pst.execute();
            pst.close();
            mensaje = "Agregado con exito";
        } 
        catch (SQLException e) 
        {
            mensaje = "Error no se pudo guardar:\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarProducto(Connection conn, Producto prod)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE PRODUCTOS SET NOMBRE = ?, DESCRIPCION = ?, CANTIDAD = ?,PRECIO = ?,COSTO = ?"
                    +"WHERE IDPRODUCTOS = ?";
        try 
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, prod.getNombre());
            pst.setString(2, prod.getDescripcion());
            pst.setInt(3, prod.getCantidad());
            pst.setDouble(4, prod.getPrecio());
            pst.setDouble(5, prod.getCosto());            
            pst.setInt(6, prod.getId());
            pst.execute();
            pst.close();
            mensaje = "Actualizado con exito";
        } 
        catch (SQLException e) 
        {
            mensaje = "Error no se pudo modificar el registro:\n"+e.getMessage();
        }        
        return mensaje;
    }
    public String eliminarProducto(Connection conn, int id)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM PRODUCTOS "+"WHERE IDPRODUCTOS = ?";
        try 
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);           
            pst.execute();
            pst.close();
            mensaje = "Eliminado con exito";
        } 
        catch (SQLException e) 
        {
            mensaje = "Error no se pudo Eliminado el registro:\n"+e.getMessage();
        }                
        return mensaje;
    }

    public String agregarStock(Connection conn,int id,int cantActualizar)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE PRODUCTOS SET CANTIDAD = ? "+"WHERE IDPRODUCTOS = ?";
        try 
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cantActualizar);
            pst.setInt(2, id);
            pst.execute();
            pst.close();
            mensaje = "Stock actualizado con exito";
        } 
        catch (SQLException e) 
        {
            mensaje = "Error no se pudo actualizar el stock:\n"+e.getMessage();
        }        
        return mensaje;             
    }
    public String [] buscarProducto(Connection conn,int id)
    {      
        String sql = "SELECT * FROM PRODUCTOS WHERE IDPRODUCTOS = ?";
        PreparedStatement pst = null;
        ResultSet resu = null;
        try 
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            resu = pst.executeQuery(); 
            if(resu.next())
            {
                for(int i=0; i<6;i++)
                {
                    filasBusc[i]=resu.getString(i+1);
                }                    
            }                             
        } 
        catch (SQLException e) 
        {
            JOptionPane.showConfirmDialog(null,"No se puede listar la tabla:\n"+e.getMessage());
        }
        return filasBusc;
    }
    public void listarStock(Connection conn, JTable table)
    {
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","CANTIDAD"};
        model = new DefaultTableModel(null,columnas);
        String [] filas = new String[4];
        
        String sql = "SELECT IDPRODUCTOS,NOMBRE,CANTIDAD FROM PRODUCTOS ORDER BY CANTIDAD";
        Statement st = null;
        ResultSet resu = null;
        try 
        {
            st = conn.createStatement();
            resu = st.executeQuery(sql);
            
            while (resu.next()) {
                for(int i=0; i<3;i++)
                {
                    filas[i]=resu.getString(i+1);
                }
                model.addRow(filas);               
            }
            table.setModel(model);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showConfirmDialog(null,"No se puede listar la tabla:\n"+e.getMessage());
        }           
    }
    public void listarProductosOrdenes(Connection conn, JTable table)
    {
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","DESCRIPCION","PRECIO"};
        model = new DefaultTableModel(null,columnas);
        String [] filas = new String[5];
        
        String sql = "SELECT IDPRODUCTOS,NOMBRE,DESCRIPCION,PRECIO FROM PRODUCTOS ORDER BY PRECIO";
        Statement st = null;
        ResultSet resu = null;
        try 
        {
            st = conn.createStatement();
            resu = st.executeQuery(sql);
            
            while (resu.next()) {
                for(int i=0; i<4;i++)
                {
                    filas[i]=resu.getString(i+1);
                }
                model.addRow(filas);               
            }
            table.setModel(model);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showConfirmDialog(null,"No se puede listar la tabla:\n"+e.getMessage());
        }           
    }    
    public void listarProductos(Connection conn, JTable table)
    {
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","DESCRIPCION","CANTIDAD","PRECIO","COSTO"};
        model = new DefaultTableModel(null,columnas);
        String [] filas = new String[6];
        
        String sql = "SELECT * FROM PRODUCTOS ORDER BY IDPRODUCTOS";
        Statement st = null;
        ResultSet resu = null;
        try 
        {
            st = conn.createStatement();
            resu = st.executeQuery(sql);
            
            while (resu.next()) {
                for(int i=0; i<6;i++)
                {
                    filas[i]=resu.getString(i+1);
                }
                model.addRow(filas);               
            }
            table.setModel(model);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showConfirmDialog(null,"No se puede listar la tabla:\n"+e.getMessage());
        }           
    }        
}
