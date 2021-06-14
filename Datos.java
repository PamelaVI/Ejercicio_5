import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

// creo la clase empleado con sus datos
public class Datos {
    private String apellido;
    private String nombre;
    private LocalDate fchaNacimiento;
    private double sueldo;

    public Datos(){

    }
    //contructor de la clase
    public Datos(String apellido, String nombre,String fchaNacimiento, String sueldo){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setSueldo(sueldo);
        this.setfchaNacimiento(fchaNacimiento);

    }
    //set asigna un valor inicial a un atributo,permitiendo cambiarlo y get recupera o accede el valor asignado
    //crear los setters y getters de apellido
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    //crear los getter y setter de nombre
    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //crear getter y setter de sueldo
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(String sueldo){
        this.sueldo= Double.parseDouble(sueldo);
    }
    //crear getter y setter de fecha de nacimiento
    public LocalDate getFchaNacimiento(){
        return fchaNacimiento;
    }
    //cambiar formato de fecha en el set

    public void setFchaNacimiento(String fchaNacimiento){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fchaNacimiento=LocalDate.parse(fchaNacimiento, formatter);

    }
    //sobreewscribir y mostrar en string
    @Override
    public String toString(){
        return ("Empleado{:"+"apellido= "+ apellido +"},{"+"nombre= "+ nombre+"},{"+ "Fechanacimiento= "+ fchaNacimiento.toString()+"},{"+ "Sueldo="+ sueldo+"}");
    }
    //calcular edad a partir de fecha de nacimiento
    public int getEdad(){
        LocalDate hoy =LocalDate.now();
        //calculamos años diferencia
        int anios=hoy.getYear()-fchaNacimiento.getYear();
        //afinamos callculo
        if(hoy.getDayOfYear()> fchaNacimiento.getDayOfYear())
        anios--;
        return anios;
    }
    

}
