/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion05.entidades;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona{
    
    private String codEmpleado;
    
    public static Empleado
        fromPersona(Persona per){
            Empleado emp = new Empleado();
            emp.setNombre(per.getNombre());
            emp.setApellido(per.getApellido());
            emp.setDNI(per.getDNI());
            return emp;
            }

    public Empleado() {
    }
    

    
    @Override
    public String getText(){
        return "EMPLEADO: "+ 
                this.getNombre()+ " "+ 
                this.getApellido()+ " | DNI: "+
                this.getDNI();
        
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }
    
    
    
    
}
