public class MaxHeap
{
	private Process[] Heap;
	private int size;
	private int maxSize;

	public MaxHeap(int maxPriorityLevel)
	{
		this.size=0;
		this.maxSize=maxPriorityLevel;
		this.Heap=new Process[this.maxSize];
	}

	public int getSize()
	{
		return this.size;
	}

	private boolean isLeaf(int position)
	{
		if(position>(size/2) && position <= size)
		{
			return true;
		}
		return false;
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

	private void swap(int posOne, int posTwo)
	{
		Process temp;
		temp=Heap[posOne];
		Heap[posOne]=Heap[posTwo];
		Heap[posTwo]=temp;
		return;
	}

	private void maxHeapify(int position)
	{
		if(isLeaf(position))
		{
			return;
		}
		if(Heap[position].compareTo(Heap[leftChildPosition(position)])<0 || 
		   Heap[position].compareTo(Heap[rightChildPosition(position)])<0)
		{
			if(Heap[leftChildPosition(position)].compareTo(Heap[rightChildPosition(position)])>0)
			{
				swap(position,leftChildPosition(position));
				maxHeapify(leftChildPosition(position));
			}
			else
			{
				swap(position,rightChildPosition(position));
				maxHeapify(rightChildPosition(position));
			}
		}
	}

	public void insert(Process value)
	{
		Heap[size]=value;

		int current=size;
		while(Heap[current].compareTo(Heap[parentPosition(current)])>0)
		{
			swap(current,parentPosition(current));
			current=parentPosition(current);
		}
		size++;
	}


	public Process extractMax()
	{
		Process popped=Heap[1];
		Heap[1]=Heap[size--];
		maxHeapify(1);
		return popped;
	}

	public void updateRemaining(int timeToIncrementLevel,int maxLevel)
	{
		for(int i=0;i<size;i++)
		{
			Heap[i].updateEachJob(timeToIncrementLevel,maxLevel);//this is is process.java
		}
		maxHeapify(1);
	}


}