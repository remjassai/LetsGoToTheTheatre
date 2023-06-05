package com.example.LetsGoToTheTheatreSpring.repositories;

import com.example.LetsGoToTheTheatreSpring.entities.LiveShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveShowRepository extends JpaRepository<LiveShow,Long> {
}
