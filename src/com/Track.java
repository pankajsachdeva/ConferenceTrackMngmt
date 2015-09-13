package com;


public class Track 
{
	
	private int trackNumber;
	private Session morningSession;
	private Session eveningSession;
	
	public Track(int id) {
		this.trackNumber=id;
	}
	public Track()
	{}
	
	public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	/**
	 * @return the morningSession
	 */
	public Session getMorningSession() {
		return morningSession;
	}
	/**
	 * @param morningSession the morningSession to set
	 */
	public void setMorningSession(Session morningSession) {
		this.morningSession = morningSession;
	}
	/**
	 * @return the eveningSession
	 */
	public Session getEveningSession() {
		return eveningSession;
	}
	/**
	 * @param eveningSession the eveningSession to set
	 */
	public void setEveningSession(Session eveningSession) {
		this.eveningSession = eveningSession;
	}
	
	
	
}
