

package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author German Pulgarin Alex Arias
 */
public class conexion {

    /**
     *
     * @param args
     */
   
   private final static String driver="org.gjt.mm.mysql.Driver"; 
   private final String db="db_tienda"; //nombre de la base de datos
   private final String url="jdbc:mysql://localhost:3306/"+db; //ip a la base de datos
   private final String user="root"; //para xamp p admin
   private String pass="1234";//no se le coloco clave
   
   private Cliente cliente;
   private Cliente[] listaCliente=new Cliente[100];
   private Articulo[] listaArticulo=new Articulo[100];
   private Factura[] listaFactura=new Factura[100];
   private Articulo articulo;
   private Factura factura;
   
   private Connection conect;
   private Statement statu;
   
    public conexion() 
    {
       try{
        
           Class.forName(driver);
           conect=DriverManager.getConnection(url,user,pass);
           statu=conect.createStatement();
           System.out.println("Conexion Exitosa!");
           
        
          }
          catch(ClassNotFoundException | SQLException ex)
          {
              JOptionPane.showMessageDialog(null, "pailas");
           
          }
            
    }
    
    
    public void InsertarCliente(String cedula,String nombre,String apellido,String edad,String cupo,String ocupacion)
    {
      cliente=new Cliente(cedula,nombre,apellido,edad,cupo,ocupacion);
      String query="INSERT INTO clientes (Cedula,Nombre,Apellido,Edad,Cupo,Ocupacion) VALUES('"+cliente.getCedula()+"','"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getEdad()+
              "','"+cliente.getCupo()+"','"+cliente.getOcupacion()+"')";
      try
      {
      statu.executeUpdate(query);
      System.out.println("Cliente ingresado con Exito!");
      }
      catch(SQLException ex)
      {
        System.out.println("Paila con la consulta");
      }
      
      try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
    }
    
