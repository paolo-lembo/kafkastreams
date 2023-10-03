package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoRaModulationInfo {
    private int bandwidth;
    private int spreadingFactor;
    private String codeRate;
    private boolean polarizationInversion;
}
