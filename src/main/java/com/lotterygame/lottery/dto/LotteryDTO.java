package com.lotterygame.lottery.dto;

import lombok.Data;

@Data
public class LotteryDTO {

    private String numberAndSerial;

    private String number;

    private String serial;

    private String emission_id;

    private int pieces;

    private int price;

    private String raffle_id;

    private String prize;

    private String user_id;
}
