package com.salesianos.pro2.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor
public class Persona {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
}
