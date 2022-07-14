
package automatasprograma;

import java.util.Scanner;


public class Automatasprograma {

        int cont;
        boolean aceptacion;
        char[] car;
        
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        Automatasprograma aut = new Automatasprograma();
        String Cadena;
        System.out.println("indique la cadena que desea evaluar");
        Cadena = leer.nextLine();
        aut.car = Cadena.toCharArray();
        aut.inicio();
        
        if(aut.aceptacion == true)
            System.out.println("la cadena: " +Cadena + " fue aceptada");
        else
            System.out.println("la cadena: " +Cadena + "  NO b afue aceptada");
            
    }

    public void inicio() {
        cont= 0;
        aceptacion = false;
        q0();
    }
    
    public void q0(){
        System.out.println("estado: q0");
        if(cont < car.length){
            
            if(car[cont]== 'a'){
                cont ++;
                q0();
            }else if(car[cont] == 'b'){
                cont++;
                q1();
            }
        }
    }
    
    public void q1(){
        System.out.println("estado: q1");
        if(cont < car.length){
            
            if(car[cont]== 'a'){
                cont ++;
                q1();
            }else if(car[cont] == 'b'){
                cont++;
                q2();
            }
        }
    }
    
    public void q2(){
        System.out.println("estado: q2");
        if(cont < car.length){
            
            if(car[cont]== 'a'){
                cont ++;
                q2();
            }else if(car[cont] == 'b'){
                cont++;
                q3();
            }
        }
    }
    
    public void q3(){
        System.out.println("estado: q3");
        aceptacion = true;
        if(cont < car.length){
            
            if(car[cont]== 'a'){
                cont ++;
                q3();
            }else if(car[cont] == 'b'){
                cont++;
                error();
            }
        }
    }
    
    public void error(){
        System.out.println("EN ERROR");
        aceptacion = false;
        return;
        
    }
}
