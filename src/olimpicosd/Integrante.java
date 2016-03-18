
package olimpicosd;



public class Integrante {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String nombre;
    private String apellido;

    public Integrante() {
        this.nombre = null;
        this.apellido = null;
    }
    
    public void setIntegrante() {
        System.out.print("Ingrese el nombre del miembro: ");
        this.nombre = lectura.next();
        System.out.print("Ingrese el apellido del miembro: ");
        this.apellido = lectura.next();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombre(){
        if(this.nombre == null){
            return null;
        }
        else{
            return this.nombre + " " + this.apellido;
        }
    }
}
