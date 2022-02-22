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
 * Modelagem de ponto para representação de extremidades de forças aplicadas
 * segundo o plano cartesiano bidimensional.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 16/02/2022
 */
public class Ponto {

    /**
     * Coordenada do ponto no eixo x.
     */
    private Double x;

    /**
     * Coordenada do ponto no eixo y.
     */
    private Double y;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Ponto() {
        x = 0.0;
        y = 0.0;
    }

    public Ponto(Double x, Double y) {
        setX(x); // this.x = x;
        setY(y); // this.y = y;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    //</editor-fold>

    /**
     * Aplica teorema de Pitágoras para cálculo de distância entre o ponto atual
     * e um ponto de referência.
     *
     * @param p Ponto sobre o qual se calcula a distância referente ao ponto
     * atual.
     * @return Distância entre o ponto atual e o ponto de referência.
     */
    public Double calcularDistancia(Ponto p) {
        return Math.sqrt(
                Math.pow(this.x - p.getX(), 2)
                + Math.pow(this.y - p.getY(), 2)
        );
    }

    /**
     * Calcular a distância entre dois pontos reaproveitando o cálculo já
     * estabelecido para um objeto do tipo Ponto.
     *
     * @param p1 Ponto de referência 1.
     * @param p2 Ponto de referência 2.
     * @return Distância entre os pontos submetidos.
     */
    public static Double calcularDistancia(Ponto p1, Ponto p2) {
        return p1.calcularDistancia(p2);
    }

    /**
     * Representa ponto com o formato "(x, y)".
     *
     * @return Representação textual do objeto Ponto.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
