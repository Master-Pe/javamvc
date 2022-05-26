
package P000;

import Datos.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Archivos {
    
    public static void main(String[] args) {
        CrearArchivo();
        EscribirArchivo();
        LeerArchivo();
    }
    public static void CrearArchivo()
    {
   
   
     File arch=new File ("Nuevo.txt");
     
    try {
        
        if(arch.createNewFile())
        {
            System.out.println("El archivo a sido creado" + arch.getName());
            System.out.println("la ruta es"+ arch.getAbsolutePath());
            System.out.println("la ruta es"+ arch.getUsableSpace() );
        }
        else{
            System.out.println("El archivo ya existe");
        
        }
      } catch (IOException ex){
          ex.printStackTrace();
    
      }
    }
    public static void EscribirArchivo() {
        try {
            FileWriter archivo=new FileWriter("Nuevo.txt");
            for (int i = 0; i < 5; i++) {
                archivo.write("Hola munto, ");
                archivo.write("");
                
            
            }
            archivo.close();
        } catch (IOException ex) {
              System.out.println("No encontro el Archivo ");
        }
    }
    public static void LeerArchivo(){
        
        try{
        FileReader archivo=new FileReader("Nuevo.txt");
        BufferedReader Leer=new BufferedReader(archivo);
        String cadena;
        while ((cadena=Leer.readLine())!= null)
        {
            System.out.println("La linea es:"+ cadena);
        }//cierre de while
        archivo.close();
        
             }catch(FileNotFoundException ex){
            System.out.println("No encontro el Archivo ");
           
             }catch (IOException ex) {
                 System.out.println("No puede leer del archivo ");
        }//cierre de catch
             
    }//cierre de leerarchivo 
    
 
  }
    
}//cierre de la clase 

