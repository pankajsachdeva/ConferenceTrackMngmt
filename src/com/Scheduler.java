package com;


import java.io.*;
import java.util.*;

public class Scheduler 
{
	ArrayList<Talk> listOfAllTalks;
	ArrayList<Track> listOfTracks;
	
	//This method will read the talks list from a text file
	//and return an ArrayList of all the Talks object.
	ArrayList<Talk> InputTalksInitializer(String path)
	{
		ArrayList<Talk> listOfTalks=new ArrayList<Talk>();
		String inputLine=new String();
		String inputLineStringArr[]=new String[2];
		String inputLineNum[]=new String[1];
		String name=new String();
		int i=0;
		int duration=0;
		Talk newTalk=new Talk();
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(path));
			while(br.ready())
			{
				name="";
				inputLine=br.readLine();
				inputLineStringArr=inputLine.split(" ");
				i=0;
				while(i<inputLineStringArr.length-1)
				{
					name=name.concat(inputLineStringArr[i]+" ");
					i++;
				}
				newTalk.setName(name);
				//setting duration
				inputLineNum=inputLineStringArr[i].split("[a-zA-Z]");
				if(inputLineNum.length==0)
					duration=5;
				else
				{
					inputLineNum[0]=inputLineNum[0].trim();
					duration=Integer.parseInt(inputLineNum[0]);
				}
				newTalk.setDuration(duration);
				listOfTalks.add(newTalk);
			}
			br.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return listOfTalks;
	}

	
	public static void main(String[] args) 
	{
		String inputFileName=args[0];
		Scheduler scheduler=new Scheduler();
		scheduler.listOfAllTalks=scheduler.InputTalksInitializer(inputFileName);
		//scheduler.TrackScheduler(scheduler.listOfAllTalks);
		scheduler.TrackScheduler();
		scheduler.printTrack();
	}

	//This method will take an ArrayList of track and print them
	public void printTrack() 
	{
		
		
	}
	
	
	//Method implementing the logic of scheduling of talks in the tracks 
	public ArrayList<Track> TrackScheduler() 
	{
		Collections.sort(this.listOfAllTalks);
		
		int id=1;
		
		while(!this.listOfAllTalks.isEmpty())
		{
			Talk newTalk=this.listOfAllTalks.get(0);
			Session newMorningSession=new Session(0);
			Session newEveningSession=new Session(1);
			if(newTalk.getDuration()<=newMorningSession.getLeftDuration())
			{
				newMorningSession.AddDuration(newTalk.getDuration());
				newMorningSession.AddTalks(newTalk);
				this.listOfAllTalks.remove(0);
			}
			else
				if(newTalk.getDuration()<=newEveningSession.getLeftDuration())
				{
					newEveningSession.AddDuration(newTalk.getDuration());
					newEveningSession.AddTalks(newTalk);
				}
				else
					
			
			
			
			
			
			
			
			
			
	
			
			/*A=computeMatrix(this.listOfAllTalks,minutesMorning);
			AddToTrack(A,this.listOfAllTalks.size(),minutesMorning,id);
			
			B=computeMatrix(this.listOfAllTalks,minutesEvening);
			AddToTrack(B,this.listOfAllTalks.size(),minutesEvening,id);*/
			id++;
		}
		return null;
	}


	static int max(int a,int b)
	{
		return a>b?a:b;
	}
}


/*
	private void AddToTrack(int[][] T, int r, int c, int id) 
	{
		Track tempTrack=new Track();
		ArrayList<Talk> tempListOfTalks=new ArrayList<Talk>();
		int i=r;
		int j=c;
		while(i>0&&j>0)
		{
			if(T[i][j]!=T[i-1][j])
				{
					tempTrack=listOfTracks.get(id-1);
					tempListOfTalks.add(this.listOfAllTalks.get(i);
					
					
					
					
					
					tempTrack.setTalks();
				}
					
			}
		
		
		
	}

*/

/*public int[][] computeMatrix(ArrayList<Talk> listOfTalks,int maxMinutes)
{

	int W=maxMinutes;
	int w[]=new int[listOfTalks.size()];
	for(int i=0;i<listOfTalks.size();i++)
	{
		w[i]=(listOfTalks.get(i)).getDuration();
	}
	int A[][]=new int[listOfTalks.size()][W+1];
	
	for(int j=0;j<=W;j++)
	{
		if(w[0]>=j)
			A[0][j]=1;
		else
			A[0][j]=0;
	}
	for(int i=1;i<listOfTalks.size();i++)
	{
		for(int j=0;j<=maxMinutes;j++)
		{
			if(w[i]>j)
			{
				A[i][j]=A[i-1][j];
			}
			else
			{
				A[i][j]=max(1+A[i-1][j-w[i]],A[i-1][j]);
			}
		}
	}

	
	return A;
}

*/
