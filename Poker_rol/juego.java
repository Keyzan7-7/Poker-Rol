import java.util.*;
/**
 * Write a description of class juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class juego 
{
    public static Scanner teclado = new Scanner(System.in);
    
    public static void cartas(int x){
    try{
    System.out.println("Barajando...");
    Thread.sleep(2000);
    int numero = (int)(Math.random()*12+1);
    String[] res = new String[12];
    int tipo, numeli;
    String respuesta;
    for(int i = 0; i < x; i++){
    res[i] = Integer.toString(numero);
    tipo = (int)(Math.random()*4);
    if(tipo == 0){
    res[i] = res[i] + " Corazones";
    }else if(tipo == 1){
    res[i] = res[i] + " Picas";
    }else if(tipo == 2){
    res[i] = res[i] + " Treboles";
    }else{
    res[i] = res[i] + " Diamantes";
    }
    numero =  (int)(Math.random()*12+1);
    }
    escritura(res);
    eliminar(res);
    }catch(InputMismatchException e){
    System.out.println("Debes escribir los números, no caracteres");
    }catch(Exception e){
    System.out.println("Hay algun error");
    }
    }
    public static void eliminar(String[] res){  
    int poseliminar; // Variable donde se almacena la posición a eliminar.
    while(res[0] != null){
    System.out.println("¿Que posición quieres eliminar?");
    poseliminar = teclado.nextInt();
    poseliminar --;
    res = removeElement(res, res[poseliminar]);
    escritura(res);
    }    
    }
    
    public static void escritura(String[] res){
    for(int i = 0; i < res.length; i++){
    int aux = i + 1;
    if(res[i] != null){
    System.out.println(aux  + ": " + res[i]);
    }
    }
    
    }
     public static String[] removeElement(String[] arr, String item) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(item);
        return list.toArray(String[]::new);
    }
}
