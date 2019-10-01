package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Veena Kumari
 * @creation_date 26th Sep 2109 4:44pm
 * @modification_date 26th Sep 2109 4:44pm
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is a Persistent class.
 *
 *
 */
@Entity
public class Song {@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

private int songId;
private String songName;
@ManyToOne
@JoinColumn(name = "movie_id")
private Movie movie;

public Song(String songName) {
	super();
	this.songName = songName;
}

public Movie getMovie() {
	return movie;
}

public void setMovie(Movie movie) {
	this.movie = movie;
}

public Song() {
	// TODO Auto-generated constructor stub
}

public Song(int songId, String songName) {
	super();
	this.songId = songId;
	this.songName = songName;
}
public int getSongId() {
	return songId;
}
public void setSongId(int songId) {
	this.songId = songId;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
@Override
public String toString() {
	return "Song [songId=" + songId + ", songName=" + songName + "]";
}
}
