package com.lotterygame.lottery.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lottery")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lottery {

    @Id
    private String numberAndSerial;

    @Column(unique = true)
    private String number;

    @Column(unique = true)
    private String serial;

    @Column(unique = true)
    private Emission emission;

    private int pieces;

    private int price;

    @JoinColumn(name = "raffle_id")
    private Raffle raffle;

    private String prize;

    @JoinColumn(name = "user_id")
    private User user;
}
