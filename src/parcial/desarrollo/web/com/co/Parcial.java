/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.desarrollo.web.com.co;

import parcial.desarrollo.web.logica.com.co.FiguraGeometrica;
import parcial.desarrollo.web.logica.com.co.Rectangulo;
import parcial.desarrollo.web.logica.com.co.Cuadrado;
import parcial.desarrollo.web.logica.com.co.Triangulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FELIPE ZAPATA
 * @version 1.0
 * @fecha 10 septiembre 2019
 */
public class Parcial {

    /**
     * @param args 
     * @
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        List<FiguraGeometrica> array = new ArrayList();
        
        
        array.add(new Cuadrado(2));
        array.add(new Triangulo(5,4,3));
        array.add(new Rectangulo(5,6));
        
        
      
        System.out.println("EN JSON SERIA ASI");
        
         for (int i = 0; i < array.size(); i++) {

            FiguraGeometrica figura = array.get(i);

           
             System.out.println("{ FiguraGeometrica:{ ´Nombre´: " + "´"+figura.Nombre()+"´" + ",´Perimetro´:" + figura.findPerimetro()+ ",´Area´:" + figura.getArea()+"}}");

        
         }
         
        System.out.println("ESO ES EN XML");

        for (int i = 0; i < array.size(); i++) {

            FiguraGeometrica figura = array.get(i);

            System.out.println("<FiguraGeometrica> <Nombre>"+figura.Nombre()+"</Nombre> <Area>"+figura.getArea()+"</Area> <Perimetro>"+figura.findPerimetro()+"</Perimetro> "+"</Perimetro></FiguraGeometrica>" );

        }

    }
    
}
