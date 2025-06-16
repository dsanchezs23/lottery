package com.lotterygame.lottery.dto;

import com.lotterygame.lottery.model.Lottery;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Map;

@Data
public class RaffleDTO {
    private Long id;

    private Timestamp date;

    private String winner;

    private String second;

    private String third;

    private Map<String, String> lotteries;
}
