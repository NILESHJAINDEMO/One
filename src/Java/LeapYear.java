package Java;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=207;
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
				else
				{
					System.out.println("leap year");
				}
			}
			else
			{
				System.out.println("not leap year");
			}
			}
}
			