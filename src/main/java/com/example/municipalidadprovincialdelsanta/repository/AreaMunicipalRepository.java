// AreaMunicipalRepository.java
package com.example.municipalidadprovincialdelsanta.repository;
import com.example.municipalidadprovincialdelsanta.model.AreaMunicipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaMunicipalRepository extends JpaRepository<AreaMunicipal, Long> {}