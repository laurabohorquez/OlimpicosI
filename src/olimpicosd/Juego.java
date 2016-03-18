package olimpicosd;

import java.util.*;

public class Juego {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private ArrayList<Delegacion> delegaciones = new ArrayList<>();
    int i;
    
    public void añadirDelegacion(){
        Delegacion nuevaDelegacion = new Delegacion();
        this.delegaciones.add(nuevaDelegacion);
    }
    
    public Delegacion verDelegacion(int pos){
        return this.delegaciones.get(pos);
    }
    
    public Delegacion verDelgacionNombre(String Nombre){
        Delegacion delRetorno = null;
        
        for(i = 0; i < this.delegaciones.size(); i++){
            if(this.delegaciones.get(i).getPais().equals(Nombre)){
                delRetorno = this.delegaciones.get(i);
            }
        }
        return delRetorno;
    }
    
    public void encontrarDeporte(){
        System.out.print("Ingrese el deporte: ");
        String Deporte = lectura.next();
        for(i = 0; i < this.delegaciones.size(); i++){
            this.delegaciones.get(i).encontrarGrupo(Deporte);
        }
    }
    
    public void cambiarMedalla(){
        System.out.print("Escoja la delegación: ");
        String pais = lectura.next();
        System.out.print("Ingrese el tipo de medalla: ");
        String tipoMedalla = lectura.next();
        System.out.print("Ingrese la nueva cantidad: ");
        int cant = lectura.nextInt();
        if(tipoMedalla.equals("oro")){
            this.verDelgacionNombre(pais).setOro(cant);
        }
        if(tipoMedalla.equals("plata")){
            this.verDelgacionNombre(pais).setPlata(cant);
        }
        if(tipoMedalla.equals("bronce")){
            this.verDelgacionNombre(pais).setBronce(cant);
        }
    }
    
    public void mejorDelegacion(){
        int consulta[][] = new int[1][2];
        consulta[0][0] = 0;
        consulta[0][1] = this.delegaciones.get(0).getOro()+
                         this.delegaciones.get(0).getPlata()+
                         this.delegaciones.get(0).getBronce();
        for(i=1; i<this.delegaciones.size(); i++){
            if(this.delegaciones.get(i).getOro()+
               this.delegaciones.get(i).getPlata()+
               this.delegaciones.get(i).getBronce() > consulta[0][1]){
                
                consulta[0][0] = i;
                consulta[0][1] = this.delegaciones.get(i).getOro()+
                                 this.delegaciones.get(i).getPlata()+
                                 this.delegaciones.get(i).getBronce();
            }
        }
        System.out.println("\nLa mejor delegacion es: " + this.delegaciones.get(consulta[0][0]).getPais()+
                            " con " + consulta[0][1] 
                             + " medallas.\n");
    }
    
}
