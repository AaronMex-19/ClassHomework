import java.util.*;

public class TallerFunciones {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void edad() {
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad + " años");
    }

    public static void suma() {
        System.out.print("Ingresa el primer número: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("La suma es: " + (n1 + n2));
    }

    public static void numAleatorio() {
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        do {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();
            if (intento < numeroSecreto)
                System.out.println("El número es mayor.");
            else if (intento > numeroSecreto)
                System.out.println("El número es menor.");
            else
                System.out.println("¡Felicitaciones, adivinaste el número!");
        } while (intento != numeroSecreto);
    }

    public static void contadorVocales() {
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        System.out.println("La cadena tiene " + contador + " vocales.");
    }

    public static void palindromo() {
        sc.nextLine();
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toLowerCase().replace(" ", "");
        boolean esPalindromo = palabra.equals(new StringBuilder(palabra).reverse().toString());
        System.out.println("¿Es palíndromo?: " + esPalindromo);
    }

    public static void calcularPotencia() {
        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa el exponente: ");
        double exp = sc.nextDouble();
        System.out.println("Resultado: " + Math.pow(base, exp));
    }

    public static void calcularMedia() {
        sc.nextLine();
        System.out.print("Ingresa números separados por comas: ");
        String[] partes = sc.nextLine().split(",");
        double suma = 0;
        for (String p : partes) suma += Double.parseDouble(p.trim());
        double media = suma / partes.length;
        System.out.println("La media es: " + media);
    }

    public static void invertirCadena() {
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        String invertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena invertida: " + invertida);
    }

    public static void mayorDeTresNumeros() {
        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Número 3: ");
        double n3 = sc.nextDouble();
        double mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El número mayor es: " + mayor);
    }

    public static void calcularArea() {
        System.out.print("Ingresa el radio: ");
        double radio = sc.nextDouble();
        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();
        double area = 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área del cilindro es: " + area);
    }

    public static void buscarPalabra() {
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        System.out.print("Palabra a buscar: ");
        String palabra = sc.nextLine().toLowerCase();
        System.out.println("¿La palabra está en la cadena?: " + cadena.contains(palabra));
    }

    public static void promedio() {
        sc.nextLine();
        System.out.print("Ingresa varios números separados por comas: ");
        String[] partes = sc.nextLine().split(",");
        double suma = 0;
        for (String p : partes) suma += Double.parseDouble(p.trim());
        System.out.println("El promedio es: " + (suma / partes.length));
    }

    public static void multiplicarLista() {
        sc.nextLine();
        System.out.print("Ingresa una lista de números separados por comas: ");
        String[] partes = sc.nextLine().split(",");
        System.out.print("Ingresa el número multiplicador: ");
        double mult = sc.nextDouble();
        System.out.print("Nueva lista: [");
        for (int i = 0; i < partes.length; i++) {
            double resultado = Double.parseDouble(partes[i].trim()) * mult;
            System.out.print(resultado);
            if (i < partes.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void mayorDeVariosNumeros() {
        sc.nextLine();
        System.out.print("Ingresa varios números separados por comas: ");
        String[] partes = sc.nextLine().split(",");
        double mayor = Double.parseDouble(partes[0].trim());
        for (String p : partes) {
            double num = Double.parseDouble(p.trim());
            if (num > mayor) mayor = num;
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public static void calcularMediana() {
        sc.nextLine();
        System.out.print("Ingresa varios números separados por comas: ");
        String[] partes = sc.nextLine().split(",");
        double[] numeros = new double[partes.length];
        for (int i = 0; i < partes.length; i++)
            numeros[i] = Double.parseDouble(partes[i].trim());
        Arrays.sort(numeros);
        double mediana;
        int n = numeros.length;
        if (n % 2 == 0)
            mediana = (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        else
            mediana = numeros[n / 2];
        System.out.println("La mediana es: " + mediana);
    }

    public static void contarOcurrencias() {
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        System.out.print("Ingresa la palabra a contar: ");
        String palabra = sc.nextLine().toLowerCase();
        int count = 0;
        int index = 0;
        while ((index = cadena.indexOf(palabra, index)) != -1) {
            count++;
            index += palabra.length();
        }
        System.out.println("La palabra '" + palabra + "' aparece " + count + " veces.");
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== TALLER DE FUNCIONES EN JAVA ===");
            System.out.println("1. Nivel 1 ");
            System.out.println("2. Nivel 2 ");
            System.out.println("3. Nivel 3 ");
            System.out.println("4. Nivel 4 ");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> menuNivel1();
                case 2 -> menuNivel2();
                case 3 -> menuNivel3();
                case 4 -> menuNivel4();
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // Submenús por nivel

    public static void menuNivel1() {
        System.out.println("\n--- Nivel 1 ---");
        System.out.println("1. edad");
        System.out.println("2. suma");
        System.out.println("3. numAleatorio");
        System.out.println("4. contadorVocales");
        System.out.print("Elige una función: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> edad();
            case 2 -> suma();
            case 3 -> numAleatorio();
            case 4 -> contadorVocales();
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void menuNivel2() {
        System.out.println("\n--- Nivel 2 ---");
        System.out.println("1. palindromo");
        System.out.println("2. calcularPotencia");
        System.out.println("3. calcularMedia");
        System.out.print("Elige una función: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> palindromo();
            case 2 -> calcularPotencia();
            case 3 -> calcularMedia();
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void menuNivel3() {
        System.out.println("\n--- Nivel 3 ---");
        System.out.println("1. invertirCadena");
        System.out.println("2. mayorDeTresNumeros");
        System.out.println("3. calcularArea");
        System.out.println("4. buscarPalabra");
        System.out.print("Elige una función: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> invertirCadena();
            case 2 -> mayorDeTresNumeros();
            case 3 -> calcularArea();
            case 4 -> buscarPalabra();
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void menuNivel4() {
        System.out.println("\n--- Nivel 4 ---");
        System.out.println("1. promedio");
        System.out.println("2. multiplicarLista");
        System.out.println("3. mayorDeVariosNumeros");
        System.out.println("4. calcularMediana");
        System.out.println("5. contarOcurrencias");
        System.out.print("Elige una función: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> promedio();
            case 2 -> multiplicarLista();
            case 3 -> mayorDeVariosNumeros();
            case 4 -> calcularMediana();
            case 5 -> contarOcurrencias();
            default -> System.out.println("Opción inválida.");
        }
    }
}
