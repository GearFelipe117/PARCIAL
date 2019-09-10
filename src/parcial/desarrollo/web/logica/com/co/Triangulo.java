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
public class Triangulo extends FiguraGeometrica{
    
    private float base;
    private float altura;
    private float lado;

    
   /**
    * 
    * @param base
    * @param altura
    * @param lado 
    */
    public Triangulo(float base, float altura,float lado) {
        super(lado);
        this.base = base;
        this.altura = altura;
        
    }

    @Override
    public String Nombre() {
        return "Triangulo";
    }

    @Override
    public float getArea() {
        return (base * altura) / 2;
    }

    
    public float findPerimetro() {
        return 2*lado + base;
    }
    
    


}
