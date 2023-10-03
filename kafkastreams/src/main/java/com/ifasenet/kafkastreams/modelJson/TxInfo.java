package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TxInfo {
    private long frequency;
    private String modulation;
    private LoRaModulationInfo loRaModulationInfo;
}
