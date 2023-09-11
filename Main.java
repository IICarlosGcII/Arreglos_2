import java.util.Scanner;

//Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden introducidos
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Usamos scanner para esacnnear los datos del usuario

        //Declarando arreglo
        float numeros[] = new float[5]; //Definimos al arreglo junto con su tamaño

        //Pidiendo los numeros del arreglo
        System.out.println("Guardando los datos en el arreglo.");
        for (int i = 0; i < 5; i++) { //Guardamos los datos de arreglo con el escanner
            System.out.println((i + 1) + " Digite un número");
            numeros[i] = entrada.nextFloat();
        }
        //Impirmiendo el arreglo,forEach de la misma manera a la que se intridujo
        System.out.println("Imprimiendo los datos del arreglo:");
        for (int i=0;i<5;i++) { //Se recorren todas las posiciones del arreglo y se imprimen
            System.out.println(numeros[i]); //Se imprimen los datos del arreglo
        }
        //Impirmiendo el arreglo,forEach  de la manera inversa a la que se introdujeron
        System.out.println("Imprimiendo los datos del arreglo:");
        for (int i=4; i>=0; i--) { //Se recorren los datos de arreglo de manera inversa
            System.out.println(numeros[i]); //Se muestran los datos del arreglo de manera inversa a la que se introdujeron

           }
        }
    }