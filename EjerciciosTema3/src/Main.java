public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Pedro", "Ana"};
        String resultado = "";

        for (String nombre : nombres) {
            resultado += nombre + " ";
        }

        System.out.println("Resultado final: " + resultado.trim());
    }
}