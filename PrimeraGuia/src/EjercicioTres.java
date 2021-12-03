import java.util.Scanner;

public class EjercicioTres {

    public static double calcularArea(double ValRadio){
        return Math.PI * Math.pow(ValRadio, 2);
    }

    public static void main(String[] args){
        //Inicializa el programa y pide valores 
        double Area;
        double Radio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor del radio: ");
        Radio = sc.nextInt();

        //Hace el calculo e imprime en pantalla
        Area = calcularArea(Radio);
        String OutputString = String.format("El valor del area es: %.2f", Area);
        System.out.println(OutputString);
    }
}