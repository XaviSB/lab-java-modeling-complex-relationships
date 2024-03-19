package com.example.labjavamodeling.Model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne
    private Association association;

    @OneToOne
    private Member president;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> members;

    public Chapter(Long id, String name, String district, Association association, Member president, List<Member> members) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.association = association;
        this.president = president;
        this.members = members;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
