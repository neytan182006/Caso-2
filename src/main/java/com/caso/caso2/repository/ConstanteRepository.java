package com.caso.caso2.repository;

import com.caso.caso2.domain.Constante;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstanteRepository extends JpaRepository<Constante,Integer> {
    
    public Optional<Constante> findByAtributo(String atributo);
    
}