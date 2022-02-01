class ArrayDemo
{
	public static void main(String arg[])
	{
		int arr[] = new int [5];	// First way
		arr[0] = 11;
		arr[1] = 21;
		arr[2] = 51;
		arr[3] = 101;
		arr[4] = 111;

		System.out.println("Length of array is "+arr.length);
		int brr[]={11,21,51,101,111};	// Second way
		int crr[] = new int[]{11,21,51,101,111};	// Third way

		for(int icnt = 0; icnt < arr.length; icnt++)
		{
			System.out.println(arr[icnt]);
		}

		int i = 0;
		while(i < arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}

		int j = 0;
		do
		{
			System.out.println(arr[j]);
			j++;
		}while(j < arr.length);

		for(int no : arr)
		{
			System.out.println(no);
		}
	}
}
