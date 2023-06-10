public class Main {
    public static void main(String[] args) {

        double precio = 100.56;

        // Sin IVA
        System.out.println("Precio sin IVA: " + precio);

        // IVA 21%
        System.out.printf("Precio + IVA(21%%): %.2f%n", agregarIva(precio));

        // otro IVA
        double tax = 0.10;
        System.out.printf("Precio + IVA(%.2f%%): %.2f%n", tax,  agregarIva(precio, tax));

    }

    private static double agregarIva(double monto){
        return monto + (monto * 0.21);
    }
    private static double agregarIva(double monto, double tax){
        return monto + (monto * tax);
    }
}