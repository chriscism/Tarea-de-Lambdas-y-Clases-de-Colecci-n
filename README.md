# Tarea-de-Lambdas-y-Clases-de-Colecci-n
El proyecto aquí presentado corresponde a la tarea de Lambdas de la materia de Programación orientado a objetos. Realizamos diversas operaciones sobre colecciones de objetos mediante el uso de Lambdas y Streams. Incluye un main en el cual se puede poner a prueba cada uno de los métodos.

Métodos elaborados:
1. multiplicarPorFactor(lista, factor) - Multiplica cada elemento de la lista por un factor dado. Modifica la lista original.
2. cuadradosDeLosParesUnicos(numeros) - Filtra los números pares, elimina duplicados y devuelve un HashSet con sus cuadrados.
3. removerCadenas(cadenas, longitud, letra) - Elimina las cadenas que empiezan con la letra dada o que son más cortas que la longitud indicada.
4. convertirAMayusculas(cadenas) - Devuelve una nueva lista con todas las cadenas en mayúsculas. Retorna lista vacía si hay null.
5. mapaDeLongitudes(cadenas) - Devuelve un HashMap donde cada cadena es la clave y su longitud el valor.
6. modificadorInventario(inventario) - Imprime un catálogo aplicando un descuento del 10% a cada precio.
7. contadorFrecuencias(palabras) - Cuenta cuántas veces aparece cada palabra y lo devuelve en un HashMap.
8. clasificadorPalabras(frecuencias, limite) - Devuelve solo las palabras cuya frecuencia sea menor al límite dado.
9. deduplicacionPalabras(frase, N) - Divide una frase en palabras, descarta las de longitud menor a N y elimina duplicados.
10. topeFrecuencias(frecuencias, n) - Limita los valores de frecuencia que superen el tope n. Modifica el mapa directamente.

## Compilación y ejecución
Necesitas tener instalado JDK 17 o superior.
1. Descargar los archivos
2. Juntarlos todos en una misma carpeta
3. Abrir la carpeta desde una terminal
4. Ejecutar en orden:
   javac MetodosDeNumeros.java MetodosDeCadenas.java Main.java
   java Main
Ejemplo de salida:
<img width="326" height="555" alt="image" src="https://github.com/user-attachments/assets/4774ffa9-2555-4cfb-8f05-5e02e45ccac8" />

