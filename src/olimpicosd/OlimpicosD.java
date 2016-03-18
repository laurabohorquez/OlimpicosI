package olimpicosd;

import java.util.*;

public class OlimpicosD {

        public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int opc = 0;
        int i;
        Juego olimpicos = new Juego();
        
        System.out.println("Bienvenido \n");
        
        do{
            System.out.println(" 1. Ingresar nueva delegación"
                    + "\n 2. Consultar delegacion con un deporte"
                    + "\n 3. Cambiar cantidad de medallas de una delegación"
                    + "\n 4. Mostrar delegación con más medallas"
                    + "\n 5. Salir");
            opc = lectura.nextInt();
            switch (opc){
                case 1: 
                    /*Ingresa una nueva delegacion*/
                    olimpicos.añadirDelegacion();
                    
                    break;
                case 2:
                    /*Encuentra una delegación que tenga representación en el
                    deporte escogido, muestra el país y los integrantes*/
                    olimpicos.encontrarDeporte();
                    break;
                case 3:
                    /*Cambia un tipo de medalla de una delegación escogida */
                    olimpicos.cambiarMedalla();
                    
                    break;
                case 4:
                    /*Muestra la delegación con mayor cantidad de medallas*/
                    olimpicos.mejorDelegacion();
                    
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese un número válido");
            }
                        
        }while(opc != 5);
        System.out.println("¡Gracias por utilizar nuestro servicio!");
    }
}