/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.desarrollo.web.logica.com.co;

/**
 *
 * @author s105e10
 */
public class Rectangulo extends FiguraGeometrica{
    
    private float base;
    private float lado;
 
    /** 
     * 
     * @param base
     * @param lado
     * @param area
     * @param perimetro 
     */
    public Rectangulo(float base, float lado) {
        super(lado);
        this.base = base;
        this.lado = lado;
        
    }
    
  


    @Override
    public String Nombre() {
        return "Rectangulo";
    }

    @Override
    public float getArea() {
        return base*lado;
    }
    
  

    
    public float findPerimetro() {
        return 2*base + 2 *lado;
    }
    
    
    
    
    
    
    
}
