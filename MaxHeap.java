public class MaxHeap
{
//self explanitory 
	private Process[] Heap;
	private int size;
	private int maxSize;

//constructor for heap
	public MaxHeap(int simulationTime)
	{
		this.size=0;
		this.maxSize=simulationTime;
		this.Heap=new Process[this.maxSize];
	}

//returns the size of the heap
	public int getSize()
	{
		return this.size;
	}

//returns true if current node is a leaf
	private boolean isLeaf(int position)
	{
//		System.out.println("position is "+position+" size/2 is "+size/2+" size is "+size);
		if(2*position+2>size)
		{
//			System.out.println("returning true");
			return true;
		}
//		System.out.println("returning false");
		return false;
	}

//returns parent position
	private int parentPosition(int position)
	{
		return (position-1)/2;
	}

//return leftchildposition
	private int leftChildPosition(int position)
	{
		return (position*2+1);
	}

//returns position of right child
	private int rightChildPosition(int position)
	{
		return (position*2+2);
	}

//swaps the two values in the passed in position
	private void swap(int posOne, int posTwo)
	{
		Process temp;
		temp=Heap[posOne];
		Heap[posOne]=Heap[posTwo];
		Heap[posTwo]=temp;
		return;
	}

//maxheapifies stuff
	public void maxHeapify(int position)
	{
	//checks to see if posiiton is a leaf, if ti is then dont bother
		if(isLeaf(position))
		{
			return;
		}

	//if only node return, this is in case isLeaf doesnt work
		if(size==1)
			return;

	//comparison function
		if(Heap[position].compareTo(Heap[leftChildPosition(position)])==0 || 
		   Heap[position].compareTo(Heap[rightChildPosition(position)])==0)
		{
			if(Heap[leftChildPosition(position)].compareTo(Heap[rightChildPosition(position)])==1)
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

//inserts new value into heap
	public void insert(Process value)
	{
		Heap[size]=value;
		int current=size;
		while(Heap[current].compareTo(Heap[parentPosition(current)])==1)
		{
			swap(current,parentPosition(current));
			current=parentPosition(current);
		}
		size++;
		return;
	}

//pops and returns max priority value
	public Process extractMax()
	{
		Process popped=Heap[0];
//		System.out.println("pre extractions size is "+this.size);
		Heap[0]=Heap[size-1];
		size=size-1;
//		System.out.println("post extractions size is "+this.size);
//		System.out.println("extracted job "+popped.getArrivalTime());
		if(getSize()>0)
		{
//			System.out.println("about to heapify");
			maxHeapify(0);
		}
		
		return popped;
	}

//updates each node in heap
	public void updateRemaining(int timeToIncrementLevel,int maxLevel)
	{
//		System.out.println("size is "+size);
		for(int i=0;i<size;i++)
		{
			Heap[i].updateEachJob(timeToIncrementLevel,maxLevel);//this is is process.java
		}
	}


//testing function
/*	public void print()
	{
		for(int i=0;i<size;i++)
		{
			Heap[i].print();
		}
	}*/


}