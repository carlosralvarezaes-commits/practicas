import java.util.Random;
import java.util.Scanner;


public class PUERTAS {



    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rand = new Random();


        // 1) Declarar variables de control:
        int actupartidas = 1;
            int partidas = 10;
            int victoriasManteniendo= 0;
            int victoriasCambiando = 0;
            int eleccion = 0;


        //    - Generar aleatoriamente la puerta con premio:

        int premio = (int)(Math.random()*3);

        //    - Generar la elección inicial del concursante:










int sumadepartidas =  victoriasManteniendo + victoriasCambiando;







while (partidas > actupartidas) {

System.out.println("vamos a jugar Monty Hall jugaremos:"+ partidas+ "partidas ");

System.out.println("Hay 3 puertas \n ");
System.out.println("¿Como se juega ?\n\n"+ "- Hay tres puertas: detrás de una hay un coche y detrás de las otras dos, cabras.\n" +
        "- Tu tienes que elegir una puerta.\n" +
        "- y Yo abrire una de las otras dos puertas, revelando que hay detras.\n" +
        "- Luego, te ofrecere la opción de cambiar tu elección a la otra puerta cerrada.\n");
System.out.println("Partida "+ actupartidas);
System.out.println("Cual es Eliges  ??");
System.out.println("Puerta 1, Puerta 2 o Puerta 3?");
    eleccion = lector.nextInt();

    int numerodepuerta = eleccion;
;


    System.out.println("Haz elegido la puerta "+ numerodepuerta);

    if (numerodepuerta == 1){
    //el presentador abre puerta 2
        int puertas= rand.nextInt( 4);System.out.println("es la Puerta "+ puertas);
        if (puertas == 1){victoriasManteniendo+=1; System.out.println("Has ganado manteniendote en la puerta "+ numerodepuerta);
        }else if (puertas == 2){victoriasCambiando +=1 ;System.out.println("Ganaste cambiando de puerta");}




    }
    else if (numerodepuerta == 2){
//abre 1
        int puertas= rand.nextInt(2,4);
        System.out.println("es la Puerta "+ puertas);
        if (puertas == 2){victoriasManteniendo+=1;System.out.println("Has ganado manteniendote en la puerta "+ numerodepuerta);
        } else if (puertas == 2){victoriasCambiando +=1 ;System.out.println("Ganaste cambiando de puerta");}





}else if  (numerodepuerta == 3){
//abre 1
        int puertas= rand.nextInt(2,4);

        System.out.println("es la Puerta "+ puertas);
        if (puertas == 3){victoriasManteniendo+=1;System.out.println("Has ganado manteniendote en la puerta "+ numerodepuerta);
        }else if (puertas == 2){victoriasCambiando +=1 ;System.out.println("Ganaste cambiando de puerta");}


    }

















        }















        //    - Determinar qué puerta abre el presentador:

        //        * Debe ser una puerta distinta de 'eleccion' y que NO tenga el premio.

        //        * Elegir una de las válidas (si hay dos, puedes escoger una al azar).

        //        * Guardar en: int abierta = ...;

        //

        //    - Determinar la otra puerta cerrada distinta de 'eleccion' y de 'abierta':

        //        * Guardar en: int otraCerrada = ...;

        //

        //    - Estrategia A (mantener):

        //        * Si 'eleccion' == 'premio', sumar 1 a victoriasManteniendo.

        //

        //    - Estrategia B (cambiar):

        //        * Si 'otraCerrada' == 'premio', sumar 1 a victoriasCambiando.

        //

        // 3) Al terminar el bucle:

        //    - Imprimir:

        //        "Partidas: X"

        //        "Victorias manteniendo: X (Y%)"

        //        "Victorias cambiando:   X (Y%)"

        //

        //    - Comentar brevemente cuál estrategia resulta mejor en la simulación.

        //      (Debería salir ~33% manteniendo y ~66% cambiando).

        //

        // ------------------------------------------------------------

        // 💡 PISTAS:

        // - Representa las puertas como 0, 1 y 2.

        // - Para hallar 'abierta', puedes usar un pequeño bucle while que pruebe valores

        //   hasta encontrar una puerta válida (≠ eleccion y ≠ premio).

        // - 'otraCerrada' es la única puerta que no es 'eleccion' ni 'abierta'.

        //

        // ------------------------------------------------------------

        // 🔁 OPCIONALES:

        // - Permitir cambiar el número de partidas (leer de args o Scanner).

        // - Mostrar resultados parciales cada 10 partidas.

        // - Añadir una estrategia "aleatoria" (a veces cambia, a veces no) y contar sus victorias.

        //

        // ============================================================

    }

}







