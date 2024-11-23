package Assignment6;


public class Question1 {
	int size = 0;
   int arr[];
	public Question1(int s) {
      arr=new int[s];
	}

	public void addValue(int i) {
		size++;
		arr[size]=i;
		int ci=size;
		int pi=ci/2;
		
		while(pi>=1)
		{
			if(arr[pi]<arr[ci])
			{
				break;
			}
			int temp=arr[pi];
			arr[pi]=arr[ci];
			arr[ci]=temp;
			
			ci=pi;
			pi=ci/2;
		}
	}
	public void delete()
	{
		int min=arr[1];
		arr[1]=arr[size];
		arr[size]=min;
		size--;
	    int pi=1;
	    int ci=pi*2;
	    while(ci<=size) {
	    	if((ci+1)<=size && arr[ci+1]<arr[ci] )
	    	{
	    		ci=ci+1;
	    	}
	    	if(arr[pi]<arr[ci])
	    	{
	    		break;
	    	}
	    	int temp=arr[pi];
	    	arr[pi]=arr[ci];
	    	arr[ci]=temp;
	    	
	    	pi=ci;
	    	ci=pi*2;
	    	
	    }
	}
	public void display()
    {
  	  for(int i=1;i<=size;i++)
  	  {
  		  System.out.print(arr[i]+" ");
  	  }
    }

	public static void main(String[] args) {
		int arr[] = { 0, 6, 14, 3, 26, 8, 18, 21, 9, 5 };
		Question1 h = new Question1(arr.length);
		for (int i = 1; i < arr.length; i++) {
			h.addValue(arr[i]);
		}
		h.display();
		h.delete();
        System.out.println();
		h.display();

	}

}
