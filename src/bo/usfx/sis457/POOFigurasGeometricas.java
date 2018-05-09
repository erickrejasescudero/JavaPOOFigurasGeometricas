/*
 * Ejemplo del Principio de Encapsulamiento 
 */
package bo.usfx.sis457;

import bo.usfx.sis457.figuras.*;
import java.util.Scanner;

/**
 * Clase principal que instancia objetos de las clases del paquete figuras
 * @author Marcelo
 */
public class POOFigurasGeometricas {
        
    /**
     * Clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        Scanner entradaTeclado;
        int opcion;
        
        System.out.println("+==================================================+");
        System.out.println("| Programa: Figuras Geometricas                    |");
        System.out.println("| - Ejemplo de Encapsulamiento                     |");
        System.out.println("+==================================================+");
        System.out.println("| Que desea realizar?                              |");
        System.out.println("| 1) Calcular el area y perimetro de un Circulo    |");
        System.out.println("| 2) Calcular el area y perimetro de un Cuadrado   |");
        System.out.println("| 3) Calcular el area y perimetro de un Rectangulo |");
        System.out.println("| 4) Calcular el area y perimetro de un Trapecio   |");
        System.out.println("| 5) Calcular el area y perimetro de un Rombo      |");
        System.out.println("| 6) Calcular el area y perimetro de un Triangulo  |");        
        System.out.println("| *) Salir                                         |");
        System.out.println("+==================================================+");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.nextInt();
        switch (opcion) {
            case 1:
                /* Se instancia un objeto de la Clase Círculo y posteriormente se modifica el valor
                   de su propiedad "Radio" a través de un método accesor o setter (setRadio). */
                Circulo circulo = new Circulo();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Circulo                             |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del radio: ");
                float radio = (float)entradaTeclado.nextFloat();
                circulo.setRadio(radio);
                System.out.println("El Area del Circulo es: " + circulo.getArea());
                System.out.println("El Perimetro del Circulo es: " + circulo.getPerimetro());
                break;
            case 2:
                /* Se instancia un objeto de la Clase Cuadrado y posteriormente se modifica el valor
                   de su propiedad "Lado" a través de un método accesor o setter (setRadio). */
                Cuadrado cuadrado = new Cuadrado();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Cuadrado                            |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del lado: ");
                cuadrado.setLado(entradaTeclado.nextDouble());
                System.out.println("El Area del Cuadrado es: " + cuadrado.getArea());
                System.out.println("El Perimetro del Cuadrado es: " + cuadrado.getPerimetro());
                break;
            case 3:
                /* Se instancia un objeto de la Clase Rectangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectangulo                          |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la Base: ");
                double base = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la Altura: ");
                double altura = entradaTeclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("El Area del Rectangulo es: " + rectangulo.getArea());
                System.out.println("El Perimetro del Rectangulo es: " + rectangulo.getPerimetro());
                break;
            case 4:
                /* Se instancia un objeto de la Clase Trapecio y a la vez se inicilaizan los valores
                   de sus propiedades "BaseMayor" , "BaseMenor" , "Altura1" y "Lado"a través del método Constructor (Trapecio). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Trapecio                            |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la basemayor: ");
                double basemayor = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la basemenor: ");
                double basemenor = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la altura1: ");
                double altura1 = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la lado: ");
                double lado = entradaTeclado.nextDouble();
                Trapecio trapecio = new Trapecio(basemayor, basemenor, altura1, lado);
                System.out.println("El Area del Trapecio es: " + trapecio.getArea());
                System.out.println("El Perimetro del Trapecio es: " + trapecio.getPerimetro());
                break;
            case 5:
                /* Se instancia un objeto de la Clase Rombo y a la vez se inicilaizan los valores
                   de sus propiedades "DiagonalMayor" , "DiagonalMenor" y "Longitud" a través del método Constructor (Rombo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rombo                               |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la diagonalmayor: ");
                double diagonalmayor = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la diagonalmenor: ");
                double diagonalmenor = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la longitud: ");
                double longitud = entradaTeclado.nextDouble();
                Rombo rombo = new Rombo (diagonalmayor, diagonalmenor, longitud);
                System.out.println("El Area del Rombo es: " + rombo.getArea());
                System.out.println("El Perimetro del Rombo es: " + rombo.getPerimetro());
                break;
            case 6:
                /* Se instancia un objeto de la Clase Triangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base1" , "Altura2" y "Lado1"a través del método Constructor (Triangulo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Triangulo                           |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la base1: ");
                double base1 = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la altura2: ");
                double altura2 = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la lado1: ");
                double lado1 = entradaTeclado.nextDouble();
                Triangulo triangulo = new Triangulo (base1, altura2, lado1);
                System.out.println("El Area del Triangulo es: " + triangulo.getArea());
                System.out.println("El Perimetro del Triangulo es: " + triangulo.getPerimetro());
                break;
            default:
                System.out.println("Salio del programa");
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
