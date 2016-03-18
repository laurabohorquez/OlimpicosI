package olimpicosd;

import java.util.*;

public class Delegacion {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String pais;
    private int oro;
    private int plata;
    private int bronce;
    private ArrayList<Grupo> grupos = new ArrayList<>();
    int i, groups;
    
    public Delegacion() {
        System.out.print("Ingrese el nombre del pais: ");
        this.pais = lectura.next();
        System.out.print("Ingrese el número de medallas de oro: ");
        this.oro = lectura.nextInt();
        System.out.print("Ingrese el número de medallas de plata: ");
        this.plata = lectura.nextInt();
        System.out.print("Ingrese el número de medallas de bronce: ");
        this.bronce = lectura.nextInt();
        System.out.print("Ingrese el número de grupos de la delegación: ");
        groups = lectura.nextInt();
        
        for (i = 0; i < groups; i++){
            Grupo nuevoGrupo = new Grupo();
            this.grupos.add(nuevoGrupo);
        }
    }
    
    public int tamaño(){
        return this.grupos.size();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }
    
    public void encontrarGrupo(String Deporte){
        for (i = 0; i < this.tamaño(); i++){
            if(this.grupos.get(i).getNombreDeporte().equals(Deporte)){
                System.out.println(this.getPais() + "\n Miembros: ");
                this.grupos.get(i).verIntegrantes();
            }
        }
        
    }
    
}
