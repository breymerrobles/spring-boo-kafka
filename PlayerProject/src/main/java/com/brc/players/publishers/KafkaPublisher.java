package com.brc.players.publishers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.brc.players.constants.KafkaConstants;
import com.brc.players.dtos.PlayerDTO;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaPublisher {

	@Autowired
	private KafkaTemplate<String, PlayerDTO> kafkaTemplate;

	public void sendMessage(final PlayerDTO message) {
		log.info("Kafka Message sent  -> {}", message);
		this.kafkaTemplate.send(KafkaConstants.TOPIC_NAME, message);
	}
}
