
package Controlador;

import Datos.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorC {
    
    public Persona IngresarPersona()
    {
        Persona Ingresa=new Persona();
        Scanner Entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el documento: ");
        Ingresa.setDocumento(Entrada.nextInt());
        System.out.println("Ingrese el nombre: ");
        Ingresa.setNombre(Entrada.next());
        System.out.println("Ingrese la dirección: ");
        Ingresa.setDirecction(Entrada.next());
        System.out.println("Ingrese el telefono: ");
        Ingresa.setTelefono(Entrada.nextInt());
                
        return Ingresa;
    }
    public void MostrarPersona(Persona muestra)
    {
        System.out.println("La perona es: ");
        System.out.println("El nombre es: " + muestra.getNombre());
        System.out.println("El documento es: " + muestra.getDocumento());
        System.out.println("La direccion es: " + muestra.getDirecction());
        System.out.println("El telefono es: " + muestra.getTelefono());
    }
    
    public void MostrarPersona(ArrayList<Persona> listado)
    {
        Persona  muestra=new Persona();
        System.out.println("Documento - Nombre --- Dirección");
        for (int i = 0; i < listado.size(); i++) 
        {
            muestra=listado.get(i);
            System.out.println(muestra.getDocumento() + "-" + muestra.getNombre() 
                    + "---" + muestra.getDirecction());
            
        }
        
    }    
        public ArrayList<Persona> ModificarPersona(ArrayList<Persona> listado)
        {
            int buscar;
            Scanner Leer=new Scanner(System.in);
            
            System.out.println("Ingrese el documento que desea modificar: ");
            buscar=Leer.nextInt();
            
            for (int i = 0; i < listado.size(); i++)
            {
               if(buscar== listado.get(i).getDocumento())
               {
                   System.out.println("Ingrese el nuevo nombre: ");
                   listado.get(i).setNombre(Leer.next());
                   System.out.println("Ingrese la nueva direccion: ");
                   listado.get(i).setDirecction(Leer.next());
                   System.out.println("Ingrese el nuevo telefono");
                   listado.get(i).setTelefono(Leer.nextInt());
               }
               else 
               {
                   System.out.println("Nos encontro el Documento");   
               }
            }
       
        return null;       
    }    

        public ArrayList<Persona> EliminarPersona(ArrayList<Persona> listado){
         int buscar;
            Scanner Leer=new Scanner(System.in);
            
            System.out.println("Ingrese el documento que desea modificar: ");
            buscar=Leer.nextInt();
            
            for (int i = 0; i < listado.size(); i++)
            {
               if(buscar== listado.get(i).getDocumento())
               {
                   System.out.println("Ingrese el nombre dela persona : ");
                   listado.remove(i).setNombre(Leer.next());
                    System.out.println("Se elimino la persona");
              } 
               
               
               else 
               {
                   System.out.println("Nos encontro el Documento");   
               }
            }
       
        return null;       
        }
 
         public void EscribirPersona(ArrayList<Persona> listado)  {
       
        try {
            File archivo=new File("DatosPersona.txt");
            String linea = " ";
         
            if(archivo.createNewFile()){
                
                System.out.println("Archivo creado");
                  }  
            
            FileWriter nuevo =new FileWriter(archivo);
            for (int i = 0; i < listado.size(); i++) {
               linea=listado.get(i).getDocumento() +","+
                       listado.get(i).getNombre()+","+
                       listado.get(i).getDirecction()+","+
                       listado.get(i).getTelefono()+"/n"+
                       nuevo.Write(linea);
            }
                nuevo.close() ; 
                System.out.println("archivo guardado ");
          }catch (IOException ex) {
              System.out.println("No puede crear archivo ");
        }
      
     }
         public void LeerPersona(ArrayList <Persona> listado) throws IOException{
             
        try {
            FileReader archivo=new FileReader("DatosPersona.txt");
            BufferedReader linea=new  BufferedReader(archivo);
            String cadena ="";
            
            while((cadena=linea.readLine())!=null);
        {
            System.out.println("la linea:"+ cadena);
            
        }//cierre de while
            
        } catch (FileNotFoundException ex) {
            System.out.println("No encontrado el archivo");
        }//cierre de catch
             
         }//cierrre de la leer persona
}//cierre de la clase 
