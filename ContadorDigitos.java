public class ContadorDigitos {
    
    // Esta función recibe un número y te dice cuántos dígitos tiene.
    public static void main(String[] args) {
        // Aquí tienes un número de ejemplo para probar la función.
        int numero = 12345; // Puedes cambiarlo por cualquier otro número.
        
        // Llamamos a la función que cuenta los dígitos y mostramos el resultado.
        int cantidadDeDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDeDigitos + " dígitos.");
    }

    // Esta función es donde pasa la magia: cuenta cuántos dígitos tiene el número.
    public static int contarDigitos(int numero) {
        // Si el número es negativo, lo convertimos a positivo porque los dígitos son los mismos.
        numero = Math.abs(numero);
        
        // Si el número es 0, ya sabemos que tiene un solo dígito.
        if (numero == 0) {
            return 1;
        }
        
        // Inicializamos una variable para contar.
        int contador = 0;

        // Mientras el número no se quede en 0, seguimos dividiéndolo entre 10.
        while (numero > 0) {
            numero = numero / 10; // Quitamos el último dígito.
            contador++; // Contamos ese dígito.
        }

        // Devolvemos el total de dígitos contados.
        return contador;
    }
}
