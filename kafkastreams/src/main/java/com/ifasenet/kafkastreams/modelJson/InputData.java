package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InputData {
    private String type;
    private Payload payload;
}
