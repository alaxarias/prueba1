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
public class Factura {
  
    private String codCliente;
    private String codArticulo;
    private String cantidad;
    private double subTotal;
    private String descripcion;
    
    public Factura(String codCliente,String codArticulo,String cantidad)
    {
      this.codCliente=codCliente;
      this.codArticulo=codArticulo;
      this.cantidad=cantidad;
    }

   
    
    public void setCodCliente(String codCliente)
    {
      this.codCliente=codCliente;
    }
    
    public void setCodArticulo(String codArticulo)
    {
      this.codArticulo=codArticulo;
    }
    
    public void setCantidad(String cantidad)
    {
      this.cantidad=cantidad;
    }
    
    public String getCodCliente()
    {
      return codCliente;
    }
    
    public String getCodArticulo()
    {
      return codArticulo;
    }
    
    public String getCantidad()
    {
      return cantidad;
    }
    
    
    public void setSubTotal(int cantidad,double valor)
    {
      subTotal=cantidad*valor;
    }
    public double getSubtotal()
    {
      return subTotal;
    }
    
    public void setDescripcion(String descripcion)
    {
      this.descripcion=descripcion;
    }
    
    public String getDescripcion()
    {
      return descripcion;
    }
}
