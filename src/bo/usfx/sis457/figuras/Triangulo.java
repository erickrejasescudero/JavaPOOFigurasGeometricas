/*
 * Archivo que contiene la Clase Triangulo 
 */
package bo.usfx.sis457.figuras;

/**
* Clase Triangulo con propiedades Base, Altura y Lado
* @author lenovo
*
*/
public class Triangulo {
    private double Base1;
    private double Altura2;
    private double Lado1;
/**
     * Método constructor, crea el Triangulo con las propiedades Base y Altura
     * @param base1 Valor tipo double
     * @param altura2 Valor tipo double
     * @param lado1 Valor tipo double
     */
    
    public Triangulo(double base1, double altura2, double lado1) {
        this.Base1 = base1;
        this.Altura2 = altura2;
        this.Lado1 = lado1;
    }
 /**
     * Método constructor, crea el Triangulo con valores por defecto
     */
    public Triangulo() {
        // Llama al método constructor anterior
        this(0, 0, 0);
    }
    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBase1() {
        return Base1;
    }
    /**
     * Método que modifica el valor de la Base
     * @param base1 Valor de tipo double
     */
    public void setBase1(double base1) {
        this.Base1 = base1;
    }
    /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    
    public double getAltura2() {
        return Altura2;
    }
    /**
     * Método que modifica el valor de la Altura
     * @param altura2 Valor de tipo double
     */
    public void setAlturaTr(double altura2) {
        this.Altura2 = altura2;
    }
    /**
     * Método que retorna el area del Triangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.Base1 * this.Altura2)/2);
    }
    /**
     * Método que retorna el perimetro del Triangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2*this.Lado1 + this.Base1);
    }
}
