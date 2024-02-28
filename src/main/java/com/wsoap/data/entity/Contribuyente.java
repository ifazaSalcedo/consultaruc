package com.wsoap.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ruc")
public class Contribuyente implements Serializable {
    @Id
    @Column(name = "ruc")
    private String rucId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dv")
    private String dv;
    @Column(name = "rucant")
    private String rucAnterior;
    @Column(name = "estadoruc")
    private String rucEstado;
}
