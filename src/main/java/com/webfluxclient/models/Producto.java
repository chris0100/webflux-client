package com.webfluxclient.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;



@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Producto {

    private String id;
    private String nombre;
    private Double precio;
    private Date createAt;
    private Categoria categoria;
    private String foto;


}
