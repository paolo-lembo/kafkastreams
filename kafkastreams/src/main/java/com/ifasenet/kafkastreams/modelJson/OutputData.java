package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OutputData {
    private String ident_kit;
    private String timestamp;
    private List<Measurement> measure;
}
