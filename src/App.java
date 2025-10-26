public class App {
    public static void main(String[] args) throws Exception {

        //Burbuja
        //SortBubble claseSortBubble =new SortBubble();
        //claseSortBubble.printArray(numeros);
        //System.out.println("");

        //claseSortBubble.sortAscendente(numeros);
        //System.out.println("");
        //System.out.println("Ascendente:"); 
        //System.out.println("");
        //claseSortBubble.printArray(numeros);


        //claseSortBubble.sortDecendente(numeros);
        //System.out.println("");
        //System.out.println("Desendente:"); 
        //System.out.println("");
        //claseSortBubble.printArray(numeros);

        //Seleccion
        // SortSeleccion claseSortSeleccion = new SortSeleccion();
        // System.out.println("Estudiante: Antonio CarvelliSs");
        // System.out.println("Metodo Seleccion");
        // System.out.println("Original:");
        // claseSortSeleccion.printArray(numeros);
        // System.out.println("");

        // claseSortSeleccion.sortDesendente(numeros);
        // System.out.println("Desendente:");
        // claseSortSeleccion.printArray(numeros);

        // claseSortSeleccion.sortAscendente(numeros);
        // System.out.println("");
        // System.out.println("Ascendente:");
        // claseSortSeleccion.printArray(numeros);

        //Insersion
        SortInsertion sorter = new SortInsertion();

        // variable porque me da pereza poner tanto sout
        String estudiante = "Antonio Carvelli";

        // numeros
        int[] numerosOriginal = {5, 7, 0, -1, 10, 8};

        System.out.println("1. Arreglo de números enteros");
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Método Inserción");

        System.out.println("Original");
        sorter.printArray(numerosOriginal);

        /**pense en el metodo copiado para darle un plus
         * y termine con ganas de matareme
         * yo espero que de verdad no revise esto
         * porque si no me va a dar un infarto
         * pero si lo va ha hacer, espero que al menos
         * valore el esfuerzo y espero que no me reste
         * puntos, por favor me costo mucho trabajo
         * PD: Espero que tenga un buen dia
         * griacias por el esfuerzo que hace por nosotros
         * especial por que habeces si hado pensejadas
         * PD: estoy arto y escribo para desestresarme luego quito esto
         */
        
        
        // copiar 
        int[] asc = sorter.copiar(numerosOriginal);
        sorter.sortAscendente(asc, false);
        System.out.println("Ordenado Ascendente");
        sorter.printArray(asc);

        // copiar 
        int[] desc = sorter.copiar(numerosOriginal);
        sorter.sortDescendente(desc, false);
        System.out.println("Ordenado Descendente");
        sorter.printArray(desc);

        System.out.println("");


        // array nombres
        String[] nombresOriginal = {"Pedro", "Ana", "Maria", "Luis", "Juan"};

        System.out.println("2. Arreglo de cadenas (nombres)");
        System.out.println("Estudiante: " + estudiante);

        System.out.println("Array de Nombres Original:");
        sorter.printArray2(nombresOriginal);

        String[] nombresOrdenados = sorter.copiar(nombresOriginal);
        sorter.sortByName(nombresOrdenados, false);

        System.out.println("Ordenado por Nombre:");
        sorter.printArray2(nombresOrdenados);

        System.out.println("");


        // ordenar nombres de personas
        Persona[] personasOriginal = new Persona[] {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };

        System.out.println("3. Arreglo de personas ordenado por nombre");
        System.out.println("Estudiante: " + estudiante);

        System.out.println("Array de Personas Original:");
        sorter.printArrayPersonas(personasOriginal);

        Persona[] personasPorNombre = sorter.copiar(personasOriginal);
        sorter.sortPersonasByName(personasPorNombre);

        System.out.println("Ordenado por Nombres de Personas:");
        sorter.printArrayPersonas(personasPorNombre);

        System.out.println("");


        // ordenar por edad
        System.out.println("4. Arreglo de personas ordenado por edad");
        System.out.println("Estudiante: " + estudiante);

        System.out.println("Array de Personas Original:");
        sorter.printArrayPersonas(personasOriginal);

        Persona[] personasPorEdad = sorter.copiar(personasOriginal);
        sorter.sortPersonasByAge(personasPorEdad);

        System.out.println("Ordenado por EDAD de Personas:");
        sorter.printArrayPersonas(personasPorEdad);

        System.out.println("");



    }
}
