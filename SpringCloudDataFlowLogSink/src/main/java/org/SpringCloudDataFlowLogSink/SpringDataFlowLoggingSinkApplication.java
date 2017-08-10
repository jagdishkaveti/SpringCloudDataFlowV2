package org.SpringCloudDataFlowLogSink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Hello world!
 *
 */
@EnableBinding(Sink.class)
@SpringBootApplication
public class SpringDataFlowLoggingSinkApplication {
 
    public static void main(String[] args) {
    SpringApplication.run(
          SpringDataFlowLoggingSinkApplication.class, args);
    }
    
    @StreamListener(Sink.INPUT)
    public void loggerSink(String date) {
        System.out.println("Streamed Date is "+ date);
    }
}