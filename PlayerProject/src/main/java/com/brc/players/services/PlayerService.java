package com.brc.players.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.brc.players.dtos.PlayerDTO;
import com.brc.players.enums.PlayerType;
import com.brc.players.strategies.PlayerTypeStrategy;

@Service
public class PlayerService {

	@Autowired
	@Qualifier("strategies")
	private Map<PlayerType, PlayerTypeStrategy> strategies;

	public List<String> process(final List<PlayerDTO> players) {
		final List<String> outputs = new ArrayList<>();
		players.forEach(player -> {
			final PlayerType type = PlayerType.getTypeFromString(player.getType());
			final PlayerTypeStrategy strategy = strategies.get(type);
			outputs.add(strategy.processType(player));
		});
		return outputs;

	}

}
