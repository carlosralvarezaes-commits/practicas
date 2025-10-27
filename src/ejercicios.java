import java.util.Scanner;
import java.util.Random;

public class ejercicios{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System system = null;
        Random rand = new Random();

        //  Datos
        // 1
        int vida = 0;
        int enemigo = 0;
        //2
        double Saldo = 0;
        double Precio = 10;
//3


//ejercicio 1
        Scanner bloque = new Scanner(System.in);
        System.out.println("introduce los bloques a picar:");
        int numerodebloques = bloque.nextInt();
        for (int bloquespicados = 1; bloquespicados <= numerodebloques; bloquespicados++) {
            System.out.println("Picando bloque:" + bloquespicados);
        }


        //2
        System.out.println("El Fresco cuesta 10 Euros");
        System.out.println("Ingrese el Saldo:");

        Saldo = lector.nextDouble();
        while (Saldo < Precio) {
            System.out.println("Saldo insuficiente");
            Saldo = lector.nextDouble();
        }
        if (Saldo == Precio) {
            System.out.println("Saldo Alcanza");
        }
        if (Saldo > Precio) {
            System.out.println("Saldo Sobra");
        }


//3

        System.out.print("Tu Vida:");
        vida = lector.nextInt();
        System.out.print("Vida enemigo:");
        enemigo = lector.nextInt();
        System.out.println("Tu Vida:" + vida);
        System.out.println("Vida enemigo:" + enemigo);


        while (vida > 0 && enemigo > 0) {
            int ataqueamigo = rand.nextInt(1, vida);
            int ataqueenemigo = rand.nextInt(1, enemigo);

            {
                vida = vida - ataqueenemigo;
            }
            {
                enemigo = enemigo - ataqueamigo;
            }
        }
        if (vida < 0 && enemigo < 0) {
            System.out.println("Vida negativo");
        }


        System.out.println("Cuantas veces quieres tirar la moneda:");
        int tiradaas = lector.nextInt();
        int contcara = 0;
        int contcruz = 0;
        for (int tiradasactual = 1; tiradasactual <= tiradaas; tiradasactual++) {
            boolean siguientevalortirado = rand.nextBoolean();
            if (siguientevalortirado) {

                contcara++;
                System.out.println("Tirada:" + tiradasactual + " ha sido cara.");
            } else {
                contcruz++;
                System.out.println("Tirada:" + tiradasactual + " ha sido cruz .");
            }
        }
        System.out.println("Cara: " + contcara);
        System.out.println("Cruz: " + contcruz);


//ejercicio 5
        System.out.println("Genere un numero aleatorio entre el 1 y el 10");
        System.out.println("Cual numero crees que es ?");
        int numero = rand.nextInt(1, 11);

        boolean usuarioacierta = false;
        int contador = 0;

        while (!usuarioacierta) {
            System.out.println("Ingrese el siguiente numero:");
            int numerousuario = lector.nextInt();
            contador += 1; //contador +=1; = contador ++ ;
            if (numerousuario > numero) {
                System.out.println("Te Pasaste");
            } else if (numerousuario < numero) {
                System.out.println("Te Quedaste");
            } else {
                System.out.println("La pegaste");
                usuarioacierta = true;
                System.out.println("Ingresaste el numero :" + contador);
            }


            //6


            String saluda = ("");
            System.out.println("Cual es tu nombre ? ");
            System.out.print("Escribe tu nombre aqui:");
            saluda = lector.next();


            System.out.println("¡Hola," + saluda + " ! Bienvenido al servidor de programación");


            //7
            System.out.print("Ingrese el valor de A:");
            int A = lector.nextInt();
            System.out.print("Ingrese el valor de B:");
            int B = lector.nextInt();

            int suma = A + B;

            System.out.print("Resultado de tu suma:" + suma);


        }

    }
}