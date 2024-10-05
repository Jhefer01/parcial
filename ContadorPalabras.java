public class ContadorPalabras {

    // Función principal donde probamos la lógica con ejemplos.
    public static void main(String[] args) {
        // Ejemplo de cadena con palabras y espacios adicionales.
        String cadena1 = "Hola, este es un ejemplo.";
        String cadena2 = "  Este texto   tiene espacios adicionales   ";

        // Contamos las palabras en cada cadena y mostramos el resultado.
        System.out.println("La cadena 1 tiene " + contarPalabras(cadena1) + " palabras.");
        System.out.println("La cadena 2 tiene " + contarPalabras(cadena2) + " palabras.");
    }

    // Esta función se encarga de contar cuántas palabras tiene una cadena.
    public static int contarPalabras(String cadena) {
        // Eliminamos los espacios en blanco al principio y al final de la cadena.
        cadena = cadena.trim();

        // Si la cadena está vacía después de eliminar los espacios, no hay palabras.
        if (cadena.isEmpty()) {
            return 0;
        }

        // Dividimos la cadena en palabras usando los espacios como separadores.
        // Esto ignora automáticamente los espacios adicionales.
        String[] palabras = cadena.split("\\s+");

        // Retornamos la cantidad de palabras (el tamaño del arreglo resultante).
        return palabras.length;
    }
}
