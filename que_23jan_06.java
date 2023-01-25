//Write a C program to check if it is possible to add two integers to get the third integer from three given integers.

class add_two_to_get_third
{
	int n1,n2,n3;
	void set()
	{
	n1 = 2;  //3
	n2 = 3;  //3
	n3 = 5;  //6

		if(n1 == n2+n3 || n2 == n1+n3 || n3 == n1+n2)
		{
			System.out.println("it is possible");
			}
			else{
				System.out.println("it is not-possible");
				}
	}
}

public class que_23jan_06
{
public static void main(String[] args)
{
	add_two_to_get_third ob = new add_two_to_get_third();
	ob.set();
}
}