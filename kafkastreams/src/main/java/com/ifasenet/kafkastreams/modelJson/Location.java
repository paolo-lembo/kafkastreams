package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private double latitude;
    private double longitude;
    private double altitude;
    private String source;
    private int accuracy;
}
