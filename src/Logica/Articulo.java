/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author German Pulgarin
 */
public class Articulo {
 
    private String codProducto;
    private String descripcion;
    private String cantidad;
    private String iva;
    private String precioCompra;
    private String precioVenta;
    
    public Articulo(String codProducto,String descripcion,String cantidad,String iva,String precioCompra,String precioVenta)
    {
      this.codProducto=codProducto;
      this.descripcion=descripcion;
      this.cantidad=cantidad;
      this.iva=iva;
      this.precioCompra=precioCompra;
      this.precioVenta=precioVenta;
    }
    
    public void setCodigo(String codProducto)
    {
      this.codProducto=codProducto;
    }
    
    public void setIva(String iva)
    {
      this.iva=iva;
    }
    
    public void setDescripcion(String descripcion)
    {
      this.descripcion=descripcion;
    }
    
    public void setCantidad(String cantidad)
    {
      this.cantidad=cantidad;
    }
    
    public void setPrecioVenta(String precioVenta)
    {
      this.precioVenta=precioVenta;
    }
    
    public void setPrecioCompra(String precioCompra)
    {
      this.precioCompra=precioCompra;
    }
    
    public String getCodigo()
    {
      return codProducto;
    }
    
    public String getDescripcion()
    {
      return descripcion;
    }
    
    public String getCantidad()
    {
      return cantidad;
    }
    
    public String getIva()
    {
      return iva;
    }
    
    public String getPrecioCompra()
    {
       return precioCompra;
    }
    
    public String getPrecioVenta()
    {
      return precioVenta;
    }
}
