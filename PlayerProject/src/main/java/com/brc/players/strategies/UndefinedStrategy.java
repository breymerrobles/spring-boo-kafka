package com.brc.players.strategies;

import org.springframework.stereotype.Component;

import com.brc.players.dtos.PlayerDTO;

@Component(value = "undefinedStrategy")
public class UndefinedStrategy implements PlayerTypeStrategy {

	private static final String MESSAGE = "player %s did not fit";

	@Override
	public String processType(PlayerDTO player) {

		return this.formatMessage(MESSAGE, player);
	}

}
