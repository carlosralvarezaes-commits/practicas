public class arrays {
    public static void main(String[] args) {
        String[] nombresalumnos  = new String[5];

        //Se utiliza para guardar varios variables en una sola variable
        //lo q significa "new String[5]" el 5 significa cuantas variables,
        // pero este conteo de "5" comienza desde el 0 hasta el 4 en este caso
        //pero si fuese "new String[6]" seria desde el 0 hasta el 5 (0,1,2,3,4,5)


        nombresalumnos[0] = "Juan   ";
        nombresalumnos[1] = "Maria  ";
        nombresalumnos[2] = "Pedro  ";
        nombresalumnos[3] = "Antonio    ";
        nombresalumnos[4] = "Juan   ";

       String[] colorfavorito = new String[5];


       colorfavorito[0] = "Red ";
       colorfavorito[1] = "Blue ";
       colorfavorito[2] = "Green ";
       colorfavorito[3] = "Orange ";
       colorfavorito[4] = "Violet ";


        Boolean [] usagafas = new Boolean[5];
        usagafas[0] = true;
        usagafas[1] = true;
        usagafas[2] = false;
        usagafas[3] = false;
        usagafas[4] = false;

for (int posicionesdelarrys = 0;
     posicionesdelarrys < nombresalumnos.length;
     posicionesdelarrys++) {
    String paraImprimir = "El nombre del alumno es: " + nombresalumnos[posicionesdelarrys];
    paraImprimir = paraImprimir + "Su color fav:" + colorfavorito[posicionesdelarrys];
    if (usagafas[posicionesdelarrys]) {paraImprimir = paraImprimir+ "   Si usa gafas ";
    }else {
    paraImprimir = paraImprimir+ "  No se usa gafas ";
    }
    System.out.println(paraImprimir);


}
    }
}
