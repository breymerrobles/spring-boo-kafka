package com.brc.players.strategies;

import com.brc.players.dtos.PlayerDTO;

public interface PlayerTypeStrategy {

	String processType(final PlayerDTO player);

	default String formatMessage(final String message, final PlayerDTO player) {
		return String.format(message, player.getName());

	}

}
