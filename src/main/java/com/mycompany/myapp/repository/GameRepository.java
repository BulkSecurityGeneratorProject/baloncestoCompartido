package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Game entity.
 */
@SuppressWarnings("unused")
public interface GameRepository extends JpaRepository<Game,Long> {

}
