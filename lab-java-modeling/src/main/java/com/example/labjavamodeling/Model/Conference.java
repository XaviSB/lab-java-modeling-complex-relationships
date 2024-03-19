package com.example.labjavamodeling.Model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Conference")
public class Conference extends Event {
    @OneToMany
    private List<Speaker> speakers;



    public Conference(Long id, Date date, Duration duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
