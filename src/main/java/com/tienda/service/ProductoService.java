/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Producto;

import java.util.List;

/**
 *
 * @author zloai
 */
public interface ProductoService {

    // Obtener un listado de productos, con la opción de filtrar por activos
    List<Producto> getProducto(boolean activos);

    // Obtener una categoría por su ID
    Producto geProductosById(Long id);

    // Guardar una nueva productos o actualizar una existente
    void save(Producto Producto);

    // Eliminar una productos por su ID
    void deleteById(Long id);
}
