package com.example.labjavamodeling.Model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.Date;
import java.util.List;


@Entity
    @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    @DiscriminatorColumn(name = "eventType")
    public abstract class Event {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Date date;
        private Duration duration;
        private String location;
        private String title;

        @ManyToMany
        private List<Guest> guests;

        public Event(Long id, Date date, Duration duration, String location, String title, List<Guest> guests) {
            this.id = id;
            this.date = date;
            this.duration = duration;
            this.location = location;
            this.title = title;
            this.guests = guests;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Guest> getGuests() {
            return guests;
        }

        public void setGuests(List<Guest> guests) {
            this.guests = guests;
        }
    }



