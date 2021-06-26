Datos.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.time.*;
import java.nio.file.*;
import java.util.stream.*;
import java.lang.Error;


 public class ClaseEmpl{
    private static String obtEmpApell;
    public  static void main(String[] args) {
        
    
        System.out.println("podra visualizar la lista de empleados");
        
        appendPersonal();
        String ingreso="";
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un apellido: ");
        ingreso=(teclado.nextLine());
        teclado.close();
        obtEmpApell = Datos.obtEmpApell(ingreso);
        System.out.println("__________________________ ");
        System.out.println("Empleado con mayor edad : ");
        System.out.println("____________________________ ");
        Datos.EmpVi();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Empleados/as  que más gana es: ");
        System.out.println("____________________________");
        Datos.MaxSueldo();
        System.out.println(" ");
        
       
    }


    static void appendPersonal(){
        String archivo ="C:/Users/pame/Desktop/INFO2021_esPECIALIZACION/Isla_Pamela_Info2021/Ejercicios_clases/Ejericio5/Empleado.txt";
        try (Stream<String> stream = Files.lines(Paths.get(archivo))){
            stream.forEach((e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fchaNacimiento = lista[2];
                String sueldo = lista[3];
                Datos datos = new Datos(nombre, apellido, fchaNacimiento, sueldo);
            });
        } catch (Exception e) {
            System.out.println("Ocurrio  un error.!!" + e.getMessage());
        }
    }
}
   
    


        