package com.brc.players.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.brc.players.enums.PlayerType;
import com.brc.players.strategies.PlayerTypeStrategy;

@Configuration
public class StrategyConfiguration {

	@Bean(name = "strategies")
	@Order(1)
	public Map<PlayerType, PlayerTypeStrategy> createStrategies(
			@Qualifier("expertStrategy") final PlayerTypeStrategy expertStrategy,
			@Qualifier("noviceStrategy") final PlayerTypeStrategy noviceStrategy,
			@Qualifier("undefinedStrategy") final PlayerTypeStrategy undefinedStrategy) {
		final Map<PlayerType, PlayerTypeStrategy> strategies = new HashMap<>();
		strategies.put(PlayerType.EXPERT, expertStrategy);
		strategies.put(PlayerType.NOVICE, noviceStrategy);
		strategies.put(PlayerType.UNDEFINED, undefinedStrategy);
		return strategies;
	}

}
