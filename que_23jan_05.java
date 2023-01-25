//Write a C program to check if a given number is within 2 of a multiple of 10.

class multiple_of_10
{
	int num1,num2;
	void set()
	{
	num1 = 99;
	//num2 = 23;
		if(num1%10==0 || num1%10>=2 || num1%10<=8)
		{
			System.out.println("number is within 2 of a multiple of 10 :\nnum="+num1);
		}
		else{
			System.out.println("number is not within 2 of a multiple of 10");
			}
	}


}
public class que_23jan_05
{
public static void main(String[] args)
{
	multiple_of_10 ob = new multiple_of_10();
	ob.set();


}
}