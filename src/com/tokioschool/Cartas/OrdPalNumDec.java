package com.tokioschool.Cartas;

public class OrdPalNumDec extends AlgoritmoOrdenacion {
    @Override
    public Mazo ordena(Mazo mazo) {
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
                            numero = 9;
                            break;
                        case "DOS":
                            numero = 8;
                            break;
                        case "TRES":
                            numero = 7;
                            break;
                        case "CUATRO":
                            numero = 6;
                            break;
                        case "CINCO":
                            numero = 5;
                            break;
                        case "SEIS":
                            numero = 4;
                            break;
                        case "SIETE":
                            numero = 3;
                            break;
                        case "SOTA":
                            numero = 2;
                            break;
                        case "CABALLO":
                            numero = 1;
                            break;
                        case "REY":
                            numero = 0;
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