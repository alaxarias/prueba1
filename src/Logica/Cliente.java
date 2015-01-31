

package Logica;

/**
 *
 * @author German Pulgarin
 */
public class Cliente {
 
 private String cedula;
 private String nombre;
 private String apellido;
 private String edad;
 private String cupo;
 private String ocupacion;
 
 public Cliente(String cedula,String nombre,String apellido,String edad,String cupo,String ocupacion)
 {
   this.cedula=cedula;
   this.nombre=nombre;
   this.apellido=apellido;
   this.cupo=cupo;
   this.edad=edad;
   this.ocupacion=ocupacion;
 }
 
 public void setCedula(String cedula)
 {
    this.cedula=cedula;
 } 
 
 public void setNombre(String nombre)
 {
    this.nombre=nombre;
 }
 
 public void setApellido(String apellido)
 {
    this.apellido=apellido;
 }
 
 public void setEdad(String edad)
 {
   this.edad=edad;
 }
 
 public void setCupo(String cupo)
 {
   this.cupo=cupo;
 }
 
 public void setOcupacion(String ocupacion)
 {
   this.ocupacion=ocupacion;
 }
 
 public String getCedula()
 {
    return cedula;
 }
 
 public String getNombre()
 {
    return nombre;
 }
 
 public String getApellido()
 {
    return apellido;
 }
 
 public String getCupo()
 {
    return cupo;
 }
 
 public String getOcupacion()
 {
   return ocupacion;
 }
 
 public String getEdad()
 {
   return edad;
 }
}
