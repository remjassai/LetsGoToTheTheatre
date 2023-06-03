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
public class LiveShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private int durationInMinutes;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String genre;
    @ManyToOne
    private Hall hall;
}
