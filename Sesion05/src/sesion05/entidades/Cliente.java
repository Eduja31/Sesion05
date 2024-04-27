/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion05.entidades;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona{
    
    private String codCliente;
    
    public static Cliente
            fromPersona(Persona per){
                Cliente cli = new Cliente();
                cli.setNombre(per.getNombre());
                cli.setApellido(per.getApellido());
                cli.setDNI(per.getDNI());           
                return cli;
            }

    public Cliente() {
    }
    
    
    @Override
    public String getText(){
        return "CLIENTE: "+ 
                this.getNombre()+ " "+ 
                this.getApellido()+ " | DNI: "+
                this.getDNI();
        
    }


    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    
    
    
    
    
    
}
