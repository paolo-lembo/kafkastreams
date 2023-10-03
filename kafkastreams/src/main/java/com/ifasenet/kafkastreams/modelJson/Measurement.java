package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Measurement {
    private String measure;
    private String UM;
    private Object value;
}
