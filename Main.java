import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

final static Scanner scanner = new Scanner(System.in);
void main() {
    int opcion = -1;

    while (opcion != 0) {
        System.out.println("1. multiplicarPorFactor");
        System.out.println("2. cuadradosDeLosParesUnicos");
        System.out.println("3. removerCadenas");
        System.out.println("4. convertirAMayusculas");
        System.out.println("5. mapaDeLongitudes");
        System.out.println("6. modificadorInventario");
        System.out.println("7. contadorFrecuencias");
        System.out.println("8. clasificadorPalabras");
        System.out.println("9. deduplicacionPalabras");
        System.out.println("10. topeFrecuencias");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> probarMultiplicarPorFactor();
            case 2 -> probarCuadradosDeLosParesUnicos();
            case 3 -> probarRemoverCadenas();
            case 4 -> probarConvertirAMayusculas();
            case 5 -> probarMapaDeLongitudes();
            case 6 -> probarModificadorInventario();
            case 7 -> probarContadorFrecuencias();
            case 8 -> probarClasificadorPalabras();
            case 9 -> probarDeduplicacionPalabras();
            case 10 -> probarTopeFrecuencias();
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida.");
        }
    }
}



static void probarMultiplicarPorFactor() {
    // Caso normal
    ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("\nCaso normal (factor 3) --");
    System.out.println("Antes:   " + lista);
    MetodosDeNumeros.multiplicarPorFactor(lista, 3);
    System.out.println("Después: " + lista);

    // Lista vacía
    ArrayList<Integer> vacia = new ArrayList<>();
    System.out.println("\n LISTA VACIA ");
    System.out.println("Antes:   " + vacia);
    MetodosDeNumeros.multiplicarPorFactor(vacia, 3);
    System.out.println("Después: " + vacia);
}

static void probarCuadradosDeLosParesUnicos() {
    // Caso normal
    ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 6, 7, 8));
    System.out.println("\n-- Caso normal --");
    System.out.println("Lista:     " + numeros);
    System.out.println("Resultado: " + MetodosDeNumeros.cuadradosDeLosParesUnicos(numeros));

    // Solo impares
    ArrayList<Integer> impares = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
    System.out.println("\nSolo impares");
    System.out.println("Lista:     " + impares);
    System.out.println("Resultado: " + MetodosDeNumeros.cuadradosDeLosParesUnicos(impares));
}

static void probarRemoverCadenas() {
    ArrayList<String> cadenas = new ArrayList<>(
            Arrays.asList("hola", "manzana", "platano", "pato", "amigos", "ala"));
    System.out.println("\nElimina cadenas que empiezan con a o longitud menor a 5");
    System.out.println("Antes:   " + cadenas);
    MetodosDeCadenas.removerCadenas(cadenas, 5, "a");
    System.out.println("Después: " + cadenas);

    ArrayList<String> vacia = new ArrayList<>();
    System.out.println("\n Lista vacía");
    System.out.println("Antes:   " + vacia);
    MetodosDeCadenas.removerCadenas(vacia, 5, "a");
    System.out.println("Después: " + vacia);
}

static void probarConvertirAMayusculas() {
    ArrayList<String> cadenas = new ArrayList<>(Arrays.asList("hola", "amigos", "ok"));
    System.out.println("\nCaso normal");
    System.out.println("Antes:   " + cadenas);
    System.out.println("Después: " + MetodosDeCadenas.convertirAMayusculas(cadenas));

    ArrayList<String> conNull = new ArrayList<>(Arrays.asList("hola", null, "mundo"));
    System.out.println("\nLista con null");
    System.out.println("Antes:   " + conNull);
    System.out.println("Después: " + MetodosDeCadenas.convertirAMayusculas(conNull));
}

static void probarMapaDeLongitudes() {
    ArrayList<String> cadenas = new ArrayList<>(Arrays.asList("gato", "perro", "elefante", "oso"));
    System.out.println("\n Caso normal");
    System.out.println("Lista:     " + cadenas);
    System.out.println("Resultado: " + MetodosDeCadenas.mapaDeLongitudes(cadenas));

    // Con duplicados
    ArrayList<String> conDuplicados = new ArrayList<>(Arrays.asList("sol", "sol", "luna"));
    System.out.println("\nCon duplicados");
    System.out.println("Lista:     " + conDuplicados);
    System.out.println("Resultado: " + MetodosDeCadenas.mapaDeLongitudes(conDuplicados));
}

static void probarModificadorInventario() {
    HashMap<String, Double> inventario = new HashMap<>();
    inventario.put("Laptop", 1200.00);
    inventario.put("Teclado", 85.50);
    inventario.put("Mouse", 35.99);

    System.out.println("\nInventario con descuento del 10%");
    MetodosDeCadenas.modificadorInventario(inventario);

    System.out.println("\nInventario vacío");
    MetodosDeCadenas.modificadorInventario(new HashMap<>());

    System.out.println("\nInventario null");
    MetodosDeCadenas.modificadorInventario(null);
}

static void probarContadorFrecuencias() {
    ArrayList<String> palabras = new ArrayList<>(
            Arrays.asList("hola", "hola", "gato", "perro", "gato", "oso"));
    System.out.println("\nCaso normal");
    System.out.println("Lista:     " + palabras);
    System.out.println("Resultado: " + MetodosDeCadenas.contadorFrecuencias(palabras));

    System.out.println("\nLista vacía");
    System.out.println("Resultado: " + MetodosDeCadenas.contadorFrecuencias(new ArrayList<>()));
}

static void probarClasificadorPalabras() {
    HashMap<String, Integer> frecuencias = new HashMap<>();
    frecuencias.put("holA", 3);
    frecuencias.put("gato", 2);
    frecuencias.put("perro", 5);
    frecuencias.put("bigote", 1);

    System.out.println("\nPalabras con frecuencia menor a 3");
    System.out.println("Frecuencias: " + frecuencias);
    System.out.println("Resultado:   " + MetodosDeCadenas.clasificadorPalabras(frecuencias, 3));

    System.out.println("\nMapa null");
    System.out.println("Resultado: " + MetodosDeCadenas.clasificadorPalabras(null, 3));
}

static void probarDeduplicacionPalabras() {
    String frase = "Al volcan de parangaricutirimicuaro\n" +
            "lo quieren desemparangaricutirimicuarizar\n" +
            "el que lo desmparangaricutirimicuarizare\n" +
            "sera un buen desemparangaricutirimicuarizador.";
    System.out.println("\nPalabras únicas con longitud igual o mayor a  10");
    System.out.println("Frase:     \"" + frase + "\"");
    System.out.println("Resultado: " + MetodosDeCadenas.deduplicacionPalabras(frase, 10));

    System.out.println("\nFrase vacía");
    System.out.println("Resultado: " + MetodosDeCadenas.deduplicacionPalabras("", 10));

    System.out.println("\nFrase null");
    System.out.println("Resultado: " + MetodosDeCadenas.deduplicacionPalabras(null, 4));
}

static void probarTopeFrecuencias() {
    HashMap<String, Integer> frecuencias = new HashMap<>();
    frecuencias.put("juan", 5);
    frecuencias.put("pepe", 2);
    frecuencias.put("oso", 8);
    frecuencias.put("hola", 3);

    System.out.println("\n Tope en 3");
    System.out.println("Antes:   " + new HashMap<>(frecuencias));
    MetodosDeCadenas.topeFrecuencias(frecuencias, 3);
    System.out.println("Después: " + frecuencias);

}
