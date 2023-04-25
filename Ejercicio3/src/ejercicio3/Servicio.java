/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.Alumnos.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




/**
 *
 * @author Facu
 */
public class Servicio {

    public void crearAlumno(ArrayList<Alumnos> lista){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        String opc="";
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre2 = leer.next();
            System.out.println("Ingrese las 3 notas");
            ArrayList<Integer> notas = new ArrayList();
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            System.out.println("Desea agregar otro alumno?");
            opc=leer.next();
            lista.add(new Alumnos(nombre2, notas));
            
            
        } while (opc.equalsIgnoreCase("si"));
        
        
        
    }

    public double promedio(ArrayList<Integer> notas){
      double promedio=0;  
      for (Integer nota: notas){
          promedio+=nota;
          
      }  
      promedio /=3;
      return promedio;
    }
    
    public void fabrica(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        Servicio S1 = new Servicio();
        ArrayList<Alumnos> Alumno = new ArrayList();
        crearAlumno(Alumno);
        System.out.println("Ingrese el nombre del alumno, para saber su "
                + "nota final");
        String nombrefinal = leer.next();
        
        Iterator <Alumnos> it = Alumno.iterator();
        
        int I = 0;
        while(it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombrefinal)) {
                
                double notafinal= S1.promedio(Alumno.get(I).getNotas());
                System.out.println("La nota final del alumno " + nombrefinal
                        + " es " + notafinal);
 
            }else {
                I++;
            }
            
            
            
        }
        
    }
}
