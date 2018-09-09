package unal.poo.practica;

import becker.robots.*;

import java.util.*;

/**
 * Practica de los conceptos de Programacion Estructurada
 *
 * @author Fabian Andres Giraldo
 */
public class Parqueadero {
    //Declaracion de Variables -- Forma temporal - No es buena practica tener
    //variables estaticas

    public static City objetos;
    public static Robot estudiante;

    public void InteractuarParqueadero(Robot karel, boolean ponerthing, boolean quitarthing, boolean IrAposicion, boolean IrAsalida, int posicion) {
        switch (posicion) {
            case 1:
                if (IrAposicion == true) {
                    for (int i = 0; i < 5; i++) {
                        karel.move();
                    }
                }
                    if (IrAsalida == true) {
                        for (int i = 0; i < 2; i++) {
                            karel.turnLeft();
                        }
                        for (int i = 0; i < 5; i++) {
                            karel.move();
                        }
                    }
                
    
                if (ponerthing == true) {
                    karel.putThing();
                } else if (quitarthing == true) {
                    karel.pickThing();
                }
                break;
            case 2:
                if (IrAposicion == true) {
                    for (int i = 1; i < 5; i++) {
                        karel.move();
                    }}
                    if (IrAsalida == true) {
                        for (int i = 0; i < 2; i++) {
                            karel.turnLeft();
                        }
                        for (int i = 1; i < 5; i++) {
                            karel.move();
                        }
                    }
                
                if (ponerthing == true) {
                    karel.putThing();
                } else if (quitarthing == true) {
                    karel.pickThing();
                }
                break;
            case 3:
                if (IrAposicion == true) {
                    for (int i = 2; i < 5; i++) {
                        karel.move();
                    }}
                    if (IrAsalida == true) {
                        for (int i = 0; i < 2; i++) {
                            karel.turnLeft();
                        }
                        for (int i = 2; i < 5; i++) {
                            karel.move();
                        }
                    }
                
                if (ponerthing == true) {
                    karel.putThing();
                } else if (quitarthing == true) {
                    karel.pickThing();
                }
                break;
            case 4:
                if (IrAposicion == true) {
                    for (int i = 3; i < 5; i++) {
                        karel.move();
                    }}
                    if (IrAsalida == true) {
                        for (int i = 0; i < 2; i++) {
                            karel.turnLeft();
                        }
                        for (int i = 3; i < 5; i++) {
                            karel.move();
                        }
                    
                }
                if (ponerthing == true) {
                    karel.putThing();
                } else if (quitarthing == true) {
                    karel.pickThing();
                }
                break;
            case 5:
                if (IrAposicion == true) {
                    for (int i = 4; i < 5; i++) {
                        karel.move();
                    }}
                    if (IrAsalida == true) {
                        for (int i = 0; i < 2; i++) {
                            karel.turnLeft();
                        }
                        for (int i = 4; i < 5; i++) {
                            karel.move();
                        }
                    }
                
                if (ponerthing == true) {
                    karel.putThing();
                } else if (quitarthing == true) {
                    karel.pickThing();
                }
                break;
        }
    }

    public void IroRegresaraZona(Robot karel, int zona, boolean ir, boolean regresar) {
        switch (zona) {
            case 1:
                if (ir == true) {
                    for (int i = 0; i <= 9; i++) {
                        karel.move();
                    }
                    for (int i = 0; i <= 2; i++) {
                        karel.turnLeft();
                    }
                    karel.move();
                }
                if (regresar == true) {
                    karel.move();
                    karel.turnLeft();
                    for (int i = 0; i <= 9; i++) {
                        karel.move();
                    }
                    for (int i = 0; i < 2; i++) {
                        karel.turnLeft();
                    }
                }
                break;
            case 2:
                if (ir == true) {
                    for (int i = 0; i <= 6; i++) {
                        karel.move();
                    }
                    for (int i = 0; i <= 2; i++) {
                        karel.turnLeft();
                    }
                    karel.move();
                }
                if (regresar == true) {
                    karel.move();
                    karel.turnLeft();
                    for (int i = 0; i <= 6; i++) {
                        karel.move();
                    }
                    for (int i = 0; i < 2; i++) {
                        karel.turnLeft();
                    }
                }
                break;

            case 3:
                if (ir == true) {
                    for (int i = 0; i <= 3; i++) {
                        karel.move();
                    }
                    for (int i = 0; i <= 2; i++) {
                        karel.turnLeft();
                    }
                    karel.move();
                }
                if (regresar == true) {
                    karel.move();
                    karel.turnLeft();
                    for (int i = 0; i <= 3; i++) {
                        karel.move();
                    }
                    for (int i = 0; i < 2; i++) {
                        karel.turnLeft();
                    }
                }
                break;

            case 4:
                if (ir == true) {
                    karel.move();
                    for (int i = 0; i <= 2; i++) {
                        karel.turnLeft();
                    }
                    karel.move();
                    for (int i = 0; i <= 2; i++) {
                        karel.turnLeft();
                    }
                }
                if (regresar == true) {
                    for (int i = 0; i < 2; i++) {
                        karel.turnLeft();
                        karel.move();
                    }
                    for (int i = 0; i < 2; i++) {
                        karel.turnLeft();
                    }
                    break;
                }
        }
    }

