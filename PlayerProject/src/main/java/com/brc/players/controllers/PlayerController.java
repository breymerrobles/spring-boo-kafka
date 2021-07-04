package com.brc.players.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brc.players.dtos.PlayerDTO;
import com.brc.players.services.PlayerService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/api/v1/player")
@Log4j2
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@PostMapping(value = "/")
	public ResponseEntity<List<String>> processPlayer(@RequestBody(required = true) List<PlayerDTO> players) {

		log.info("Process players list");
		final List<String> response = playerService.process(players);
		return ResponseEntity.ok(response);
	}

}
