/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.desarrollo.web.logica.com.co;

/**
 *
 * @author FELIPE
 */
public class Cuadrado extends FiguraGeometrica{
    
    private float lado;

    /**
     * 
     * @param lado
     * @param perimetro 
     */
    
    public Cuadrado(float lado) {
        super(lado);
        this.lado = lado;
        
    }
   

   
    
      @Override
    public String Nombre() {
        return "Cuadrado";
    }

    @Override
    public float getArea() {
        return lado*lado;
    }

  

    
    public float findPerimetro() {
        return 4*lado;
    }
    
    
    
    

    
    
    
    
    
}
