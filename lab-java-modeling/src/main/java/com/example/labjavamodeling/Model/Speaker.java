package com.example.labjavamodeling.Model;

import jakarta.persistence.*;

import java.time.Duration;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Duration presentationDuration;

    public Speaker(Long id, String name, Duration presentationDuration) {
        this.id = id;
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Duration presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
