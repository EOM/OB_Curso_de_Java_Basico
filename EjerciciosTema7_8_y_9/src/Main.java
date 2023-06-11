import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(reverse("hola mundo"));

        // Ejercicio 2
        String[] arrayStrings = {"Hola", "Mundo", "Java"};
        for (String elemento : arrayStrings) {
            System.out.println(elemento);
        }

        // Ejercicio 3
        int[][] arrayBidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]: " + arrayBidimensional[i][j]);
            }
        }

        // Ejercicio 4
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(2);
        vector.remove(2);
        System.out.println(vector);

        // Ejercicio 5
        System.out.println("Problema de utilizar un Vector con capacidad por defecto si tuviésemos 1000 elementos:");
        System.out.println("El problema es que el Vector inicialmente tiene una capacidad pequeña y, cuando se alcanza esa capacidad, necesita redimensionarse, lo cual implica un coste de rendimiento.");

        // Ejercicio 6
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

        // Ejercicio 7
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Ejercicio 8
        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        // Ejercicio 9
        copiarFichero("input.txt", "output.txt");

        // Ejercicio sorpresa: programa que utiliza InputStream, PrintStream, HashMap y ArrayList
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        map.put("clave", list);

        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            String clave = entry.getKey();
            ArrayList<Integer> valores = entry.getValue();
            System.out.println("Clave: " + clave);
            for (int valor : valores) {
                System.out.println("Valor: " + valor);
            }
        }
    }
    public static String reverse(String texto) {
        StringBuilder reverso = new StringBuilder(texto);
        return reverso.reverse().toString();
    }

    public static void dividePorCero() throws ArithmeticException {
        throw new ArithmeticException();
    }

    public static void copiarFichero(String fileIn, String fileOut) {
        // Código para copiar el contenido del fichero fileIn al fichero fileOut
    }
}