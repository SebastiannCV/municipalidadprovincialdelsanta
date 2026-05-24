// HistorialTramiteRepository.java
package com.example.municipalidadprovincialdelsanta.repository;
import com.example.municipalidadprovincialdelsanta.model.HistorialTramite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialTramiteRepository extends JpaRepository<HistorialTramite, Long> {}