    public int AsignacionZona(ZonaParqueo zona1, ZonaParqueo zona2, ZonaParqueo zona3) {

        int carroszona1 = zona1.CantidadCarros(zona1.getLugares(), 5);
        int carroszona2 = zona2.CantidadCarros(zona2.getLugares(), 5);
        int carroszona3 = zona3.CantidadCarros(zona3.getLugares(), 5);

        if (carroszona1 != 5 && carroszona1 == carroszona2 && carroszona1 == carroszona3 && carroszona2 == carroszona3) {
            return 1;
        }
        if (carroszona1 != 5 && carroszona1 < carroszona2 && carroszona1 <= carroszona3) {
            return 1;
        }
        if (carroszona2 != 5 && carroszona2 < carroszona1 && carroszona2 < carroszona3) {
            return 2;
        }
        if (carroszona3 != 5 && carroszona3 < carroszona1 && carroszona3 < carroszona2) {
            return 3;
        }
        if (carroszona2 != 5) {
            return 2;
        }
        if (carroszona3 != 5) {
            return 3;
        } else {
            return 0;
        }
    }

    public boolean Ingresarauto(Parqueadero Invocador, Robot karel, String placa, ZonaParqueo zona1, ZonaParqueo zona2, ZonaParqueo zona3, int horadeentrada) {
        int zona = AsignacionZona(zona1, zona2, zona3);
        int carroszona1=zona1.CantidadCarros(zona1.getLugares(), 5);
        int carroszona2=zona2.CantidadCarros(zona2.getLugares(), 5);
        int carroszona3=zona3.CantidadCarros(zona3.getLugares(), 5);
        if (zona == 0) {
            return false;
        }
        switch (zona) {
            case 1:
                
                for(int i=0;i<5;i++){
                    if(i==carroszona1){
                    zona1.lugares[i].setEstado(true);
                    zona1.lugares[i].setHoraentrada(horadeentrada);
                    zona1.lugares[i].setPlacaactual(placa);
                    Invocador.IroRegresaraZona(karel, zona,true,false);
                    Invocador.InteractuarParqueadero(karel, true, false, true, false, i+1);
                    Invocador.InteractuarParqueadero(karel, false, false, false, true, i+1);
                    Invocador.IroRegresaraZona(karel, zona,false,true);
                    
                    return true;   
                    }
                }
                
               break;
            case 2:
                 for(int i=0;i<5;i++){
                    if(i==carroszona2){
                    zona2.lugares[i].setEstado(true);
                    zona2.lugares[i].setHoraentrada(horadeentrada);
                    zona2.lugares[i].setPlacaactual(placa);
                    Invocador.IroRegresaraZona(karel, zona,true,false);
                    Invocador.InteractuarParqueadero(karel, true, false, true, false, i+1);
                    Invocador.InteractuarParqueadero(karel, false, false, false, true, i+1);
                    Invocador.IroRegresaraZona(karel, zona,false,true);
                    
                    return true;   
                    }
                }
                break;
            case 3:
                for(int i=0;i<5;i++){
                    if(i==carroszona3){
                    zona3.lugares[i].setEstado(true);
                    zona3.lugares[i].setHoraentrada(horadeentrada);
                    zona3.lugares[i].setPlacaactual(placa);
                    Invocador.IroRegresaraZona(karel, zona,true,false);
                    Invocador.InteractuarParqueadero(karel, true, false, true, false, i+1);
                    Invocador.InteractuarParqueadero(karel, false, false, false, true, i+1);
                    Invocador.IroRegresaraZona(karel, zona,false,true);
                    return true;   
                    }
                }
                break;

        }
        return false;

    }

