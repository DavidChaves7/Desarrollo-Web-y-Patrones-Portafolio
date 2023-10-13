package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;


public interface CategoriaService { 
    
    // Se declara uin metodo para obtener un ArrayList de los objetos de Categoria  
    public List<Categoria> getCategorias(boolean activos);
    
    //Metodos del CRUD
}
