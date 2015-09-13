package com;

public class Talk implements Comparable<Talk>
{
	private int startTime;
	private int duration;
	private String name;
	private boolean isEvening;
	
	//setters and getters
	public int getStartTime()
	{
		return this.startTime;
	}
	public void setStartTime(int startTime)
	{
		this.startTime=startTime;
	}
	public int getDuration()
	{
		return this.duration;
	}
	public void setDuration(int duration)
	{
		this.startTime=duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsEvening() {
		return isEvening;
	}
	public void setIsEvening(boolean isEvening) {
		this.isEvening = isEvening;
	}
	
	//comparable methods override
	public int compareTo(Talk talk) {
		int compareDuration=talk.getDuration();
		return compareDuration-this.getDuration();
	}
	
	
	
}
