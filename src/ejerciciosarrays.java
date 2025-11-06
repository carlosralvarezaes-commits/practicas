import java.util.Random;
import java.util.Scanner;

public class ejerciciosarrays {
    public static void main(String[] args) {


    //crear un array con 5 objetos

//        String [] inventario =  new String[5];
//
//        inventario[0] = "Espada";
//        inventario[1] = "pico";
//        inventario[2] = "manzana dorada";
//        inventario[3] = "bloques de piedra";
//        inventario[4] = "antorchas";
//
//        for (int i = 0; i<inventario.length; i++){
//            System.out.println("Tienes en tu inventario:"+ inventario[i]);
//
//
//        System.out.println("Tienes en tu inventario " + inventario.length);
//          }


//    String[] inventario = {"espada", "pico", "manzana dorada", "bloques de piedra", "antorchas"};
//
//    for (int i = 0; i < inventario.length; i++) {
//
//          System.out.println("Tienes en tu inventario" + inventario[i]);
//
//
//          System.out.println("Tienes en tu inventario" + inventario.length);
//          }
//










        //puntuaciones
//                int[] puntuaciones = {1200, 2380, 1750, 980, 2100, 1990};
//
//                int total = 0;
//                int mayor = puntuaciones[0]; // iniciamos con el primer valor
//
//                for (int i = 0; i < puntuaciones.length; i++) {
//                    total += puntuaciones[i]; // sumamos cada puntuación
//
//                    if (puntuaciones[i] > mayor) {
//                        mayor = puntuaciones[i];  // actualizamos el récord
//                    }
//                }
//
//
//                double media = (double) total / puntuaciones.length;  // la media
//
//                // Mostramos resultados
//                System.out.println("La puntuación total fue de: " + total + " puntos");
//                System.out.println("La media de puntos por partida fue de: " + (int)media);
//                System.out.println("Tu récord fue de " + mayor + " puntos en una partida.");
//            }
//        }


        


//among us
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
//
//
//
//        String[] jugadores = new String[5];
//
//        jugadores[0] = "0";
//        jugadores[1] = "1";
//        jugadores[2] = "2";
//        jugadores[3] = "3";
//        jugadores[4] = "4";
//
//        String impostor = jugadores[aleatorio.nextInt(jugadores.length)];
//
//
//        System.out.println("Quien crees que es el jugador impostor: "+ "\nEsta el 0 , 1, 2, 3 o el 4");
//        String Eleccion = lector.next();
//
//
//        if(!Eleccion.equals(impostor ))   {
//            System.out.println("No es el impostor ");
//
//        while(!Eleccion.equals(impostor ))  {
//            System.out.println("repite: ");
//            Eleccion = lector.next();
//
//        }}else {System.out.println("si es el impostor");}





//
//        String[] nombrespokemon= new String[5];
//
//
//
//
//
//
//        System.out.println("Introduce el nombre del pokemon1 : ");
//        nombrespokemon[0] = lector.nextLine();
//
//        System.out.println("Introduce el nombre del pokemon2 : ");
//        nombrespokemon[1] = lector.nextLine();
//
//        System.out.println("Introduce el nombre del pokemon3 : ");
//        nombrespokemon[2] = lector.nextLine();
//
//        System.out.println("Introduce el nombre del pokemon4 : ");
//        nombrespokemon[3] = lector.nextLine();
//
//        System.out.println("Introduce el nombre del pokemon5 : ");
//        nombrespokemon[4] = lector.nextLine();
//
//
//        for (int i= nombrespokemon.length - 1 ; i >= 0 ; i--) {
//            System.out.print(nombrespokemon[i] + " ");
//
//        }
//




//String[] sayans = {"Goku", "Vegetta", "Gohan","Trunks", "Broly" };
//int [] poder={15000,12000,10000,9000,20000};



//Ejercicio Array Aleatorio


Scanner scan = new Scanner(System.in);

        // 1. Pedir número de elementos
        System.out.print("Introduce el número de elementos del array: ");
        int numElementos = scan.nextInt();

        // 2. Pedir número mínimo
        System.out.print("Introduce el valor mínimo para los números aleatorios: ");
        double minimo = scan.nextDouble();

        // 3. Pedir número máximo
        System.out.print("Introduce el valor máximo para los números aleatorios: ");
        double maximo = scan.nextDouble();

        // Crear el array
        double[] array = new double[numElementos];

        // Rellenar el array con números aleatorios decimales
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (maximo - minimo) + minimo;
        }

        // Mostrar el array con formato español (coma decimal)
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("posición " + (i) + ": " + array[i]);
        }


    }

}