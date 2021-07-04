package com.brc.players.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brc.players.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, String>{

}
