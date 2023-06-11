public class Main {
    public static void main(String[] args) {
        // Crear objeto SmartPhone y mostrar sus valores
        SmartPhone smartphone = new SmartPhone("Samsung", "Galaxy S21", "Android");
        System.out.println("Marca del SmartPhone: " + smartphone.getMarca());
        System.out.println("Modelo del SmartPhone: " + smartphone.getModelo());
        System.out.println("Sistema Operativo del SmartPhone: " + smartphone.getSistemaOperativo());
        System.out.println();

        // Crear objeto SmartWatch y mostrar sus valores
        SmartWatch smartwatch = new SmartWatch("Apple", "Apple Watch Series 6", "Correa de acero");
        System.out.println("Marca del SmartWatch: " + smartwatch.getMarca());
        System.out.println("Modelo del SmartWatch: " + smartwatch.getModelo());
        System.out.println("Tipo de Correa del SmartWatch: " + smartwatch.getTipoCorrea());
    }
}