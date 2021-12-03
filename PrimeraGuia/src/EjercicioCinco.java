import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {
    public static boolean esPrimo(int InputVal){
        boolean result;
        if ((InputVal > 1) ? ((InputVal % 2) == 0) : false){
            result = false;
        } else if ((InputVal > 1) ? ((InputVal % 3) == 0) : false){ 
            result = false;
        } else {
            result = true;
        }
        return result;
    }
    public static void main(String[] args){
        //Inicializa el programa y pide valores 
        List<Integer> Primos = new ArrayList<>();
        boolean ResultPrimo;

        //Operaciones
        for (int i = 1; i <= 100; i++){
            ResultPrimo = esPrimo(i);
            if (ResultPrimo == true){
                Primos.add(i);
            } 
        }
        System.out.println("Los numeros primos del 1 al 100 son:");
        System.out.println(Primos);
    }
}
