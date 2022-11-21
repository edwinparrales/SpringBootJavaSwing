/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.main.inventario.utilidades;

import co.main.inventario.AppConfiguracion;
import co.main.inventario.modelo.Producto;
import co.main.inventario.repositorio.ProductoRepositorio;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author usuario
 */

public class MainApp {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfiguracion.class);

        ProductoRepositorio productoRepositorio = contexto.getBean(ProductoRepositorio.class);
         
        Producto pro = new Producto("COD-002", "MEMORIA DDR4-2666MHZ X 4GB PC12800",140000, 6);
        
        productoRepositorio.save(pro);
        productoRepositorio.findAll().forEach(pr-> System.out.println(pr.toString()));

    }

}
