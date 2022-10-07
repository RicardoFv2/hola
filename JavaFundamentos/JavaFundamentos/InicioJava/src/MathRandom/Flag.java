package MathRandom;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {

        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        System.out.println("Generador aleatorio de banderas");
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántas franjas quiere para la bandera? ");
        int franjas = s.nextInt();

        System.out.println("--------------");

        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int) (Math.random() * 6)]);

            System.out.println("--------------");

        }
    }
}
