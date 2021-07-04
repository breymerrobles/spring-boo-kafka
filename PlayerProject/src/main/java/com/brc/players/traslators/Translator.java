package com.brc.players.traslators;

public interface Translator<I, O> {
	O translate(I input);

}
