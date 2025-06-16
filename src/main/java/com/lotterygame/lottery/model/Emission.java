package com.lotterygame.lottery.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Emission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
