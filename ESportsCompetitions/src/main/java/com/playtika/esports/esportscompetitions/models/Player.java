package com.playtika.esports.esportscompetitions.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.playtika.esports.esportscompetitions.models.enums.LevelType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JsonIgnore
    private User user;

    private volatile boolean isPlaying;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LevelType level;

    @Column(name = "last_time_played")
    private ZonedDateTime lastTimePlayed;

    @Transient
    private Map<Long, Integer> ranks;

}
