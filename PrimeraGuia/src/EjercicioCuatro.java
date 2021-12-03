import java.util.Scanner;

public class EjercicioCuatro {
    public static boolean esPar(int InputVal){
        return ((InputVal % 2) == 0) ? true : false;
    }
    public static void main(String[] args){
        //Inicializa el programa y pide valores
        int InputNum;
        boolean Resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        InputNum = sc.nextInt();

        //Operaciones
        Resultado = esPar(InputNum);

        if (Resultado == true){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
