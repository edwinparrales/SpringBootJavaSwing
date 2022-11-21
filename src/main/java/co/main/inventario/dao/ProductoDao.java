/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.main.inventario.dao;

import co.main.inventario.AppConfiguracion;
import co.main.inventario.modelo.Producto;
import co.main.inventario.repositorio.ProductoRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author usuario
 */
public class ProductoDao {

    private AnnotationConfigApplicationContext contexto;

    private ProductoRepositorio productoRepositorio;

    public ProductoDao() {

        this.contexto = new AnnotationConfigApplicationContext(AppConfiguracion.class);
        this.productoRepositorio = contexto.getBean(ProductoRepositorio.class);
    }

    public List<Producto> listarProducto() {

        List<Producto> productos = new ArrayList<>();
        try {
            productos = this.productoRepositorio.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return productos;
    }

    public Producto registrarProducto(Producto producto) {
        Producto productoNuevo = null;
        try {
            productoNuevo = this.productoRepositorio.saveAndFlush(producto);

        } catch (Exception e) {

            System.out.println("eRROR: " + e.getMessage());
        }
        return productoNuevo;
    }

    public boolean eliminar(Long id) {
        try {
            this.productoRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;

        }

    }
    
    public List<Producto> buscarByCodigo(String codigo){
       List<Producto>lista = productoRepositorio.findAllByCodigo(codigo);
        return lista;
    }
    
      public List<Producto> buscarByNombre(String descripcion){
       List<Producto>lista = productoRepositorio.findAllByDescripcionContaining(descripcion);
        return lista;
    }

}
