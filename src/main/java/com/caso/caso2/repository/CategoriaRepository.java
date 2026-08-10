
package com.caso.caso2.repository;

/**
 *
 * @author allam
 */

import com.caso.caso2.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    public List<Categoria> findByActivoTrue();
    
}