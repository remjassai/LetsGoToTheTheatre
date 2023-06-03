package com.example.LetsGoToTheTheatreSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate dateOfProduction;
    @ManyToOne
    private User user;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private LiveShow show;
}
