/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

import java.sql.CallableStatement;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
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
        CallableStatement cstm = null;
        String sql = "CALL INSERTARPRODUCTO(?,?,?,?,?)";
        try 
        {
            cstm = conn.prepareCall(sql);
            cstm.setString(1, prod.getNombre());
            cstm.setString(2, prod.getDescripcion());
            cstm.setInt(3, prod.getCantidad());
            cstm.setDouble(4, prod.getPrecio());
            cstm.setDouble(5, prod.getCosto()); 
            cstm.execute();
            cstm.close();
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
        CallableStatement cstm = null;
        String sql = "CALL ACTUALIZARPRODUCTO(?,?,?,?,?,?)";
        try 
        {
            cstm = conn.prepareCall(sql);
            cstm.setInt(1, prod.getId());
            cstm.setString(2, prod.getNombre());
            cstm.setString(3, prod.getDescripcion());
            cstm.setInt(4, prod.getCantidad());
            cstm.setDouble(5, prod.getPrecio());
            cstm.setDouble(6, prod.getCosto());            
            cstm.execute();
            cstm.close();
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
        CallableStatement cstm = null;
        String sql = "CALL ELIMINARPRODUCTO(?)";
        try 
        {
            cstm = conn.prepareCall(sql);
            cstm.setInt(1, id);           
            cstm.execute();
            cstm.close();
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
        CallableStatement cstm  = null;
        
        String sql = "CALL ACTUALIZARSTOCKPRODUCTO(?,?)";
        try 
        {
            cstm = conn.prepareCall(sql);
            cstm.setInt(1, id);
            cstm.setInt(2, cantActualizar);            
            cstm.executeUpdate();
            cstm.close();
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
        String sql = "CALL BUSCARPRODUCTO(?,?)";
        CallableStatement cstm = null;
        ResultSet resu = null;      
        try 
        {
            cstm=conn.prepareCall(sql);
            cstm.setInt(1, id);
            cstm.registerOutParameter(2,OracleTypes.CURSOR);
            cstm.execute();
            resu =((OracleCallableStatement)cstm).getCursor(2);            
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
        
        String sql = "CALL LISTARSTOCK(?)";
        CallableStatement cstm = null;
        ResultSet resu = null;
        try 
        {
            cstm=conn.prepareCall(sql);
            cstm.registerOutParameter(1,OracleTypes.CURSOR);
            cstm.execute();
            resu =((OracleCallableStatement)cstm).getCursor(1);
            
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
        
        String sql = "CALL LISTAPRODUCTOS(?,2)";
        CallableStatement cstm;
        ResultSet resu = null;
        try 
        {
            cstm=conn.prepareCall(sql);
            cstm.registerOutParameter(1,OracleTypes.CURSOR);
            cstm.execute();
            resu =((OracleCallableStatement)cstm).getCursor(1);
            
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
        
        String sql = "CALL LISTAPRODUCTOS(?,1)";
        CallableStatement cstm;
        ResultSet resu = null;
        try 
        {
            cstm=conn.prepareCall(sql);
            cstm.registerOutParameter(1,OracleTypes.CURSOR);
            cstm.execute();
            resu =((OracleCallableStatement)cstm).getCursor(1);
                
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
