import java.util.*;

/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class main
{
    public static void main(String[] args){
    try{
    Scanner teclado = new Scanner(System.in);
    int x;
    boolean seguir = true;
    while(seguir){
    System.out.println("Bienvenido, elije la opción que quieres hacer:");
    System.out.println("1. Ver Tutorial");
    System.out.println("2. Cojer cartas");
    System.out.println("3. Cerrar");
    x = teclado.nextInt();
    if(x==1){
    tutorial.escritura();
    }
    else if(x == 2){
    System.out.println("¿Cuantas cartas debes tener?");
    x = teclado.nextInt();
    juego.cartas(x);
    }
    else{
    seguir = false;
    }
    }
    }catch(InputMismatchException e){
    System.out.println("Debes escribir los números, no caracteres");
    }
    }
}
