package com.tienda_v1.service.impl;

import com.tienda_v1.dao.CategoriaDao;
import com.tienda_v1.domain.Categoria;
import com.tienda_v1.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired //Se va a unificar un unico objeto mientra se ejecuta la app
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activos) {
         var lista = categoriaDao.findAll();
         
         if(activos){
             lista.removeIf(e -> !e.isActivo());
         }
         
         return lista;
    }
    
}
