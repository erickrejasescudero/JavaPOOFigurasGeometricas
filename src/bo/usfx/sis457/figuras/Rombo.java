/*
 * Archivo que contiene la Clase Rombo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Rombo con propiedades diagonal mayor, diagonal menor y longitud
 * @author lenovo
 * 
 */
public class Rombo {
    private double DiagonalMayor;
    private double DiagonalMenor;
	private double Longitud;

    /**
     * Método constructor, crea el Rombo con las propiedades DiagonalMayor y DiagonalMenor
     * @param diagonalmayor Valor tipo double
     * @param diagonalmenor Valor tipo double
	 * @param longitud Valor tipo double
     */
    public Rombo(double diagonalmayor, double diagonalmenor, double longitud) {
        this.DiagonalMayor = diagonalmayor;
        this.DiagonalMenor = diagonalmenor;
		this.DiagonalMenor = longitud;
    }
    
    /**
     * Método constructor, crea el Rombo con valores por defecto
     */
    public Rombo() {
        // Llama al método constructor anterior
        this(0, 0, 0);
    }

    /**
     * Método que retorna el valor de la DiagonalMayor 
     * @return Retorna el valor de la DiagonalMayor en tipo double
     */
    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    /**
     * Método que modifica el valor de la DiagonalMayor
     * @param diagonalmayor Valor de tipo double
     */
    public void setDiagonalMayor(double diagonalmayor) {
        this.DiagonalMayor = diagonalmayor;
    }

    /**
     * Método que retorna el valor de la DiagonalMenor 
     * @return Retorna el valor de la DiagonalMenor en tipo double
     */
    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    /**
     * Método que modifica el valor de la DiagonalMenor
     * @param diagonalmenor Valor de tipo double
     */
    public void setDiagonalMenor(double diagonalmenor) {
        this.DiagonalMenor = diagonalmenor;
    }
    /**
     * Método que retorna el valor de la Longitud 
     * @return Retorna el valor de la Longitud en tipo double
     */
    public double getLongitud() {
        return Longitud; 
    }

    /**
     * Método que modifica el valor de la Longitud
     * @param longitud Valor de tipo double
     */
    public void setLongitud(double longitud) {
        this.Longitud = longitud;
    }
    /**
     * Método que retorna el area del Rombo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.DiagonalMayor * this.DiagonalMayor) /2);
    }
    
    /**
     * Método que retorna el perimetro del Rombo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (4 * this.Longitud);
    }
}


   
    
   
        

