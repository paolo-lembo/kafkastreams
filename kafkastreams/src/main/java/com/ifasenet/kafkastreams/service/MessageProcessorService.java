package com.ifasenet.kafkastreams.service;

import com.ifasenet.kafkastreams.modelJson.InputData;
import com.ifasenet.kafkastreams.modelJson.Measurement;
import com.ifasenet.kafkastreams.modelJson.OutputData;
import org.apache.kafka.streams.StreamsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MessageProcessorService {

    @Autowired
    private StreamsBuilder streamsBuilder;
    @Autowired
    private KafkaTemplate<String, OutputData> kafkaTemplate;

    @KafkaListener(topics = "input-topic")
    public void processMessage(InputData inputData) {
        OutputData outputData = new OutputData();
        outputData.setIdent_kit(inputData.getPayload().getDevEUI());

        String timestamp = inputData.getPayload().getRxInfo().get(0).getTime();
        outputData.setTimestamp(timestamp);

        List<Measurement> measurements = new ArrayList<>();
        Map<String, Measurement> inputMeasurements = inputData.getPayload().getObjectJSON();
        for (Map.Entry<String, Measurement> entry : inputMeasurements.entrySet()) {
            Measurement inputMeasurement = entry.getValue();
            Measurement outputMeasurement = new Measurement();
            outputMeasurement.setMeasure(inputMeasurement.getMeasure());
            outputMeasurement.setUM(inputMeasurement.getUM());
            outputMeasurement.setValue(inputMeasurement.getValue());
            measurements.add(outputMeasurement);
        }
        outputData.setMeasure(measurements);
        kafkaTemplate.send("output-topic", outputData);
    }
}