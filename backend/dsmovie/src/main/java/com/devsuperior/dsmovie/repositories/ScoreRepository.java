package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;
<<<<<<< HEAD

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

=======
import com.devsuperior.dsmovie.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	User findByEmail(String email);
>>>>>>> 23f394f55ef3b3eb821b380d4ea5139048f5ca1a
}
