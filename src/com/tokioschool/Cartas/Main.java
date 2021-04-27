package com.tokioschool.Cartas;
//Modifica la clase `Mazo` que hemos visto en el ejemplo de las cartas para que pueda ordenarse según distintos criterios y algoritmos de ordenación.
//
//        Para ello:
//
//        - Crea una clase abstracta AlgoritmoOrdenacion que incluya un método abstracto `ordenar(List listaCartas)` que devuelve la lista de cartas pasadas por parámetro ordenadas.
//        - Crea subclases de `AlgorimoOrdenacion` que ordenan las cartas por diferentes criterios:
//
//        - Ordenación palo-número-incremental: Ordena las cartas primero por el palo (por orden alfabético de BASTOS, COPAS, ESPADAS, OROS) y luego por el número (de más pequeño a más grande).
//
//        - Ordenación palo-número-decremental: Ordena las cartas primero por el palo (por orden alfabético de BASTOS, COPAS, ESPADAS, OROS) y luego por el número (de más grande a más pequeño).
//
//        - Ordenación número-palo. Ordena a las cartas primero por número (incremental) y luego por palo (orden alfabético)
//
//        - Puedes buscar algoritmos de ordenación en: [https://](https://es.wikipedia.org/wiki/Algoritmo_de_ordenamiento)[es.wikipedia.org/wiki/Algoritmo_de_ordenamiento](https://es.wikipedia.org/wiki/Algoritmo_de_ordenamiento) y necesitarás especificar el criterio de ordenación de cartas.
//        - Permite que se le pueda indicar el algoritmo de ordenación al mazo mediante un método setAlgoritmo
//        - Ordena el mazo mediante el algoritmo de ordenación que le has indicado, el mazo no sabe realmente cómo se está ordenando
//
//
//        En el main se muestra cómo se crea un mazo y se ordena de varias formas distintas.

class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();
        System.out.println(mazo.toString());



        mazo.setAlgoritmo(new OrdPalNumInc() );
        mazo.ordena();
        System.out.println(mazo.toString());

        mazo.setAlgoritmo(new OrdPalNumDec());
        mazo.ordena();
        System.out.println(mazo.toString());

        mazo.setAlgoritmo(new OrdNumIncPal());
        mazo.ordena();
        System.out.println(mazo.toString());
    }
}