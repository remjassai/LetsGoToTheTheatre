package com.example.LetsGoToTheTheatreSpring.repositories;

import com.example.LetsGoToTheTheatreSpring.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {
}
