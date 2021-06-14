import Datos.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.time.*;


public class ClaseEmpl {

    public static List< Datos > empList = new ArrayList<>(){
        String archivo = "Empleado.txt";
        try (Stream<String> stream = Files.lines(Paths.get(archivo))){
            stream.forEach((e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fchaNacimiento = lista[2];
                String sueldo = lista[3];
                Datos datos = new Datos(nombre, apellido, fchaNacimiento, sueldo);
                empList.add(datos);
            });
        } catch (Exception e) {
            System.out.println("OcurriÃ³ un error.!!" + e.getMessage());
        }
    }

    empList.add(new Datos("ACOTTO", "ABRIL",17/04/2000,350000));
    empList.add(new Datos("Robles","Maria Victoria",13/10/1977, 32568.56));
    empList.add(new Datos("Rios"," DEBORA DAIANA",07/02/1999,250000.67));
    empList.add(new Datos ("Caceres"," GONZALEZ CARLOS DAVID",07/11/1993,123586.23));
    empList.add(new Datos("BANEGAS","LUCAS MAURO", 05/11/1980 ,350000.98));
    empList.add(new Datos("ALVAREZ" ,"FABIANA ANDREA", 20/01/1996,789258.87));
    empList.add(new Datos("Nuñez"," DANIELA BELEN",11/9/1992,350000.98));

    
}
//recorremos la lista con un iterador e imprimo
private static void verEmpleados() {
    System.out.println("La lista de empleados es:");
    for (int i =0; i <empList.size(); i ++)
    System.out.println("Apellido= "+ empList.get(i).getApellido()+ "Nombre=" + empList.get(i).getNombre()+"Fecha de nacimiento="+empList.get(i).getFchaNacimiento()+"Sueldo=" +empList.get(i).getSueldo()); 
}
 //obtener  por nombre
 private static Datos obtenerEmpleadoNombr(String nombre){
    Datos datos= new Datos();
    for (int i=0; i< empList.size();i++){
        if (nombre.equals(empList.get(i).getNombre()));{
            datos = empList.get(i);
        }
    }
    return datos ;
}


///para obtener por apellido
private static  Datos obtEmpApell(String apellido){
    Datos datos =new Datos();
    for (int i =0; i < empList.size();i++){
        if(apellido.equals(empList.get(i).getApellido()));{
            datos=empList.get(i);
        }
    }
    return datos;
    }

    public static  Datos MayorSueldo(List< Datos>empList ){
        Datos datos=new Datos();
        for (int i =0; i < empList.size();i++){
            if ( sueldo.equals(empList.get(i).getSueldo()));{
                datos=empList.get(i);
            }
        }
        return datos;
    }
    public static Datos EmpJoven( List< Datos>empList){
        Datos datos= new Datos();
        for (int i=0; i < empList.size(); i++){
            if (edad.equals(empList.get(i).getEdad()));{
                datos=empList.get(i);
            }
        }
        return datos;
    }
    public static Datos EmpVi( List< Datos>empList) {
        Datos datos=new Datos();
        for (int i =0; i< empList.size();i++){
            if (edad.equals(empList.get(i).getEdad()));{
                datos=empList.get(i);
            }
        }
        return datos;
        
    }

      
      
    }
   
    


        