package com.brc.players.enums;

import java.util.Arrays;

public enum PlayerType {
	EXPERT, NOVICE, UNDEFINED;

	public static PlayerType getTypeFromString(final String type) {
		return Arrays.stream(values()).filter(ut -> ut.name().equalsIgnoreCase(type)).findAny().orElse(UNDEFINED);
	}

}
