package unal.poo.practica;

import becker.robots.*;

import java.util.*;
/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;

        

         
        public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            estudiante = new Robot(objetos,0, 0, Direction.EAST,10);
           
              ZonaParqueo zona1=new ZonaParqueo(0);
              ZonaParqueo zona2=new ZonaParqueo(0);
              ZonaParqueo zona3=new ZonaParqueo(0);
              boolean y=true;
              for(int hora=0;y==true;hora++){
                  estudiante.move();
              Scanner S=new Scanner(System.in);
              String placa=S.nextLine();
                  y=zona1.Ingresarauto(placa, zona1, zona2, zona3,hora);
             
              }
              System.out.println("Ya no se pueden ingresar mas autos");
}
}