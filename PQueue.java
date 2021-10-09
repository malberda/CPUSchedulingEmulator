public class PQueue
{
	private MaxHeap heap;

//constructor for PQueue
	public PQueue(int simulationTime)
	{
		this.heap=new MaxHeap(simulationTime);
	}

//returns whether the heap is empty
	public boolean isEmpty()
	{
		if(heap.getSize()==0)
			return true;
		else
			return false;
	}
//adds a process or generic P to the heap
	public void enPQueue(Process P)
	{
		heap.insert(P);
	}

//removes the top of the heap and returns it
	public Process dePQueue()
	{
		return heap.extractMax();
	}

//updates the values by calling update remaining found in maxheap
	public void update(int timeToIncrementLevel, int maxLevel)
	{
		heap.updateRemaining(timeToIncrementLevel, maxLevel);
		return;
	}

	
	public void print()
	{
		heap.print();
	}

	
}