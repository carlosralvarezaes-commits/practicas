import java.util.Scanner;
//ejercicio1
public class funcionesbasicos {

public static void saludar(String nombreEntrdada){
    System.out.println("bienvenido  "+ nombreEntrdada);
}

public static void main (String [] args){
    Scanner lector= new Scanner(System.in);
    System.out.println("Tu nombre?");
    String nombre = lector.nextLine();

    saludar(nombre);
}
}

//ejercicio2



