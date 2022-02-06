package labexam;
import java.util.Scanner;
public class palindrome 
	{

	public static void main(String[] args) 
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string");
				String str = sc.nextLine();
				int flag = 0;
				int length = str.length();
				for(int i=0;i<=length/2;i++)
					{
					if(str.charAt(i)!=str.charAt(length-1-i))
						{
						flag=1;
						break;
						}
					}
				if(flag==0)
				{
					System.out.println("This is a palindrome");
				}
				else
				{
					System.out.println("This is not a palindrome");
				}
				sc.close();
		}
	}
