// TramiteRepository.java
package com.example.municipalidadprovincialdelsanta.repository;
import com.example.municipalidadprovincialdelsanta.model.Tramite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TramiteRepository extends JpaRepository<Tramite, Long> {}