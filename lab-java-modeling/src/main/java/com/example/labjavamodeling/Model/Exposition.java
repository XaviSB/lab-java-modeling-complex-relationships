package com.example.labjavamodeling.Model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Exposition")
public class Exposition extends Event {
    public Exposition(Long id, Date date, Duration duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }
    // Specific properties for Exposition
}
