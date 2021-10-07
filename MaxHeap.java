public class MaxHeap
{
	private MaxHeap [] Heap;
	private int size;
	private int maxSize;

	public MaxHeap(int maxPriorityLevel)
	{
		this.size=0;
		this.maxSize=maxPriorityLevel;
		Heap=new MaxHeap[this.maxSize];
	}

	private int parentPosition(int position)
	{
		return (position-1)/2;
	}

	private int leftChildPosition(int position)
	{
		return position*2;
	}

	private int rightChildPosition(int position)
	{
		return (position*2+1);
	}




}