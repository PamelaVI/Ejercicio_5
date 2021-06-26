import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.time.LocalDate;

// creo la clase empleado con sus datos
public class Datos {
    static List<Datos>empList =new ArrayList<>();
    String apellido;
    String nombre;
    LocalDate fchaNacimiento;
    BigDecimal sueldo;

    
    //contructor de la clase
    public Datos(String apellido, String nombre,String fchaNacimiento, String sueldo){
        this.apellido=apellido;
        this.nombre=nombre;
        this.fchaNacimiento=toFecha(fchaNacimiento);
        this.sueldo=toSueldo(sueldo);
        InstListar();

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
    //crear getter  de sueldo
    public BigDecimal getSueldo(){
        return sueldo;
    }
   
    //crear getter y setter de fecha de nacimiento
    public LocalDate getFchaNacimiento(){
        return fchaNacimiento;
    }
    //cambiar formato de string a fechas

    static  LocalDate toFecha(String fchaNacimiento){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha=LocalDate.parse(fchaNacimiento, formatter);
        return fecha;

    }

    static BigDecimal toSueldo(String sueldo){
        BigDecimal efectivo= new BigDecimal( sueldo);
        return efectivo;
    }
    //cambiar formato fecha a string
    public void ConvFcha(){
        LocalDate ahora= LocalDate.now();
        DateTimeFormatter FORMATTER=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ahoraString  =ahora.format(FORMATTER);
        System.out.println(ahoraString);
    }
    //instanciar la lista
    private void InstListar(){
        empList.add(this);
    }

 
  
    //calcular edad a partir de fecha de nacimiento
    private int edad(){
            int edad=LocalDate.now().getYear()- this.fchaNacimiento.getYear();
            return edad;
    }
    //recorre la lista
    private static void verEmpleados() {
        System.out.println("La lista de empleados es:");
        for (int i =0; i <empList.size(); i ++)
        System.out.println("Apellido= "+ empList.get(i).getApellido()+ "Nombre=" + empList.get(i).getNombre()+"Fecha de nacimiento="+empList.get(i).getFchaNacimiento()+"Sueldo=" +empList.get(i).getSueldo());
    }
    public static  void MaxSueldo(){
        if(empList.size()!=0){
           BigDecimal comp= empList.get(0).sueldo;
           for (int i =0; i < empList.size();i++){
            if (comp.compareTo(empList.get(i).sueldo)== -1){
                comp=empList.get(i).sueldo;
            }

        }
        for (int i =0; i <empList.size(); i ++){
            if (empList.get(i).sueldo==comp){
                System.out.println(empList.get(i));
            }
        }
        
    }
    else {
        System.out.println("Error,de base");
    }
}
    public static void EmpVi(){
        if(empList.size()!=0) {
            int comp =0;
            for (int i =0; i< empList.size();i++){
                if (comp <empList.get(i).edad()){
                    comp= empList.get(i).edad();
            }
        }
        for(int i=0; i< empList.size(); i++){
            if(empList.get(i).edad()== comp){
                System.out.println(empList.get(i));
            }
        }
    }
    else{
        System.out.println("No existe ese  tipo de dato");
    }
}

//obtener  por nombre
public String obtenerEmpleadoNombr(String nombre){
    return empList.stream().filter(p ->p.getNombre().equals(nombre)).map(p->p.toString()).collect(Collectors.joining(","));}
   


///para obtener por apellido
public static String obtEmpApell(String apellido){
    return  empList.stream().filter(p ->p.getApellido().equals(apellido)).map(p->p.toString()).collect(Collectors.joining(","));}
    
@Override
public String toString(){
    return ("Empleado{:"+"apellido= "+ apellido +"},{"+"nombre= "+ nombre+"},{"+ "Fechanacimiento= "+ fchaNacimiento.toString()+"},{"+ "Sueldo="+ sueldo+"}");
}
}





    


