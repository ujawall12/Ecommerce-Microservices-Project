package com.ecommerce.notificationservice.service;

import com.ecommerce.notificationservice.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationHandler {

    @KafkaListener(topics = "notificationTopic")
    public void handleNotifivation(OrderPlacedEvent orderPlacedEvent){
        log.info("Received Notification for Order - {}", orderPlacedEvent.getOrderNumber());
    }
}
