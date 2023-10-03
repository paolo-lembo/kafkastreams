package com.ifasenet.kafkastreams.modelJson;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Payload {

    private String applicationID;
    private String applicationName;
    private String deviceName;
    private String devEUI;
    private List<RxInfo> rxInfo;
    private TxInfo txInfo;
    private boolean adr;
    private int dr;
    private int fCnt;
    private int fPort;
    private String data;
    private Map<String, Measurement> objectJSON;
    private Map<String, Object> tags;
    private boolean confirmedUplink;
    private String devAddr;

}
