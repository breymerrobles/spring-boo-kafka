package com.brc.players.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player implements Serializable {

	private static final long serialVersionUID = 6639021312689734060L;
	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "player_type")
	private String type;

}
