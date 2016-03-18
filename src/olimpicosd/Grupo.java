package olimpicosd;

public class Grupo {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String NombreDeporte;
    private Integrante []integrantes = new Integrante[10];
    private int i;

    public Grupo(String NombreDeporte) {
        this.NombreDeporte = NombreDeporte;
        for(i=0;i<10;i++){
            this.integrantes[i] = new Integrante();
        }
    }
    

    public Grupo(){
        for(i=0;i<10;i++){
            this.integrantes[i] = new Integrante();
        }
        System.out.println("");
        System.out.print("Ingrese el deporte del grupo: ");
        this.NombreDeporte = lectura.next();
        System.out.print("Ingrese el numero de integrantes: ");
        int cantDeportistas = lectura.nextInt();
        if(cantDeportistas > 2 || cantDeportistas < 10 ){
            for(i = 0; i < cantDeportistas; i++){
            this.integrantes[i].setIntegrante();
            }
        }
        else{
            System.out.println("Numero inválido");
        }
    }
    
    public String getNombreDeporte() {
        return NombreDeporte;
    }
    
    public void verIntegrantes(){
        for(i = 0; i < 10; i++){
            if(this.integrantes[i].getNombre()== null){
                break;
            }
            else{
                System.out.println(this.integrantes[i].getNombre());
            }
        }
        
    }
    
}
