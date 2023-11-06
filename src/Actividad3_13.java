// Pedir cantidad de notas, escribir la cantidad de alumnos aprobados, condicionados y suspensos.
import java.util.Scanner; //vamos a introducir variables, por lo que necesitamos esta libreria

public class Actividad3_13{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int aprobados= 0, suspensos = 0, condicionados = 0; //son contadores
        System.out.println("Introduzca el número de alumnos evaluados: ");
        int numAlumnos = sc.nextInt();

        for ( int i = 1; i <= numAlumnos; i ++){
            //Iniciamos cuando i=1, está iteración tiene de condición que no puede superar
            // el número de alumnos ingresado anteriormente, y si cumple, incrementamos i en una unidad.
            int nota;
            //La declaramos aquí para que englobe todos los bucles posteriores.
            // También se hubiese podido declarar fuera del bucle for.
            //Lo dejamos en int porque en el libro está así. Por lo que solo procesará números enteros.
            do {
                System.out.println("Nota del alumno número " + i + ": ");
                //La i nos da el número del alumno en el que estamos.
                nota = sc.nextInt();

                if (nota > 10) {
                    System.out.println("La nota no es correcta. Introduce una nota válida.: ");
                    //Hasta que no se introduce una nota correcta, no slimos de esté bucle.
                }
            } while (nota > 10);

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else if (nota < 4) {
                suspensos++;
            }
        }
        System.out.println("Han aprobado: " + aprobados);
        System.out.println("Están condicionados: " + condicionados);
        System.out.println("Han suspendido: " + suspensos);

    }
}
//Después de hacer lo que el ejercicio pedía, he visto que nos podemos ver en la situación en que nos equivoquemos
//al introducir las notas. Las notas serán de 0 a 10.
//Si son pocos alumnos se vuelve a empezar, pero si hay muchos, es un problema.
//Este problema lo he solucionado introduciendo un bucle do-while para poder corregir el error sin volver a empezar de 0.