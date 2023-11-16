package com.tienda_v1.service;

import com.tienda_v1.domain.Producto;
import java.util.List;


public interface ProductoService { 
    
    // Se declara uin metodo para obtener un ArrayList de los objetos de Producto  
    public List<Producto> getProductos(boolean activos);
    
    //Metodos del CRUD
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
