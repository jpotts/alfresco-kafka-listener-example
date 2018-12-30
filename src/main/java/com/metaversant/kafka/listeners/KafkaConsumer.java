package com.metaversant.kafka.listeners;

import com.metaversant.kafka.model.NodeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger logger = LogManager.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="alfresco-node-events", group = "group_json", containerFactory = "nodeEventKafkaListenerFactory")
    public void consumeJson(NodeEvent nodeEvent) {
        try {
            logger.debug("Inside consumeJson");

            if (nodeEvent.getContentType().equals("F:cm:systemfolder") ||
                    nodeEvent.getContentType().equals("F:bpm:package") ||
                    nodeEvent.getContentType().equals("I:act:actionparameter") ||
                    nodeEvent.getContentType().equals("I:act:action") ||
                    nodeEvent.getContentType().equals("D:cm:thumbnail")) {
                return;
            }

            logger.debug("Event: " + nodeEvent.getEventType() + " on " + nodeEvent.getNodeRef());

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
