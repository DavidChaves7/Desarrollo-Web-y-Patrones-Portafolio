package com.tienda_v1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")

//Serialización funciona par aalmacenar ciertos datos en la RAM
public class Producto implements Serializable{
   
    private static final long serialVersionUID = 1L; //Para poder hacer el ciclo de la sumatoria del IdCategoria
    
    @Id // Es la PK de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Los valores generados que tipo de estrategia utilizan BD == Clase
    @Column(name = "id_producto")//Idemtifica la columna para encontrar la tabla
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    private String detalle;
    private double precio;
    private int existencias;
    //private long idCategoria;
    
   @ManyToOne
   @JoinColumn(name="id_categoria")
   Categoria categoria;
    
    public Producto() {
    }

    public Producto(long idProducto, String descripcion, String rutaImagen, boolean activo) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }



    


    
    
}
