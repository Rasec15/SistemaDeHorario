
package TrabajandoMetodos;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class main {
    
public static void main (String[]args) throws IOException  {
    
                   ArrayList Coleccion1 = new ArrayList <>();

            
        InputStreamReader isr;
         
        isr = new InputStreamReader(System.in);
        BufferedReader br;
        br= new BufferedReader(isr);
                    
        Administrador profe= new Administrador();
        int menu=0;
        int algo=0;
        
        isr = new InputStreamReader(System.in);
        br= new BufferedReader(isr);
        boolean comenzar = true;
        
        while(comenzar){
        System.out.println("*         BIENVENIDO          *");
            
        System.out.println("*    SISTEMA ADMINISTRADOR DE HORARIOS   *");
        System.out.println("");
        System.out.println("Ingrese El numero del Menu Deseado:....");System.out.println("");
              
        System.out.println("1.Seleccion de profesor"); 
            
        System.out.println("2.Seleccin de Mateiras");
            
        System.out.println("3.Seleccion los Horarios");         
            
        System.out.println("4.Ver Su Seleccion Ya Realizada ?");
        System.out.println("");
        System.out.println("");
   
        
        
        try{
            menu= Integer.parseInt(br.readLine());
                    
             }
           catch (IOException | NumberFormatException e){
           System.out.println("ERROR! , USTED A ELEGIDO UN CARACTER DIFERENTE A LOS PEDIDOS P"
                   + "ORFAVOR INGRESE UN NUMERO DEL 1-4 ");
            }
        
        
        
        if (menu==1){
        profe.crearProfesor();
        }
        if (menu==2){
        profe.crearMateria();
        }
        if(menu==3){
        profe.crearHorario();
        
        }
        if (menu==4){
        profe.DefinirHorario();
        for (Iterator it = Coleccion1.iterator(); it.hasNext();) {
            Object object = it.next();
        }
        
        }
  }
}
}