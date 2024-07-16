package com.challenge.literalura.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private Integer AnioNacimiento;
    private Integer AnioMuerte;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<>();


    public Autor(String nombre, Integer anioNacimiento, Integer anioMuerte) {
        this.nombre = nombre;
        AnioNacimiento = anioNacimiento;
        AnioMuerte = anioMuerte;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return """
                \t\t~~~Autor~~~
                
                Nombre: %s
                Año de nacimiento: %d
                Año de fallecimiento: %d
                
                \t\t\t~~~
                """.formatted(this.getNombre(), this.getAnioNacimiento(),
                this.getAnioMuerte());
    }
}
