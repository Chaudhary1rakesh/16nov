package first_java_programe;
public class array_sum {
public static void main(String[] args) {
		int sum=0;
		int arr[]= {1,2,17,6};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Array:" + array);
//		int array=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("Total sum of the Array:"+sum);
	}
}
