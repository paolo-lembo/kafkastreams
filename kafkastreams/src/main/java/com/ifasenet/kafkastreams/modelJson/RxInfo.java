package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RxInfo {
    private String gatewayID;
    private String time;
    private double rssi;
    private double loRaSNR;
    private int channel;
    private int rfChain;
    private int board;
    private int antenna;
    private Location location;
    private String fineTimestampType;
    private String context;
    private String uplinkID;
    private String crcStatus;
}
