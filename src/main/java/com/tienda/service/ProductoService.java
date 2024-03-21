package com.tienda.service;

import com.tienda.domain.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> getProductos(boolean activos);

    Producto getProducto(Producto producto);

    void save(Producto producto);

    void delete(Producto producto);

    List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
}