    public void InformacionZona(ZonaParqueo zonaaevaluar) {
        
            System.out.println("Informacion");
            
            for (int i = 0; i < 5; i++) {
            System.out.print("Posicion ");
                System.out.println(i+1);
            System.out.println(zonaaevaluar.lugares[i].getPlacaactual());
        }
    }

    public double TotalProducido(ZonaParqueo zona1, ZonaParqueo zona2, ZonaParqueo zona3, double tarifahora) {
        double ganancias = 0;
        ganancias = (zona1.getTotalminutos() + zona2.getTotalminutos() + zona3.getTotalminutos()) * tarifahora;

        return ganancias;
    }

    public void ComoSacar(Robot karel,int numerozona,Parqueadero Invocador ,ZonaParqueo zona, ZonaParqueo zonaaux, int posicion, int hora,double tarifa) {
       
        
        int tiempoparqueadero = zona.getTotalminutos();
        int tiempoconsumido = hora - zona.lugares[posicion - 1].getHoraentrada();
        int cardinalidadpark=zona.CantidadCarros(zona.lugares, 5);
        tiempoparqueadero += tiempoconsumido;
        zona.setTotalminutos(tiempoparqueadero);
        
      
            zona.lugares[posicion-1].setEstado(false);
            zona.lugares[posicion-1].setHoraentrada(0);
            zona.lugares[posicion-1].setPlacaactual(null);
      
        if (posicion != 5) {
            
           
            for (int i=posicion-1;i<4;i++){
             zona.lugares[i]=zona.lugares[i+1];
            }
          
            zona.lugares[4].setEstado(false);
            zona.lugares[4].setHoraentrada(0);
            zona.lugares[4].setPlacaactual(null);
       
            for(int i=cardinalidadpark,a=2;i>posicion;i--,a++){
                Invocador.IroRegresaraZona(karel,numerozona, true, false);
                Invocador.InteractuarParqueadero(karel, false, true, true, false, i);
                Invocador.InteractuarParqueadero(karel, false, false, false, true, i);
                Invocador.IroRegresaraZona(karel, numerozona, false, true);
                Invocador.IroRegresaraZona(karel, 4, true, false);
                Invocador.InteractuarParqueadero(karel, true, false, true, false,a );
                Invocador.InteractuarParqueadero(karel, false, false, false, true, a);
                Invocador.IroRegresaraZona(karel, 4, false, true);
            }
            Invocador.IroRegresaraZona(karel, numerozona, true, false);
            Invocador.InteractuarParqueadero(karel, false, true, true, false, posicion);
            Invocador.InteractuarParqueadero(karel, false, false, false, true, posicion);
            Invocador.IroRegresaraZona(karel, numerozona, false, true);
                              
            for(int i=posicion,a=cardinalidadpark-posicion+1;i<=cardinalidadpark-posicion;i++,a--){
                Invocador.IroRegresaraZona(karel, 4, true, false);
                Invocador.InteractuarParqueadero(karel, false, true, true, false,a );
                Invocador.InteractuarParqueadero(karel, false, false, false, true, a);
                Invocador.IroRegresaraZona(karel, 4, false, true);
                Invocador.IroRegresaraZona(karel,numerozona, true, false);
                Invocador.InteractuarParqueadero(karel, true, false, true, false, i);
                Invocador.InteractuarParqueadero(karel, false, false, false, true, i);
                Invocador.IroRegresaraZona(karel, numerozona, false, true);
                   }  
            
        }if(posicion==5){
             Invocador.IroRegresaraZona(karel, numerozona, true, false);
            Invocador.InteractuarParqueadero(karel, false, true, true, false, posicion);
            Invocador.InteractuarParqueadero(karel, false, false, false, true, posicion);
            Invocador.IroRegresaraZona(karel, numerozona, true, false); 
            }
    System.out.print("Hora de salida ");
        System.out.println(hora);
     System.out.print("Total a pagar ");
            System.out.println(tiempoconsumido*tarifa);
    }
    public boolean SacarVehiculo(Robot karel,Parqueadero Invocador ,int hora, String placa, int numeroZona, ZonaParqueo zona1, ZonaParqueo zona2, ZonaParqueo zona3, ZonaParqueo zonaaux,double tarifa) {

        switch (numeroZona) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    if (zona1.lugares[i].getPlacaactual().equals(placa)&&zona1.lugares[i].getPlacaactual()!=null) {
                        ComoSacar(karel,numeroZona,Invocador,zona1, zonaaux, i + 1, hora,tarifa);
                        return true;
                    }
                }
                return false;

