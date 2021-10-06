public class Heap
{
	private int[] Heap;
	private int size;
	private int maxsize;


	Public MaxHeap(int maxsize)
	{
		this.maxsize=maxsize;
		this.size=0;
		Heap=new int[this.maxsize];
	}

	private int parent(int pos){return (pos-1)/2;}

	private int leftChild(int pos){return 2*pos;}

	private int rightChild(int pos){return (2*pos+1);}
	




}