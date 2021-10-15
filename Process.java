public class Process
{
//all self explanitory values
	private int priority;
	private int timeRemaining;
	private int arrivalTime;
	private int timeNotProcessed;



//constructor
	public Process(int a, int b, int c)
	{
		this.priority=a;
		this.timeRemaining=b;
		this.arrivalTime=c;
		this.timeNotProcessed=0;
	}

//dont think i ended up using this
/*	public void copy(int a, int b, int c, int d)
	{
		this.priority=a;
		this.timeRemaining=b;
		this.arrivalTime=c;
		this.timeNotProcessed=d;
	}*/

//comparison returns a 0 if basic is less than b, 1 if this is >b, and 0 if equal
	public int compareTo(Process b)
	{
		//checking to see which has higher priority, and if both are equal, then which has been in longer
		try
		{	
			if(this.priority<b.getPriority())
				return 0;
			else if(this.priority>b.getPriority())
				return 1;
			else
			{
				if(this.arrivalTime<b.getArrivalTime())
					return 1;
				else
					return 0;		
			}
		}
		catch(Exception e)
		{
//			System.out.println("b doesnt exist");
			return -1;//error b doesnt exist.			
		}
	}

//reduces timeRemaining
	public void reduceTimeRemaining()
	{
		this.timeRemaining--;
		return;
	}

//checks if the current process is done
	public boolean finish()
	{
		if(this.timeRemaining<=0)
			return true;
		else
			return false;
	}

//returns arrival time
	public int getArrivalTime()
	{
		return this.arrivalTime;
	}

//returns priority
	public int getPriority()
	{
		return this.priority;
	}

//returns time remaining
	public int getTimeRemaining()
	{
		return this.timeRemaining;
	}

//resets time since processed
	public void resetTimeNotProcessed()
	{
		this.timeNotProcessed=0;
	}
	public int getTimeNotProcessed()
	{
		return this.timeNotProcessed;
	}


//updates process
	public void updateEachJob(int timeToIncrementLevel, int maxLevel)
	{
		this.timeNotProcessed++;
		if(timeNotProcessed>=timeToIncrementLevel)
		{
			timeNotProcessed=0;
			if(this.priority<maxLevel)
			{
				this.priority++;
			}
		}
	}

	//testing function
/*	public void print()
	{
		System.out.println("JOB: "+ this.arrivalTime+" with timerequired: "+this.timeRemaining+" with priority: "+this.priority);
		return;
	}*/


}