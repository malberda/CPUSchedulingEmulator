public class PQueue
{
	private MaxHeap heap;

	public PQueue(int maxPriorityLevel)
	{
		this.heap=new MaxHeap(maxPriorityLevel);
	}

	public boolean isEmpty()
	{
		if(heap.getSize()==0)
			return true;
		else
			return false;
	}

	public void enPQueue(Process P)
	{
		heap.insert(P);
	}

	public Process dePQueue()
	{
		return heap.extractMax();
	}

	public void update(int timeToIncrementLevel, int maxLevel)
	{

	}

	

	
}