package com.example.LetsGoToTheTheatreSpring.repositories;

import com.example.LetsGoToTheTheatreSpring.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Long> {
}
