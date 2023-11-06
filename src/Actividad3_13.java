// Pedir cantidad de notas, escribir la cantidad de alumnos aprobados, condicionados y suspensos.
import java.util.Scanner; //vamos a introducir variables, por lo que necesitamos esta libreria
public class Actividad3_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aprobados= 0, suspensos = 0, condicionados = 0; //son contadores
        System.out.println("Introduzca el número de alumnos evaluados: ");
        int numAlumnos = sc.nextInt();
        for ( int i = 1; i <= numAlumnos; i ++){
            System.out.println("Nota del alumno número " + i + ": ");
            int nota = sc.nextInt();
            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5){
                aprobados++;
            }else if (nota < 4){
                suspensos++;
            }
        }
        System.out.println("Han aprobado: " + aprobados);
        System.out.println("Están condicionados: " + condicionados);
        System.out.println("Han suspendido: " + suspensos);

    }
}