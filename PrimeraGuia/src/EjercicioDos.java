import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args){
        //Definiendo elementos iniciales
        String name;
        Scanner sc = new Scanner(System.in);

        //Input del Usuario
        System.out.print("Introduzca su nombre: ");
        name = sc.next();

        //Output
        String OutputString = String.format("Bienvenido %s", name);
        System.out.println(OutputString);
    }
}
