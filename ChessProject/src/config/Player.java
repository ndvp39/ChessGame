package config;

import java.io.Serializable;

public class Player implements Serializable{//
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String playerId;
	private int status; // 0 - in lobby, 1 - ready, 2 - in game
	
	public Player(String playerId) {
		this.playerId = playerId;
		status = 0;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String toString() {
		return "id: " + playerId + "status: " + status;
		
	}

}
