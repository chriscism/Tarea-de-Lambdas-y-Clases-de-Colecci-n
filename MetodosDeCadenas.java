import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MetodosDeCadenas {


    public MetodosDeCadenas() {
    }

    public static void removerCadenas(ArrayList<String> cadenas, int longitud, String letra) {
        cadenas.removeIf(cadena -> cadena.startsWith(letra) || cadena.length() < longitud);
    }

    public static ArrayList<String> convertirAMayusculas(ArrayList<String> cadenas){
        if(cadenas.isEmpty()){
            System.out.println("El arreglo está vacío");
            return new ArrayList<>();
        }
        ArrayList<String> cadenasEnMayusculas = cadenas.stream()
                .filter(Objects::nonNull)
                .map(cadena -> cadena.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
        return cadenasEnMayusculas;

    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> cadenas){
        return cadenas.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        palabra -> palabra,
                        palabra -> palabra.length(),
                        (existente, reemplazo) -> existente,
                        HashMap::new
                ));
    }

    public static void modificadorInventario(HashMap<String, Double> inventario) {
        if (inventario == null || inventario.isEmpty()) {
            System.out.println("El inventario está vacío o no existe");
            return;
        }
        System.out.println("CATÁLOGO DE PRODUCCTOS");
        inventario.forEach((producto, precio) -> {

            double precioConDescuento = precio * 0.90;


            System.out.printf("Producto: %-20s | Precio Final: $%8.2f%n",
                    producto, precioConDescuento);
        });
    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
        if (palabras == null || palabras.isEmpty()) {
            return mapaFrecuencias;
        }
        palabras.forEach(
                palabra -> mapaFrecuencias.merge(palabra, 1, (valorActual, incremento) -> valorActual + incremento)
        );

        return mapaFrecuencias;
    }

    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuencias, int limite) {
        if (frecuencias == null || frecuencias.isEmpty()) {
            return new ArrayList<>();
        }


        List<String> palabrasFiltradas = frecuencias.entrySet().stream()
                .filter(entrada -> entrada.getValue() != null && entrada.getValue() < limite)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));

        return new ArrayList<>(palabrasFiltradas);
    }

    public static HashSet<String> deduplicacionPalabras(String frase, int N) {
        if (frase == null || frase.trim().isEmpty()) {
            return new HashSet<>();
        }

        String[] palabras = frase.toLowerCase().split("\\P{L}+");


        HashSet<String> resultado = Arrays.stream(palabras)
                .filter(palabra -> !palabra.isEmpty())
                .filter(palabra -> palabra.length() >= N)
                .collect(Collectors.toCollection(HashSet::new));

        return resultado;
    }

    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int n) {
        if (frecuencias == null || frecuencias.isEmpty()) {
            return;
        }

        frecuencias.replaceAll((palabra, frecuencia) -> {
            if (frecuencia == null) {
                return null;
            }
            return frecuencia > n ? n : frecuencia;
        });
    }


}
