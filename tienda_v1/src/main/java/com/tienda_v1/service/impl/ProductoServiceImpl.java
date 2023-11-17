package com.tienda_v1.service.impl;

import com.tienda_v1.dao.ProductoDao;
import com.tienda_v1.domain.Producto;
import com.tienda_v1.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    //Metodos CRUD
    
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    //Consulta JPA para traer informacion entre precios
     @Override
     @Transactional (readOnly=true)
    public List<Producto>findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup){
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }
    
    //Consulta JPQL para traer informacion entre precios
     @Override
     @Transactional (readOnly=true)
    public List<Producto>metodoJPQL(double precioInf, double precioSup){
        return productoDao.metodoJPQL(precioInf, precioSup);
    }
    
     //Consulta Nativo para traer informacion entre precios
     @Override
     @Transactional (readOnly=true)
    public List<Producto>metodoNativo(double precioInf, double precioSup){
        return productoDao.metodoNativo(precioInf, precioSup);
    }
}
