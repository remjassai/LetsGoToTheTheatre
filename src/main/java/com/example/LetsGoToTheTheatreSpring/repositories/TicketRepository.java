package com.example.LetsGoToTheTheatreSpring.repositories;

import com.example.LetsGoToTheTheatreSpring.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
