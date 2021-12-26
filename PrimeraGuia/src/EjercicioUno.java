public class EjercicioUno {

    public static int numSum(int num1, int num2){
        return num1 + num2;
    }

    public static int numSub(int num1, int num2){
        return num1 - num2;
    }

    public static int numMul(int num1, int num2){
        return num1 * num2;
    }

    public static int numDiv(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args){
        //Declaracion de Variables de Tipo Entero
        int NumUno = 1, NumDos = 2, NumDiez = 10;
        int ResultSum, ResultSub, ResultMul, ResultDiv;

        //Operaciones
        ResultSum = numSum(NumUno, NumDos);
        ResultSub = numSub(NumDiez, NumUno);
        ResultMul = numMul(NumDos, NumUno);
        ResultDiv = numDiv(NumDiez, NumDos);

        //Resultados
        String StringSum = String.format("El resultado de sumar %s y %s es %s", NumUno, NumDos, ResultSum);
        String StringSub = String.format("El resultado de restar %s y %s es %s", NumDiez, NumUno, ResultSub);
        String StringMul = String.format("El resultado de multiplicar %s y %s es %s", NumDos, NumUno, ResultMul);
        String StringDiv = String.format("El resultado de dividir %s y %s es %s", NumDiez, NumDos, ResultDiv);

        System.out.println(StringSum);
        System.out.println(StringSub);
        System.out.println(StringMul);
        System.out.println(StringDiv);
    }
}
