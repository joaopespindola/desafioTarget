import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static String calculaFibonacci(int n) {
        List<Integer> fibonacciLista = new ArrayList<>();
        String resultado;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fibonacciLista.add(i);
            } else {
                int fibonacciNum = fibonacciLista.get(i - 1) + fibonacciLista.get(i - 2);
                fibonacciLista.add(fibonacciNum);
            }
        }

        if (fibonacciLista.contains(n)) {
            resultado = "Pertence";
        } else {
            resultado = "Nao pertence";
        }

        return resultado;
    }
}
