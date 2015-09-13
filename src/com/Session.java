package com;

import java.util.List;

public class Session 
{
	
	private int type; //0 for morning and 1 for evening
	private int maxDuration;
	private int leftDuration;
	private List<Talk> talks;
	
	public void AddTalks(Talk talk)
	{
		this.talks.add(talk);
	}
	//default constructor
	public Session()
	{}
	//constructor with session type initializer
	public Session(int type)
	{
		this.type = type;	
		if(type==0)
			this.setMaxDuration(180);
		else
			this.setMaxDuration(240);
	}
	
	public int getType() {
		return type;
	}
	
	public int getLeftDuration()
	{
		return leftDuration;
	}

	public int getMaxDuration() 
	{
		return maxDuration;
	}

	private void setMaxDuration(int maxDuration) 
	{
		this.maxDuration = maxDuration;
		this.leftDuration= maxDuration;
	}
	
	public List<Talk> getTalks() 
	{
		return talks;
	}

	public void AddDuration(int minutes)
	{
		this.leftDuration-=minutes;
	}

	
}
