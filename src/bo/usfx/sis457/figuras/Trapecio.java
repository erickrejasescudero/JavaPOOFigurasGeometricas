/*
 * Archivo que contiene la Clase Trapecio 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Trapecio con propiedades Base mayor, Base menor, Altura1 y Lado
 * @author lenovo
 */
 public class Trapecio {
   private double Base1;
    private double Base2;
    private double Altura1;
    private double Lado;
    
    /**
     * Método constructor, crea el Trapecio con las propiedades Base mayor y menor y Altura
     * @param basemayor Valor tipo double
     * @param basemenor Valor tipo double
     * @param altura1 Valor tipo double
     * @param lado Valor tipo double
     */
    public Trapecio(double basemayor, double basemenor, double altura1, double lado) {
        this.Base1 = basemayor;
        this.Base2 = basemenor;
        this.Altura1 = altura1;
        this.Lado = lado;
    }
     
    /**
     * Método constructor, crea el Rombo con valores por defecto
     */
    public Trapecio() {
        // Llama al método constructor anterior
        this(0, 0, 0, 0);

        }
      /**
     * Método que retorna el valor de la BaseMayor 
     * @return Retorna el valor de la BaseMayor en tipo double
    */

    public double getBaseMayor() {
        return Base1;
    }
       /**
     * Método que retorna el valor de la BaseMenor
     * @return Retorna el valor de la BaseMayor en tipo double
     */
    public double getBaseMenor() {
        return Base2;
    }
       /**
     * Método que modifica el valor de la BaseMayor
     * @param basemayor Valor de tipo double
     */
    public void setBaseMayor(double basemayor) {
        this.Base1 = basemayor;
    }
      /**
     * Método que modifica el valor de la BaseMenor
     * @param basemenor Valor de tipo double
     */
   public void setBaseMenor(double basemenor) {
        this.Base2 = basemenor;
    }
      /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    
    public double getAltura() {
        return Altura1;
    }
      /**
     * Método que modifica el valor de la Altura
     * @param altura1 Valor de tipo double
     */
    public void setAltura1(double altura1) {
        this.Altura1 = altura1;
    }
	    /**
     * Método que retorna el valor del Lado 
     * @return Retorna el valor del Lado en tipo double
     */
    
    public double getLado() {
        return Lado;
    }
      /**
     * Método que modifica el valor del Lado
     * @param lado Valor de tipo double
     */
    public void setLado (double lado) {
        this.Lado = lado;
    }
	
      /**
     * Método que retorna el area del Trapecio
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.Altura1 * (this.Base1 + this.Base2))/2);
    }
     /**
     * Método que retorna el perimetro del Romboide
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (this.Base1 + this.Base2 + (2 * this.Lado));
    }
}