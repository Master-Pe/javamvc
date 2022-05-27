
package Vista;

import Controlador.ControladorC;
import Datos.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jhonatan
 */
public class Consola {
    public static void main(String[] args) throws IOException {
        
        Scanner       Leer     = new Scanner(System.in);
        Persona       Nueva    = new Persona(234);
        ControladorC  controla = new ControladorC();
        
        ArrayList <Persona> Lista    =new ArrayList <>();
        ArrayList <Persona> Eliminar =new ArrayList <>();
        
        int opcion;
        
        do{
            System.out.println("Menu de Persona");
            System.out.println("Ingrese la opcion deseada Martika");
            System.out.println("1. Ingresar personas");
            System.out.println("2. Consultar personas");
            System.out.println("3. Modificar la persona");
            System.out.println("4. Eliminar la persona");
            System.out.println("5. Mostrar todas las personas");
            System.out.println("6. Guardar en el archivo");
            System.out.println("7. Leer persona");
            System.out.println("0. Para salir...");
            System.out.println("Ingrese la opción deseada: ");
            opcion=Leer.nextInt();
            switch(opcion)
            {
                case 1:Nueva=controla.IngresarPersona();
                    Lista.add(Nueva);
                    break;
                    
                case 2:controla.MostrarPersona(Nueva);
                    break;
                    
                case 3:controla.ModificarPersona(Lista); 
                    break;
                    
                case 4:controla.EliminarPersona(Eliminar);
                    break;
                    
                case 5:controla.MostrarPersona(Lista); 
                     break;
                
                case 6:
                      controla.EscribirPersona(Lista);
                    break;
                case 7: controla.LeerPersona(Lista);
                    break;
                case 0: break;
                default: break;
            }
        }while(opcion !=0);
        
    }
    
    
}