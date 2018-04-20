//First Line of the git project.
import java.util.*;
import static java.lang.System.*;
public class Project
{

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string :: ");
		String bobby = keyboard.next();
		System.out.println(FAT(bobby));
	}

	public static int FAT(String niglet){
		int total=0;
		for(int i=0; i<niglet.length();i++){
			total+=(niglet.charAt(i)*36)+450983093;
		}
		return total;
	}
}