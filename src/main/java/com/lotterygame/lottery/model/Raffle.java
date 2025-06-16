package com.lotterygame.lottery.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Map;

@Entity
@Table(name = "raffle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Raffle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date;

    @JoinColumn(name = "winner")
    private Lottery winner;

    @JoinColumn(name = "second")
    private Lottery second;

    @JoinColumn(name = "third")
    private Lottery third;

    @OneToMany
    @JoinColumn(name = "lotteries")
    private Map<String, String> lotteries;
}