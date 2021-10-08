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

//comparison returns a 0 if basic is less than b, 1 if this is >b, and 0 if equal
	public int compareTo(Process b)
	{
//		System.out.println("trying to compare two");
//		System.out.print("comparing "+this.getPriority()+" to ");
		try
		{
//			System.out.println(b.getPriority());	
			if(this.priority<b.getPriority())
				return 0;
			else if(this.priority>b.getPriority())
				return 1;
			else
				return 0;//if equal		
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
		System.out.println("help");
		this.timeRemaining--;
		System.out.println("me");
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

//updates process
	public void updateEachJob(int timeToIncrementLevel, int maxLevel)
	{
		System.out.println("1");
		this.timeNotProcessed++;
		System.out.println("2");
		if(timeNotProcessed>=timeToIncrementLevel)
		{
			timeNotProcessed=0;
			if(this.priority<maxLevel)
			{
				this.priority++;
			}
		}
	}


}