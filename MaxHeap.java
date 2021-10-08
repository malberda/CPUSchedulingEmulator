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
		MaxHeap temp;
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
		if(heapComparison(Heap[position],Heap[leftChildPosition(position)])<0 || 
		   heapComparison(Heap[position],Heap[rightChildPosition(position)])<0)
		{
			if(heapComparison(Heap[leftChildPosition(position)],Heap[rightChildPosition(position)])>0)
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

	private int heapComparison(MaxHeap one, MaxHeap two)
	{
		return 1;//need to fix this
	}

	public void insert(MaxHeap value)
	{
		Heap[size]=value;

		int current=size;
		while(heapComparison(Heap[current],Heap[parentPosition(current)])>0)
		{
			swap(current,parentPosition(current));
			current=parentPosition(current);
		}
		size++;
	}


	public int extractMax()
	{
		MaxHeap popped=Heap[1];
		Heap[1]=eap[size--];
		maxHeapify(1);
		return popped;
	}

	public void print()
	{
		for(int i=0;i<=size/2;i++)
		{
			System.out.print("parent: "Heap[i]+ " left child: "+Heap[2*i+1]
				+" right child: "+Heap[2*i+2]);
			System.out.println();
		}
	}

	public static void main(String[] arg)
	{
		MaxHeap maxHeap=new MaxHeap(15);

		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(522);
		maxHeap.insert(9);
	}

		maxHeap.print();



}