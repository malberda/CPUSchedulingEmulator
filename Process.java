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

	public int compareTo(int a, int b)
	{
		if (a<b)
			return -1;
		else if (a>b)
			return 1;
		else
			return 0;
	}

	public void reduceTimeRemaining()
	{

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



}