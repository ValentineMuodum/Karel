package unal.poo.practica;

import becker.robots.*;

import java.util.*;
/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Parqueadero
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
         
       public void InteractuarParqueadero(Robot karel,boolean ponerthing,boolean quitarthing,boolean IrAposicion,boolean IrAsalida,int posicion){
     switch(posicion){
         case 1 :
             if(IrAposicion==true){
             for(int i=0;i<5;i++){
                 karel.move();
             }
             if(IrAsalida==true){
                 for (int i=0; i<2; i++) {
                   karel.turnLeft();
                 }
                 for(int i=0;i<5;i++){
                 karel.move();
             }   
             }
             }if(ponerthing==true){
                 karel.putThing();
             }else if(quitarthing==true){
                 karel.pickThing();
             }break;
        case 2 :
             if(IrAposicion==true){
             for(int i=1;i<5;i++){
                 karel.move();
             }
             if(IrAsalida==true){
                 for (int i=0; i<2; i++) {
                   karel.turnLeft();
                 }
                 for(int i=1;i<5;i++){
                 karel.move();
             }   
             }
             }if(ponerthing==true){
                 karel.putThing();
             }else if(quitarthing==true){
                 karel.pickThing();
             }break;
     case 3 :
             if(IrAposicion==true){
             for(int i=2;i<5;i++){
                 karel.move();
             }
             if(IrAsalida==true){
                 for (int i=0; i<2; i++) {
                   karel.turnLeft();
                 }
                 for(int i=2;i<5;i++){
                 karel.move();
             }   
             }
             }if(ponerthing==true){
                 karel.putThing();
             }else if(quitarthing==true){
                 karel.pickThing();
             }break;  
     case 4 :
             if(IrAposicion==true){
             for(int i=3;i<5;i++){
                 karel.move();
             }
             if(IrAsalida==true){
                 for (int i=0; i<2; i++) {
                   karel.turnLeft();
                 }
                 for(int i=3;i<5;i++){
                 karel.move();
             }   
             }
             }if(ponerthing==true){
                 karel.putThing();
             }else if(quitarthing==true){
                 karel.pickThing();
             }break;
     case 5 :
             if(IrAposicion==true){
             for(int i=4;i<5;i++){
                 karel.move();
             }
             if(IrAsalida==true){
                 for (int i=0; i<2; i++) {
                   karel.turnLeft();
                 }
                 for(int i=4;i<5;i++){
                 karel.move();
             }   
             }
             }if(ponerthing==true){
                 karel.putThing();
             }else if(quitarthing==true){
                 karel.pickThing();
             }break;
     }
       }
    public void IroRegresaraZona(int zona,boolean ir,boolean regresar){
        switch(zona){
            case 1:
                
        }
    }   
       
       public int AsignacionZona(ZonaParqueo zona1,ZonaParqueo zona2,ZonaParqueo zona3){
             
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
        
         public boolean Ingresarauto(String placa,ZonaParqueo zona1,ZonaParqueo zona2,ZonaParqueo zona3,int horadeentrada){
         int zona=AsignacionZona(zona1,zona2,zona3);
   
         if(zona==0){
            return false;
        }
        switch(zona){
            case 1:
                if(zona1.CantidadCarros(zona1.getLugares(),5)==0){
                zona1.getP1().setEstado(true);
                zona1. getP1().setHoraentrada(horadeentrada);
                zona1.getP1().setPlacaactual(placa);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==1){
                zona1.getP2().setEstado(true);
                zona1. getP2().setHoraentrada(horadeentrada);
                zona1.getP2().setPlacaactual(placa);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==2){
                zona1.getP3().setEstado(true);
                zona1. getP3().setHoraentrada(horadeentrada);
                zona1.getP3().setPlacaactual(placa);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==3){
                zona1.getP4().setEstado(true);
                zona1. getP4().setHoraentrada(horadeentrada);
                zona1.getP4().setPlacaactual(placa);
                 return true;
                }else if(zona1.CantidadCarros(zona1.getLugares(),5)==4){
                zona1.getP5().setEstado(true);
                zona1. getP5().setHoraentrada(horadeentrada);
                zona1.getP5().setPlacaactual(placa);
                 return true;
                }
                break;
            case 2:
               if(zona2.CantidadCarros(zona2.getLugares(),5)==0){
                zona2.getP1().setEstado(true);
                zona2. getP1().setHoraentrada(horadeentrada);
                zona2.getP1().setPlacaactual(placa);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==1){
               zona2.getP2().setEstado(true);
                zona2. getP2().setHoraentrada(horadeentrada);
                zona2.getP2().setPlacaactual(placa);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==2){
                zona2.getP3().setEstado(true);
                zona2. getP3().setHoraentrada(horadeentrada);
                zona2.getP3().setPlacaactual(placa);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==3){
                zona2.getP4().setEstado(true);
                zona2. getP4().setHoraentrada(horadeentrada);
                zona2.getP4().setPlacaactual(placa);
                 return true;
                }else if(zona2.CantidadCarros(zona2.getLugares(),5)==4){
                zona2.getP5().setEstado(true);
                zona2. getP5().setHoraentrada(horadeentrada);
                zona2.getP5().setPlacaactual(placa);
                 return true;
                }
                break; 
            case 3:
                if(zona3.CantidadCarros(zona3.getLugares(),5)==0){
                zona3.getP1().setEstado(true);
                zona3. getP1().setHoraentrada(horadeentrada);
                zona3.getP1().setPlacaactual(placa);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==1){
                zona3.getP2().setEstado(true);
                zona3. getP2().setHoraentrada(horadeentrada);
                zona3.getP2().setPlacaactual(placa);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==2){
                zona3.getP3().setEstado(true);
                zona3. getP3().setHoraentrada(horadeentrada);
                zona3.getP3().setPlacaactual(placa);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==3){
                zona3.getP4().setEstado(true);
                zona3. getP4().setHoraentrada(horadeentrada);
                zona3.getP4().setPlacaactual(placa);
                 return true;
                }else if(zona3.CantidadCarros(zona3.getLugares(),5)==4){
                zona3.getP5().setEstado(true);
                zona3. getP5().setHoraentrada(horadeentrada);
                zona3.getP5().setPlacaactual(placa);
                 return true;
                }
                break;
             
        
        }
        return false;
       
         }
public void InformacionZona(ZonaParqueo zonaaevaluar){
           for(int i=0;i<5;i++){
           System.out.println("Zona 1");
           System.out.print("Posicion 1 ");
           System.out.println(zonaaevaluar.lugares[i].getPlacaactual());
           }
       } 
public double TotalProducido(ZonaParqueo zona1,ZonaParqueo zona2,ZonaParqueo zona3,double tarifahora){
    double ganancias=0;
    ganancias=(zona1.getTotalminutos()+zona2.getTotalminutos()+zona3.getTotalminutos())*tarifahora;
    
    return ganancias;
}

public void ComoSacar(ZonaParqueo zona,ZonaParqueo zonaaux,int posicion,int hora){
        //Aqui se realiza la cobranza en forma de tiempo parqueadero y la reasignacion
        System.out.print("Hora de salida ");
        System.out.println(hora);
        int tiempoparqueadero=zona.getTotalminutos();
        int tiempoconsumido =hora-zona.lugares[posicion-1].getHoraentrada();
        tiempoparqueadero+=tiempoconsumido;
        zona.setTotalminutos(tiempoparqueadero);
        zona.lugares[posicion].setEstado(false);
        zona.lugares[posicion].setHoraentrada(0);
        zona.lugares[posicion].setPlacaactual(null);
if(posicion!=5){
        for(int i=5;i>=posicion;i--){
    zonaaux.lugares[i-2].setPlacaactual(zona.lugares[i-1].getPlacaactual());
         //moverdesdeposicion(i);
        }
}
}

public boolean SacarVehiculo(int hora,String placa,int numeroZona,ZonaParqueo zona1,ZonaParqueo zona2,ZonaParqueo zona3,ZonaParqueo zonaaux){
    
    switch(numeroZona){
        case 1:
            for(int i=0;i<5;i++){
                if(zona1.lugares[i].getPlacaactual().equals(placa)){
                    ComoSacar(zona1, zonaaux, i+1, hora);
                return true;
                }
            }return false;
        
        case 2:
            for(int i=0;i<5;i++){
                if(zona2.lugares[i].getPlacaactual().equals(placa)){
                    ComoSacar(zona2, zonaaux, i+1, hora);
                return true;   
                }
            }return  false; 
            

        case 3:
            for(int i=0;i<5;i++){
                if(zona3.lugares[i].getPlacaactual().equals(placa)){
                    ComoSacar(zona3, zonaaux, i+1, hora);
                return true;   
                }
            }return false;
            
            
    default:
return false;}
}      
        public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            estudiante = new Robot(objetos,7, 11, Direction.WEST,10);
            Parqueadero Invocador=new Parqueadero();
           ZonaParqueo zona1=new ZonaParqueo(0);
           ZonaParqueo zona2=new ZonaParqueo(0);
           ZonaParqueo zona3=new ZonaParqueo(0);
           ZonaParqueo zonaespera=new ZonaParqueo(0);
           double tarifaxhora=6300;  
              boolean y=true;
              //Ciclo de simulacion del dia
              for(int hora=0;y==true;hora++){
                  estudiante.move();
              Scanner S=new Scanner(System.in);
              String placa=S.nextLine();
                  y=Invocador.Ingresarauto(placa, zona1, zona2, zona3,hora);
             
}
              
              Invocador.InformacionZona(zona1);
}

}