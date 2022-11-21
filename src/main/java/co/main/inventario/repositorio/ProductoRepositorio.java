/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.main.inventario.repositorio;

import co.main.inventario.modelo.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface ProductoRepositorio extends JpaRepository<Producto,Long> {
    
    public List<Producto> findAllByCodigo(String codigo);

    public List<Producto> findAllByDescripcionContaining(String descripcion);
    
}
