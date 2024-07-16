package com.challenge.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.challenge.literalura.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloContainsIgnoreCase(String title);

    //query to get the books by language
    @Query("SELECT l FROM Libro l WHERE LOWER(l.idioma) = LOWER(:language) ORDER BY l.titulo ASC")
    List<Libro> findBookByLanguage(String language);
    //query to get the top 10 books by downloads
    @Query("SELECT l.titulo FROM Libro l ORDER BY l.numeroDeDescargas desc LIMIT 10")
    List<String> findTop10Books();
}
