package com.example.sql_rocks;

import jakarta.persistence.*;

@Entity
@Table(name="Library_card")
public class LibraryCard {

    @Id
    private  int cardNo;

    private int fine;

    private int bookIssued;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    //mapping relation beth two entity
    @OneToOne
    @JoinColumn
    User user;  //telling that with which entity to connect
}
