
package TrabajandoMetodos;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

        
public class Administrador implements metodosUsuales  {
    
    @Override
    public void crearProfesor() 
    {
           
    Administrador profe= new Administrador();
        
            
    InputStreamReader isr;
    isr = new InputStreamReader(System.in);
    BufferedReader br;
    br= new BufferedReader(isr);
                
            
    ArrayList Coleccion1 = new ArrayList <>();

            
    String profesor="";
    int horas = 0;
    int menu=0;
            
            
    System.out.println("Digite El Nombre de Su Profesor(@) de su preferencia ?");
   
    try {
     
        profesor = br.readLine();
        }   
    
    catch (IOException ex) {
        }
      
        
    
    Coleccion1.add(profesor);        
    System.out.println("");
            
    System.out.println("Su Docente es :"+ profesor);
            
    System.out.println("");                 
            
    System.out.println("Digite las horas Que imparte Ese Profesor (20 o 40)");
        
    
    
                try {
            
                    horas = Integer.parseInt(br.readLine());
        }   
                catch (IOException ex) {
            
                    
        }
  
            System.out.println("");
            
            
            System.out.println("");
            
            System.out.println("Las horas trabajadas por Su docente son: "
                        + ":" +  horas );
            
            System.out.println("");
                
            Coleccion1.add(horas);
                
                        
            System.out.println("!Su Profesor ha sido Elegido al igual que la hora a Impartir!");
               
            System.out.println("");
            
            System.out.println("");
        

        
            System.out.println("Que Desea Hacer En Este Momento?");
    
            
            
            
     
                }
    
    
    @Override
    public void crearMateria()  {
    
        int menu=0;
        
        
        
            Administrador profe= new Administrador();
            
          
          InputStreamReader isr;
          isr = new InputStreamReader(System.in);
          BufferedReader br;
          br= new BufferedReader(isr);
              
          
          ArrayList Coleccion1 = new ArrayList <>();
          
          String materia="";
          int creditos=0;
          String aulaMateria="";
          
          
            
            
          
           System.out.println("Usted ha Elegido Seleccion de Materias , Escriba el Nombre de Su Materias :");       
        
           try {
           
               materia = br.readLine();
        } 
           catch (IOException ex) {
           
        }
        
           
         
           Coleccion1.add((materia));
           
           System.out.println("");
           
           System.out.println("Su Materia Elegida Es : "   + materia);
           
           System.out.println("");
           
           System.out.println("Cantidad De Creditos Que posee la Materia?");
       
              try{
            creditos= Integer.parseInt(br.readLine());
                    
             }
           catch (IOException | NumberFormatException e){
           System.out.println("ERROR! , USTED A ELEGIDO UN CARACTER DIFERENTE A LOS PEDIDOS P"
                   + "ORFAVOR INGRESE SUS CREDITOS EN NUMEROS");
            }
        
            
        
        
         Coleccion1.add(creditos);
           
            
         System.out.println("Sus Creditos Elegidos Son :  " + creditos);  
              

            
        
        
      
        
                     
             
           
             
           System.out.println("");
             
           System.out.println("Seleccione el aula de la Materia");
        
           try {
           
               aulaMateria = br.readLine();
        } 
           catch (IOException ex) {
           
        }
     
             
           Coleccion1.add((aulaMateria));
             
           System.out.println("");
             
           System.out.println("Su aula Elegida es : " + aulaMateria);
             
           System.out.println(".........");
             
           System.out.println("");
            
           System.out.println("!Su Materia ha sido Elegida!");
             
           System.out.println("Que Desea Hacer En Este Momento");
           System.out.println(""); 
           System.out.println("");
       
           
           try {
           
               menu=Integer.parseInt(br.readLine());
        } 
           catch (IOException ex) {
           
        }
           
    }
    

    @Override
    
    public void crearHorario()   {
        
        int menu=0;
        

           Administrador profe= new Administrador();
           
           
           InputStreamReader isr;
           isr = new InputStreamReader(System.in);
           BufferedReader br;
           br= new BufferedReader(isr);
               
           
           ArrayList Coleccion1 = new ArrayList <>();
           
           String hrio="";
           String nombre="";
           
           
           
           
    System.out.println(" Usted ha Elegido Seleccion de Horarios,"
               + " Escriba el horario que desea tomar Clases");
               System.out.println("Matutino "
               + "8am-12pm,     "  
               +   "   Vespertino "
               +   " 2pm-6pm, "
               +   "   Nocturno "
               +   "6pm-10pm");
        
               
               try {
            
                   hrio = br.readLine();
        } 
               catch (IOException ex) {
        }
      
            
               
            Coleccion1.add(nombre);
             
            System.out.println("Esta Seguro que Desea Tomar Este Horario?");
             
            System.out.println("Si O");
             
            System.out.println("No");
       
            
            try {
            
                nombre = br.readLine();
        } 
            catch (IOException ex) {
            
        }
      
                   
            if (hrio.equals(hrio)){
             
            System.out.println("Este Horario ya Esta Ocupado Favor Utilizar Otro horario");
               }
               
      
            System.out.println("Su Horarios Elegido es: " + hrio);
             
            System.out.println("");
      
             System.out.println("........"); 
      
             System.out.println("");
             
             System.out.println("!!Su horario y/o Materias han Sido elegido!!");
             
             System.out.println("");   
            
             
             System.out.println("");
             
             System.out.println("Alguna otra Opcion Que dessee Realizar ?");
             
             System.out.println("");
       
                  System.out.println("Que Desea Hacer En Este Momento");
             System.out.println(""); 
             System.out.println("");        
   
    }
    
    
    @Override
    
    public void DefinirHorario()   {
    
    int menu=0;    
    
    
    
          Administrador profe= new Administrador();
           
           
           InputStreamReader isr;
           isr = new InputStreamReader(System.in);
           BufferedReader br;
           br= new BufferedReader(isr);
               
           
           ArrayList Coleccion1 = new ArrayList <>();
        
        
    String profesor="";
    int horas=0;
    String materia="";
    int creditos=0;
    String hrio="";
    String aulaMateria="";
    
    
    
    
          System.out.println("SU SELECCION DE HORARIO FUE LA SIGUIENTE");
          
          System.out.println("Su Docente es: " + profesor);
          System.out.println("");
          System.out.printf("Las Horas Trabajadas por el mismo son :"+    horas);
          System.out.println("");
          System.out.println("Su Materia Elegida es :  "+      materia);
          System.out.println("");
          System.out.println("Creditos Que Posee La Materia:  " + creditos);
          System.out.println("");
          System.out.println("SU Hora De tomar Clases es " + hrio);
          
          System.out.println("Aula De la Materia:"  +  aulaMateria);                           
          
          System.out.println("Presionar 0 si Quieres volver al Menu Principal");
          

          for (Iterator it = Coleccion1.iterator(); it.hasNext();) {
            Object object = it.next();
            
        }
          
          
          
           try{
            menu= Integer.parseInt(br.readLine());
                    
             }
           catch (IOException | NumberFormatException e){
           System.out.println("ERROR! , USTED A ELEGIDO UN CARACTER DIFERENTE A LOS PEDIDOS P"
                   + "ORFAVOR INGRESE UN NUMERO DEL 1-4 ");
            }
        
           
           
           try {
             
            
               menu = Integer.parseInt(br.readLine());
        } 
           catch (IOException ex) {
        }
       
}
    
}   

