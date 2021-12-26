import java.util.Scanner;
import javafx.util.Pair;
import java.util.ArrayList;

public class Challenge{
    public static String nameInput(Scanner tempScanner){
        System.out.println("Introduzca el nombre del producto: ");
        String productName = sc.next();
        return productName;
    }

    public static Float priceInput(Scanner tempScanner){
        System.out.println("Introduzca el precio del producto: ");
        Float productPrice = sc.nextFloat();
        return productPrice;
    }

    public static Pair<String, Float> dataInput(Scanner tempScanner){
        Pair<String, Float> returnedData = new Pair<>();
        name = nameInput(tempScanner);
        price = priceInput(tempScanner);
        return returnedData(name, price);
    }

    public static Float calculateIva(Float price){
        Float result;
        result = price * 0.13;
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> indexes = new ArrayList<>();
        ArrayList<Pair<String, Float>> values = new ArrayList<>();
        ArrayList<Float> iva = new ArrayList<>();
        Int loop = 0;
        Scanner sc = new Scanner(System.in);

        while (loop >= 0) {
            indexes.add(loop);
            values.add(dataInput(sc));

            System.out.println("¿Desea añadir otro producto? \nY / N: ");
            String answer = sc.next();

            if (answer == 'Y') {
                loop =+ 1;
                indexes.add(loop);
                values.add(dataInput(sc));
            } else {
                break;
            }
        }
        
        for (Int i : indexes){
                iva.add(calculateIva(values.get(i).getValue()));
            }
        
        for (Int i : indexes){
            println("The product: "+values.get(i).getKey()+" with price: $"+values.get(i).getValue()+
                "has an IVA of: $"+iva.get(i)+" for a total of: $"+
                (values.get(i).getValue()+iva.get(i)));
        }
    }
}