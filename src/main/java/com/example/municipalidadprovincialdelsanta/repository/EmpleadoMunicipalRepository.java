// EmpleadoMunicipalRepository.java
package com.example.municipalidadprovincialdelsanta.repository;
import com.example.municipalidadprovincialdelsanta.model.EmpleadoMunicipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoMunicipalRepository extends JpaRepository<EmpleadoMunicipal, Long> {}