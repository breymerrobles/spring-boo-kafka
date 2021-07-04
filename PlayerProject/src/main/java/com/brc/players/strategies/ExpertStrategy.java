package com.brc.players.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.brc.players.dtos.PlayerDTO;
import com.brc.players.entities.Player;
import com.brc.players.repositories.PlayerRepository;
import com.brc.players.traslators.Translator;

@Component(value = "expertStrategy")
public class ExpertStrategy implements PlayerTypeStrategy {

	private static final String MESSAGE = "player %s stored in DB";

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	@Qualifier("playerTranslator")
	private Translator<PlayerDTO, Player> translator;

	@Override
	public String processType(PlayerDTO player) {

		playerRepository.save(translator.translate(player));
		return this.formatMessage(MESSAGE, player);
	}

}
