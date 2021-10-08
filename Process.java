public class Process
{
	private int priority;
	private int timeRemaining;
	private int arrivalTime;
	private int timeNotProcessed;

	public Process(int a, int b, int c)
	{
		this.priority=a;
		this.timeRemaining=b;
		this.arrivalTime=c;
		this.timeNotProcessed=0;
	}

	public int compareTo(Process b)
	{
		return 1;
	}

	public void reduceTimeRemaining()
	{
		this.timeRemaining--;
	}

	public boolean finish()
	{
		if(this.timeRemaining<=0)
			return true;
		else
			return false;
	}

	public int getArrivalTime()
	{
		return this.arrivalTime;
	}

	public int getPriority()
	{
		return this.priority;
	}

	public int getTimeRemaining()
	{
		return this.timeRemaining;
	}

	public void resetTimeNotProcessed()
	{
		this.timeNotProcessed=0;
	}

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


}