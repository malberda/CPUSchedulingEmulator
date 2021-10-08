public class ProcessGenerator
{

	//assuming that the double arrives as 0 through 1 like 0.12...
	double probability;


	public ProcessGenerator(double prob)
	{
		this.probability=prob;
	}


	public boolean query()
	{
		double randomNumber=Math.random();
		return(randomNumber<=this.probability);
	}

	public Process getNewProcess(int currTime, int maxTime, int maxLevel)
	{
		double randomNumber=0;

		while(randomNumber==0)
		{
			randomNumber=Math.random();
		}
		int time=(int)randomNumber;

		randomNumber=Math.random();
		while(randomNumber==0)
		{
			randomNumber=Math.random();
		}

		int priority=(int)randomNumber;
		Process proc=new Process(maxLevel*priority, maxTime*time, currTime);
		return proc;
	}

	

	
}