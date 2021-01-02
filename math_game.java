import java.util.Random;
import java.util.Scanner;

public class math_game
{
public static void main(String[] args)
{

Scanner scan = new Scanner(System.in);

int answer;
int product;
Random myRandomNum = new Random();
int num1;
int num2;

while(true)
{
num1 = Math.abs(myRandomNum.nextInt() % 10);
num2 = Math.abs(myRandomNum.nextInt() % 10);

System.out.println(num1 + " * " + num2);
product = num1 * num2;
System.out.println("Please enter an answer");
answer = scan.nextInt();
do
{
if(answer == product)
{
System.out.println("correct");
}
else if (answer == -1)
{
System.out.println("Exit program");
System.exit(-1);
}
else
  {
System.out.println("Please try again: ");
answer = scan.nextInt();
   }
}
while(answer != product);
}
}
}
