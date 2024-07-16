package com.challenge.literalura.Entity;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne
    private Autor autor;
    private String idioma;
    private Double numeroDeDescargas;



    public Libro(String titulo, Autor autor, String idioma, double numeroDeDescargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.numeroDeDescargas = numeroDeDescargas;
    }

    

    @Override
    public String toString() {
        return """
                \t\t~~~Libro~~~
                
                Titulo: %s
                Idioma: %s
                Autor: %s
                Descargas: %s
                
                \t\t\t~~~
                """.formatted(this.getTitulo(), this.getIdioma(),
                this.getAutor().getNombre(), this.getNumeroDeDescargas());
    }


}
