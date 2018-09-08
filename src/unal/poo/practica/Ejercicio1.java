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
        
    
   
        public ZonaParqueo zona1=new ZonaParqueo(5);
        public ZonaParqueo zona2=new ZonaParqueo(5);
        public ZonaParqueo zona3=new ZonaParqueo(5);


        public int AsignacionZona(){
             
            int carroszona1=zona1.CantidadCarros(zona1.getLugares(),5);
            int carroszona2=zona2.CantidadCarros(zona2.getLugares(),5);
            int carroszona3=zona3.CantidadCarros(zona3.getLugares(),5);
            
            if(carroszona1!=5&&carroszona1==carroszona2&&carroszona1==carroszona3&&carroszona2==carroszona3){
                return 1;
            }
        if(carroszona1!=5&&carroszona1<carroszona2&&carroszona1<carroszona3){
            return 1;
        }
        if(carroszona2!=5&&carroszona2<carroszona1&&carroszona2<carroszona3){
            return 2;
        }
        if(carroszona3!=5&&carroszona3<carroszona1&&carroszona3<carroszona2){
            return 3;
        }
        if(carroszona2!=5){
            return 2;
        }
        if (carroszona3!=5) {
             return 3;
            }else{
            return 0;
        }
        }
        
         public boolean Ingresarauto(String placa){
         int zona=AsignacionZona();
         Posicion colocar=new Posicion(true, 0);
         colocar.setPlacaactual(placa);
         if(zona==0){
            return false;
        }
        switch(zona){
            case 1:
                if(zona1.CantidadCarros(zona1.getLugares(),5)==0){
                zona1.setP1(colocar);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==1){
                zona1.setP2(colocar);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==2){
                zona1.setP3(colocar);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==3){
                zona1.setP4(colocar);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==4){
                zona1.setP5(colocar);
                 return true;
                }
                break;
            case 2:
               if(zona2.CantidadCarros(zona2.getLugares(),5)==0){
                zona2.setP1(colocar);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==1){
                zona2.setP2(colocar);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==2){
                zona2.setP3(colocar);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==3){
                zona2.setP4(colocar);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==4){
                zona2.setP5(colocar);
                 return true;
                }
                break; 
            case 3:
                if(zona3.CantidadCarros(zona3.getLugares(),5)==0){
                zona3.setP1(colocar);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==1){
                zona3.setP2(colocar);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==2){
                zona3.setP3(colocar);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==3){
                zona3.setP4(colocar);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==4){
                zona3.setP5(colocar);
                 return true;
                }
                break;
             
        
        }
        return false;
         }

         
        public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            estudiante = new Robot(objetos,0, 0, Direction.EAST,10);
            Scanner S=new Scanner(System.in);
            
}
}