            case 2:
                for (int i = 0; i < 5; i++) {
                    if (zona2.lugares[i].getPlacaactual().equals(placa)&&zona2.lugares[i].getPlacaactual()!=null) {
                        ComoSacar(karel,numeroZona,Invocador,zona2, zonaaux, i + 1, hora,tarifa);
                        return true;
                    }
                }
                return false;

            case 3:
                for (int i = 0; i < 5; i++) {
                    if (zona3.lugares[i].getPlacaactual().equals(placa)&&zona3.lugares[i].getPlacaactual()!=null) {
                        ComoSacar(karel,numeroZona,Invocador,zona3, zonaaux, i + 1, hora,tarifa);
                        return true;
                    }
                }
                return false;

            default:
                return false;
        }
    }

    public static void main(String[] args) {
        //Declarar la creacion de la ciudad
        objetos = new City("Field.txt");
        objetos.showThingCounts(true);
        estudiante = new Robot(objetos, 7, 11, Direction.WEST, 15);
        Parqueadero Invocador = new Parqueadero();
        ZonaParqueo zona1 = new ZonaParqueo(0);
        ZonaParqueo zona2 = new ZonaParqueo(0);
        ZonaParqueo zona3 = new ZonaParqueo(0);
        ZonaParqueo zonaespera = new ZonaParqueo(0);
        double tarifaxhora = 375;
        boolean y = true;
        //Ciclo de simulacion del dia
        Scanner S = new Scanner(System.in);
         String placa;
         int Operacion;
         int Ingreasarzona;
        for (int hora = 0;y==true ; hora++) {
            if(hora==0){
            System.out.println("Bienvenido al parqueadero");
            }
            
            System.out.println("Que desea hacer");
            System.out.println("1. Ingresar carro");
            System.out.println("2. Sacar carro");
            System.out.println("3. Mostrar seccion");
            System.out.println("4. Reporte de Ingresos");
            System.out.println("5. Salir");
            System.out.print("Ingrese su Opcion: ");
            Operacion=S.nextInt();
            
            switch(Operacion){
                case 1:
                    System.out.print("Ingrese su placa: ");
                    placa=S.nextLine();
                  if(zona1.CantidadCarros(zona1.lugares,5)+zona1.CantidadCarros(zona1.lugares,5)+zona1.CantidadCarros(zona1.lugares,5)<15){
                  Invocador.Ingresarauto(Invocador, estudiante, placa, zona1, zona2, zona3, hora);
            }else{
                      System.out.println("Operacion no valida");
                  }
            break;
                case 2:
                    System.out.print("Ingrese su placa: ");
                    placa=S.nextLine();
                    System.out.println("Ingrese la zona donde se encuentra el vehiculo");
                    Ingreasarzona=S.nextInt();
                    if(zona1.CantidadCarros(zona1.lugares,5)+zona1.CantidadCarros(zona1.lugares,5)+zona1.CantidadCarros(zona1.lugares,5)>1){
                    Invocador.SacarVehiculo(estudiante, Invocador, hora, placa, Ingreasarzona, zona1, zona2, zona3, zona3, tarifaxhora);
                    }else{
                        System.out.println("Operacion no valida");
                    }
            break;
                 case 3:
                     System.out.print("Que seccion desea mirar: ");
                     Ingreasarzona=S.nextInt();
                     if(Ingreasarzona==1){
                     Invocador.InformacionZona(zona1);
                     }else if(Ingreasarzona==2){
                     Invocador.InformacionZona(zona2);
                     }else if(Ingreasarzona==3){
                     Invocador.InformacionZona(zona3);
                     }else{
                         System.out.println("Zona no valida");
                     }
            break;
                 case 4:
                     System.out.println(Invocador.TotalProducido(zona1, zona2, zona3, tarifaxhora));
            break;
                 case 5:
                     y=false;
          break;
        }
       
        
    }
 System.out.println("Programa Finalizado con exito");
}
}