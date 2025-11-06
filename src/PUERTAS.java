public class PUERTAS {
    public static void main(String[] args) {

        int partidas = 100; // número de partidas
        int victoriasManteniendo = 0;
        int victoriasCambiando = 0;

        for (int i = 0; i < partidas; i = i + 1) {

            // 1. Puerta con premio (0,1,2)
            int premio = (int)(Math.random() * 3);

            // 2. Elección inicial del concursante
            int eleccion = (int)(Math.random() * 3);

            // 3. El presentador abre una puerta que no sea la elegida ni la del premio
            int abierta = -1;
            for (int puerta = 0; puerta < 3; puerta = puerta + 1) {
                if (puerta != eleccion && puerta != premio) {
                    abierta = puerta;
                }
            }

            // 4. La otra puerta cerrada (la que queda)
            int otraCerrada = -1;
            for (int puerta = 0; puerta < 3; puerta = puerta + 1) {
                if (puerta != eleccion && puerta != abierta) {
                    otraCerrada = puerta;
                }
            }

            // 5. Estrategia A: mantener
            if (eleccion == premio) {
                victoriasManteniendo = victoriasManteniendo + 1;
            }

            // 6. Estrategia B: cambiar
            if (otraCerrada == premio) {
                victoriasCambiando = victoriasCambiando + 1;
            }
        }

        // Mostrar resultados
        System.out.println("Partidas: " + partidas);
        System.out.println("Victorias manteniendo: " + victoriasManteniendo);
        System.out.println("Victorias cambiando: " + victoriasCambiando);
    }
}