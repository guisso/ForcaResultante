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
 * Modelagem de força resultante com respectivas forças geradoras a patir de
 * seus pontos indicadores.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 16/02/2022
 */
public class ForcaResultante {

    /**
     * Ponto de referência para aplicação das duas forças representadas.
     */
    private Ponto referencia;

    /**
     * Extremidade a primeira força aplicada a partir do ponto de referência.
     */
    private Ponto extremidade1;

    /**
     * Extremidade a segunda força aplicada a partir do ponto de referência.
     */
    private Ponto extremidade2;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public ForcaResultante() {
    }

    public ForcaResultante(Ponto referencia, Ponto extremidade1, Ponto extremidade2) {
        this.referencia = referencia;
        this.extremidade1 = extremidade1;
        this.extremidade2 = extremidade2;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Ponto getReferencia() {
        return referencia;
    }

    public void setReferencia(Ponto referencia) {
        this.referencia = referencia;
    }

    public Ponto getExtremidade1() {
        return extremidade1;
    }

    public void setExtremidade1(Ponto extremidade1) {
        this.extremidade1 = extremidade1;
    }

    public Ponto getExtremidade2() {
        return extremidade2;
    }

    public void setExtremidade2(Ponto extremidade2) {
        this.extremidade2 = extremidade2;
    }
    //</editor-fold>

    /**
     * As diferenças entre as coordenadas X e Y das extremidades em relação ao
     * ponto de referência determinam o ponto gerador da força resultante.
     *
     * @return Ponto gerador da força resultante.
     */
    public Ponto obterPontoForcaResultante() {
        return new Ponto(
                extremidade1.getX() - referencia.getX(),
                extremidade2.getY() - referencia.getY()
        );
    }

    /**
     * Aplica o cálculo já desenvolvido para obter a distância entre o ponto de
     * referência de aplicação das forças e o ponto gerador da força resultante.
     *
     * @return Módulo da força resultante.
     */
    public Double calcularModuloForcaResultante() {
        return referencia.calcularDistancia(obterPontoForcaResultante());
    }

    /**
     * Representa cada ponto gerador da força resultante com o formato "(x, y)".
     *
     * @return Representação textual do objeto força resultante.
     */
    @Override
    public String toString() {
        return "ForcaResultante{"
                + "referencia=" + referencia
                + ", forca1=" + extremidade1
                + ", forca2=" + extremidade2
                + ", resultante=" + obterPontoForcaResultante()
                + ", módulo=" + calcularModuloForcaResultante()
                + '}';
    }
}
