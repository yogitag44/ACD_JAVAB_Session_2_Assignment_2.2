import java.util.Scanner;   //input class of java

public class AlphabetPattern {    //Class to print required pattern

	public static void main(String args[])   //Main function of the program   
		{
		int charCount = 1;		//Character count to use in the for loop, until what number it should run; 
		
		int spaceCount = 1;		//space count to use in the for loop, until what number it should run;
		
		char ch = 'a';			//initialized the first character 
		
		int AlphaNumber = 3;	//how many characters should be printed
		
		for (int i = 1; i<( AlphaNumber*2 ); i++) {   //loop will continue twice per the given number to print in forward and reverse order as well.
			
			for (int space = AlphaNumber - spaceCount; space > 0; space--)  //loop to print space 
				//print space
				{
					System.out.print(" ");  
				}
				if (i < AlphaNumber) {  //increasing space for below triangle 
					spaceCount++;
					}
				else {
					spaceCount--;  //decreasing space for above triangle
				}
				for (int j = 0;j < charCount; j++) {   //loop to print characters
					System.out.print(ch);				//printing first character i.e 'a'
						if (j < charCount/2) {
							ch++;   //incrementing character for above triangle 
						}
						else {
							ch--;   //decrement character for below triangle
						}
				}
					if (i<AlphaNumber) {
						
						charCount = charCount + 2;  
					}
					else {
						charCount = charCount - 2;
					}
					ch = 'a';
					System.out.println();
				}
				
		}
}
		
