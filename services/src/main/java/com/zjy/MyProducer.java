package com.zjy;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * TODO
 */
public class MyProducer {
    public static final String TOPIC = "mytopic";
    public static void main(String [] args){
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        //props.put("client.id", "DemoProducer");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++)
            producer.send(new ProducerRecord<>(TOPIC, Integer.toString(i), Integer.toString(i)));

        producer.close();

    }
}
