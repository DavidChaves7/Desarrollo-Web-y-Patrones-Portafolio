package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;


public interface CategoriaService { 
    
    // Se declara uin metodo para obtener un ArrayList de los objetos de Categoria  
    public List<Categoria> getCategorias(boolean activos);
    
    //Metodos del CRUD
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
