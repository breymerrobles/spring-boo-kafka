package com.brc.players.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.brc.players.dtos.PlayerDTO;
import com.brc.players.entities.Player;
import com.brc.players.publishers.KafkaPublisher;
import com.brc.players.repositories.PlayerRepository;
import com.brc.players.traslators.Translator;

@Component(value = "noviceStrategy")
public class NoviceStrategy implements PlayerTypeStrategy {

	private static final String MESSAGE = "player %s sent to Kafka topic";

	@Autowired
	private KafkaPublisher publisher;

	@Override
	public String processType(PlayerDTO player) {

		publisher.sendMessage(player);
		return this.formatMessage(MESSAGE, player);
	}

}
