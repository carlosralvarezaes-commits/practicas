import java.util.Random;
import java.util.Scanner;

public class juego {

    static char[][] mapa;
    static int jugadorX, jugadorY;
    static int enemigoX, enemigoY;
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Tamaño del tablero (ej. 10): ");
        int tamanho = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        mapa = new char[tamanho][tamanho];
        inicializarMapa(tamanho);

        int turnos = 0;
        boolean juegoActivo = true;

        while (juegoActivo == true) {
            imprimirMapa();
            System.out.print("¿Mover (M) o Disparar (A)? ");
            String accion = scanner.nextLine().toUpperCase();

            if (accion.equals("M")) {
                moverJugador();
            } else if (accion.equals("A")) {
                if (atacar()) {
                    System.out.println("¡Has cazado al enemigo!");
                    juegoActivo = false;
                    break;
                } else {
                    System.out.println("Fallaste el disparo.");
                }
            }

            moverEnemigo();
            turnos++;
        }

        imprimirMapa();
        System.out.println("¡Victoria! Has cazado al enemigo en " + turnos + " turnos.");
    }

    static void inicializarMapa(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                mapa[i][j] = '.';
            }
        }

        do {
            jugadorX = rand.nextInt(tamaño);
            jugadorY = rand.nextInt(tamaño);
            enemigoX = rand.nextInt(tamaño);
            enemigoY = rand.nextInt(tamaño);
        } while (jugadorX == enemigoX && jugadorY == enemigoY);

        mapa[jugadorX][jugadorY] = 'J';
        mapa[enemigoX][enemigoY] = 'E';
    }

    static void imprimirMapa() {
        for (char[] fila : mapa) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    static void moverJugador() {
        System.out.print("Mover (W/A/S/D/N): ");
        String direccion = scanner.nextLine().toUpperCase();

        int nuevaX = jugadorX;
        int nuevaY = jugadorY;

        switch (direccion) {
            case "W": nuevaX--; break;
            case "A": nuevaY--; break;
            case "S": nuevaX++; break;
            case "D": nuevaY++; break;
            case "N": return;
            default:
                System.out.println("Dirección inválida.");
                return;
        }

        if (esMovimientoValido(nuevaX, nuevaY)) {
            mapa[jugadorX][jugadorY] = '.';
            jugadorX = nuevaX;
            jugadorY = nuevaY;
            mapa[jugadorX][jugadorY] = 'J';
        } else {
            System.out.println("Movimiento no válido.");
        }
    }

    static boolean esMovimientoValido(int x, int y) {
        return x >= 0 && x < mapa.length && y >= 0 && y < mapa.length && mapa[x][y] == '.';
    }

    static boolean atacar() {
        System.out.print("Disparar (W/A/S/D): ");
        String direccion = scanner.nextLine().toUpperCase();

        int objetivoX = jugadorX;
        int objetivoY = jugadorY;

        switch (direccion) {
            case "W": objetivoX--; break;
            case "A": objetivoY--; break;
            case "S": objetivoX++; break;
            case "D": objetivoY++; break;
            default:
                System.out.println("Dirección inválida.");
                return false;
        }

        if (objetivoX == enemigoX && objetivoY == enemigoY) {
            return true;
        }
        return false;
    }

    static void moverEnemigo() {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < 10; i++) {
            int dir = rand.nextInt(4);
            int nuevaX = enemigoX + dx[dir];
            int nuevaY = enemigoY + dy[dir];

            if (esMovimientoValido(nuevaX, nuevaY)) {
                mapa[enemigoX][enemigoY] = '.';
                enemigoX = nuevaX;
                enemigoY = nuevaY;
                mapa[enemigoX][enemigoY] = 'E';
                break;
            }
        }
    }
}
