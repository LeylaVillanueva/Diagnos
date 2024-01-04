package edu.utez.personas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class personaDto {
    private Integer id_persona;
    private String name;
    private String ape1;
    private String ape2;
    private String fechaNac;

}
