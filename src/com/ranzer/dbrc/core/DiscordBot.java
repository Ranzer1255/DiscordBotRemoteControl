package com.ranzer.dbrc.core;

public class DiscordBot {
	
	private String name;
	private String version;
	private String imageURL;
	private int guilds, users, bots, upTime;
	private String game;
	
	
	public String getName() {
		return name;
	}
	public String getVersion() {
		return version;
	}
	public String getImageURL() {
		return imageURL;
	}
	public int getGuilds() {
		return guilds;
	}
	public int getUsers() {
		return users;
	}
	public int getBots() {
		return bots;
	}
	public int getUpTime() {
		return upTime;
	}
	public String getGame() {
		return game;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public void setGuilds(int guilds) {
		this.guilds = guilds;
	}
	public void setUsers(int users) {
		this.users = users;
	}
	public void setBots(int bots) {
		this.bots = bots;
	}
	public void setUpTime(int upTime) {
		this.upTime = upTime;
	}
	public void setGame(String game) {
		this.game = game;
	}
	

}
