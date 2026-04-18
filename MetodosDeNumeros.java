import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MetodosDeNumeros {

    public MetodosDeNumeros(){

    }
    public static void multiplicarPorFactor(ArrayList<Integer> listaDeNumeros, int factor ){
        listaDeNumeros.replaceAll(numero -> numero * factor);
    }

    public static HashSet<Integer> cuadradosDeLosParesUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> cuadradosUnicos =  numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .distinct()
                .sorted()
                .map(numero -> numero*numero)
                .collect(Collectors.toCollection(HashSet::new));
        return cuadradosUnicos;

    }
}
