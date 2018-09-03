package unal.poo.practica;

import becker.robots.*;

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
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.WEST,10);
           for(int i=0;i<2;i++){
            estudiante.move();
            estudiante.turnLeft();
        }
         estudiante.move();
         if(estudiante.canPickThing()==true){
         estudiante.pickThing();
        }
        for(int i=0;i<2;i++){
         estudiante.turnLeft();
        }
        for(int i=0;i<2;i++){
            estudiante.move();
            for(int j=0;j<=2;j++){
            estudiante.turnLeft();
        }
        }
        estudiante.move();
        }
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

