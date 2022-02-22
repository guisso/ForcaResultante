/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.fundamentospooponto;

/**
 * Programa para execução dos testes com as classes desenvolvidas.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 16/02/2022
 */
public class Program {

    public static void main(String[] args) {

        //
        // Teste de pontos
        //
        Ponto p1 = new Ponto();
        System.out.println(">> " + p1.getX() + ", " + p1.getY());
        System.out.println(p1);

        Ponto p2 = new Ponto(1.0, 1.0);
        Ponto p3 = new Ponto(5.0, 4.0);

        System.out.println(">> " + p2.getX() + ", " + p2.getY());
        System.out.println(p2);
        System.out.println(">> " + p3.getX() + ", " + p3.getY());
        System.out.println(p3);

        p2.setX(0.0);
        p2.setY(1.0);
        System.out.println(p2);

        double distancia = p3.calcularDistancia(p2);
        System.out.println("> " + Ponto.calcularDistancia(p2, p3));
        System.out.println("> " + distancia);

        //
        // Teste de força resultante
        //
        Ponto pRef = new Ponto(0d, 0d);
        Ponto pF1 = new Ponto(3d, 0d);
        Ponto pF2 = new Ponto(0d, 4d);

        System.out.println("> " + pRef.calcularDistancia(pF1)); // 3
        System.out.println("> " + pRef.calcularDistancia(pF2)); // 4
        System.out.println("> " + pF1.calcularDistancia(pF2));  // 5
        System.out.println("> " + pF2.calcularDistancia(pF1));  // 5
        System.out.println("> " + Ponto.calcularDistancia(pF1, pF2)); // 5
        System.out.println("> " + Ponto.calcularDistancia(
                pRef, new Ponto())); // 0
        System.out.println("> " + Ponto.calcularDistancia(
                new Ponto(1d, 1d), new Ponto())); // 1.414

        ForcaResultante fResult = new ForcaResultante(pRef, pF1, pF2);
        System.out.println(fResult);
        System.out.println("> Ponto Result="
                + fResult.obterPontoForcaResultante());
        System.out.println("> Módulo Força="
                + fResult.calcularModuloForcaResultante());
    }
}
