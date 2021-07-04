package com.brc.players.traslators;

import org.springframework.stereotype.Component;

import com.brc.players.dtos.PlayerDTO;
import com.brc.players.entities.Player;

@Component(value = "playerTranslator")
public class PlayerTranslator implements Translator<PlayerDTO, Player> {

	@Override
	public Player translate(PlayerDTO input) {

		return Player.builder().name(input.getName()).type(input.getType()).build();
	}

}
