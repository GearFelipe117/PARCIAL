/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.desarrollo.web.logica.com.co;

/**
 *
 * @author FELIPE ZAPATA
 */
public class FiguraGeometrica {
    
    
    private float area;
    private float perimetro; 
    private String Nombre;
    private float lado;

    /**
     * 
     * @param lado 
     */
    public FiguraGeometrica(float lado) {
        
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "area=" + area + ", perimetro=" + perimetro + ", Nombre=" + Nombre + ", lado=" + lado + '}';
    }

   
    public String Nombre(){
    
        return Nombre;
    
    
    }
    
    
    
    public float findPerimetro() {
        return 1;
    }
    
    
}