   public void InsertarArticulo(String codProducto,String descripcion,String cantidad,String iva,String precioCompra,String precioVenta)
   {
     articulo=new Articulo(codProducto,descripcion,cantidad,iva,precioCompra,precioVenta);
      String query="INSERT INTO articulos (Cod_Producto,Descripcion,Cantidad,IVA,Precio_Compra,Precio_Venta) VALUES('"+articulo.getCodigo()+"','"+articulo.getDescripcion()+"','"+articulo.getCantidad()+"','"+articulo.getIva()+
              "','"+articulo.getPrecioCompra()+"','"+articulo.getPrecioVenta()+"')";
      try
      {
      statu.executeUpdate(query);
      JOptionPane.showMessageDialog(null, "Articulo ingresado con Exito!");
      System.out.println("");
      }
      catch(SQLException ex)
      {
         
        System.out.println("Paila con la consulta");
      }
      
      try
      {
        statu.close();
        System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
   }
   
   public void InsertarFactura(Factura newFactura)
   {
      String query="INSERT INTO facturacion (Cod_Cliente,Cod_Articulo,Cantidad,subTotal) VALUES('"+newFactura.getCodCliente()+"','"+newFactura.getCodArticulo()+"','"+newFactura.getCantidad()+"','"+newFactura.getSubtotal()+"')";
              
      try
      {
      statu.executeUpdate(query);
      System.out.println("Factura ingresado con Exito!");
      }
      catch(SQLException ex)
      {
        System.out.println("Paila con la consulta"+ex.getSQLState());
      }
      
      try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
   }
   //codigo de la lista
   public String listaClientes()
   {
     int indice=0;
     String lista="";
     try
     {
      ResultSet fila=statu.executeQuery("SELECT * FROM clientes");
      
      while(fila.next())
      {
        listaCliente[indice]=new Cliente(fila.getString("Cedula"),fila.getString("Nombre"),fila.getString("Apellido"),fila.getString("Edad"),fila.getString("Cupo"),fila.getString("Ocupacion"));
        indice++;
      }
      
      for(int i=0;i<indice;i++)
      {
        lista+="Cedula: "+listaCliente[i].getCedula()+"\n"+
               "Nombre: "+listaCliente[i].getNombre()+"\n"+
               "Apellido: "+listaCliente[i].getApellido()+"\n"+
               "Edad:     "+listaCliente[i].getEdad()+"\n"+
               "Cupo:     "+listaCliente[i].getCupo()+"\n"+
               "Ocupacion: "+listaCliente[i].getOcupacion()+"\n\n";
        
      }
     }
     catch(SQLException ex)
     {
      lista="Ni mierda";
     }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
     return lista;
   }
   
    public String listaArticulo()
   {
     int indice=0;
     String lista="";
     try
     {
      ResultSet fila=statu.executeQuery("SELECT * FROM articulos ");
      
      while(fila.next())
      {
        listaArticulo[indice]=new Articulo(fila.getString("Cod_Producto"),fila.getString("Descripcion"),fila.getString("Cantidad"),fila.getString("IVA"),fila.getString("Precio_Compra"),fila.getString("Precio_Venta"));
        indice++;
      }
      
      for(int i=0;i<indice;i++)
      {
        lista+="Cod_Producto: "+listaArticulo[i].getCodigo()+"\n"+
               "Descripcion:  "+listaArticulo[i].getDescripcion()+"\n"+
               "Cantidad:     "+listaArticulo[i].getCantidad()+"\n"+
               "IVA:          "+listaArticulo[i].getIva()+"\n"+
               "Precio_Compra:"+listaArticulo[i].getPrecioCompra()+"\n"+
               "Precio_Venta: "+listaArticulo[i].getPrecioVenta()+"\n\n";
        
      }
     }
     catch(SQLException ex)
     {
      lista="Ni mierda";
     }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
     return lista;
   }
    
    public String listaFactura()
   {
     int indice=0;
     String lista="";
     try
     {
      ResultSet fila=statu.executeQuery("SELECT * FROM facturacion ");
      
      while(fila.next())
      {
        listaFactura[indice]=new Factura(fila.getString("Cod_Cliente"),fila.getString("Cod_Articulo"),fila.getString("Cantidad"));
        indice++;
      }
      
      for(int i=0;i<indice;i++)
      {
        lista+="Cod_Producto: "+listaFactura[i].getCodCliente()+"\n"+
               "Descripcion:  "+listaFactura[i].getCodArticulo()+"\n"+
               "Cantidad:     "+listaFactura[i].getCantidad()+"\n\n";
              
        
      }
     }
     catch(SQLException ex)
     {
      lista="Ni mierda";
     }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
     return lista;
   }
    
   public String getCliente(String cedula)
   {
     String respuesta="";
     
     try
     {
      ResultSet fila=statu.executeQuery("SELECT Nombre FROM clientes WHERE Cedula='"+cedula+"'");
     
      while(fila.next())
      {
       respuesta=fila.getString("Nombre");
       System.out.println(cedula);
      }
     }
      catch(SQLException ex)
      {
          respuesta="No se encontraron coincidencias";    
      }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
      return respuesta;
   }
   
   public String getArticulo(String codigo)
   {
     String respuesta="";
     
     try
     {
      ResultSet fila=statu.executeQuery("SELECT Descripcion FROM articulos WHERE Cod_Producto='"+codigo+"'");
     
      while(fila.next())
      {
       respuesta=fila.getString("Descripcion");
       System.out.println(codigo);
      }
     }
      catch(SQLException ex)
      {
          respuesta="No se encontraron coincidencias";    
      }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
      return respuesta;
   }
   
   public Factura infoFactura(String cliente,String codigo,String cantidad)
   {
     Factura nuevaFactura=new Factura(cliente,codigo,cantidad);
     
     try
     {
      ResultSet fila=statu.executeQuery("SELECT Descripcion,Precio_Venta FROM articulos WHERE Cod_Producto='"+codigo+"'");
      
       while(fila.next())
       {
        nuevaFactura.setDescripcion(fila.getString("Descripcion"));
        nuevaFactura.setSubTotal(Integer.parseInt(cantidad),Double.parseDouble(fila.getString("Precio_Venta")));
       }
     }
     catch(SQLException ex)
     {
      System.out.println("Ni mierda");
     }
     
     try
      {
      statu.close();
      System.out.println("Conexion cerradita");
      }
      catch(SQLException ex)
      {
       System.out.println("No se cerro la conexion");
      }
     return nuevaFactura;
   }
     
     
  }
 
    
  
   
   
        
