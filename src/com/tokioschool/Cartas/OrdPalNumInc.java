package com.tokioschool.Cartas;


public class OrdPalNumInc extends AlgoritmoOrdenacion {
    @Override
    public Mazo ordena(Mazo mazo) {
        // Algoritmo de ordenación
        int palo;
        int numero;
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int z = 0; z < 10; z++) {
                for (int j = 0; j < mazo.numCartas(); j++) {
                    Carta carta = mazo.getCarta(j);

                    switch (carta.getPalo()) {
                        case "BASTOS":
                            palo = 0;
                            break;
                        case "COPAS":
                            palo = 1;
                            break;
                        case "ESPADAS":
                            palo = 2;
                            break;
                        case "OROS":
                            palo = 3;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + carta.getPalo());
                    }
                    switch (carta.getNumero()) {
                        case "AS":
                            numero = 0;
                            break;
                        case "DOS":
                            numero = 1;
                            break;
                        case "TRES":
                            numero = 2;
                            break;
                        case "CUATRO":
                            numero = 3;
                            break;
                        case "CINCO":
                            numero = 4;
                            break;
                        case "SEIS":
                            numero = 5;
                            break;
                        case "SIETE":
                            numero = 6;
                            break;
                        case "SOTA":
                            numero = 7;
                            break;
                        case "CABALLO":
                            numero = 8;
                            break;
                        case "REY":
                            numero = 9;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + carta.getNumero());
                    }
                    if (palo == i && numero == z) {
                        mazo.extraerCarta(j);
                        mazo.insertarCarta(contador,carta);
                        contador++;
                        break;
                    }
                }
            }
        }
        return mazo;
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        // Comparador de cartas usado en el algoritmo de ordenación

        return 0;
    }
}