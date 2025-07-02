package Arrays;

public class SearchAnElementInAnArray {

	public static void main(String[] args) {
		
		int a[] = {100, 200, 300, 400, 500};
		
		int search_element = 600;
		boolean status = false;
		
		//using conventional for loop
		/*
		for(int i =0; i<=a.length-1;i++)
		{
			if(a[i] == search_element)
			{
				System.out.println("Element Found");
				status =true;
				break;
			}
		}
		if(status == false)
		{
			System.out.println("Element Not Found");	
		}
		*/
		
       // Using Enhanced for each loop
		for (int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		if(status == false)
		{
			System.out.println("Element Not Found");	
		}
	}

}
