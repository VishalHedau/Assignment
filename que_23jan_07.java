//Write a C program to check if y is greater than x, and z is greater than y from three given integers x,y,z.

class check_greater
{
	int x,y,z;
	 void set()
	 {
	 x = 2;
	 y = 7;
	 z = 6;
	 }
	void logic()
	{
		if(x < y && y < z)
		{
			System.out.println("z is greater");

			}else{
				System.out.println("z is not-greater");
				}
		}

}

public class que_23jan_07
{
public static void main(String[] args)
{
check_greater ob = new check_greater();
ob.set();
ob.logic();

}
}