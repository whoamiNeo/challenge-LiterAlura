package com.challenge.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.challenge.literalura.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    //query to get the authors that are alive in a given year
    @Query("SELECT a FROM Autor a WHERE a.AnioMuerte >= :anio AND a.AnioNacimiento <= :anio")
    List<Autor> getAliveAuthors(Integer anio);

    //query to get the authors by name
    @Query("SELECT a FROM Autor a WHERE a.nombre ILIKE %:apellido%")
    List<Autor> findAutorByName(String apellido);
}
