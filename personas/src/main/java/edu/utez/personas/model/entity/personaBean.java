package edu.utez.personas.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table (name = "persona")
public class personaBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id_persona;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ape1", nullable = false)
    private String ape1;

    @Column(name = "ape2", nullable = false)
    private String ape2;

    @Column(name = "fechaNac", nullable = false)
    private String fechaNac;

}
