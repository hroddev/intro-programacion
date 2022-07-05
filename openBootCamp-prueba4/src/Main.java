public class Main {
    public static void main(String[] args) {
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        int numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        } else if (numeroIf == 0) {
            System.out.println("Cero");
        }
        // while loop

        int numeroWhile = 4;
        while (numeroWhile <= 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // do while que se ejecute una vez

        int numeroDoWhile = 4;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile= numeroWhile +1;
        }
        while (numeroDoWhile <= 3);

        // caso con for

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // switch estacion
        String estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("Sol y playa");
                break;
            case "invierno":
                System.out.println("Cafe caliente y buena compañia");
                break;
            case "otoño":
                System.out.println("Camara y mochila");
                break;
            case "primavera":
                System.out.println("Zapatillas y balón");
                break;
            default:
                System.out.println("No es una estación valida");
        }
    }
}