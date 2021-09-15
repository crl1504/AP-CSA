public class NumbersRiddle
{
  public static void main(String[] args)
  {
    // initial number
    double initialNum = 5;
    System.out.println("The number I started with was " + (int) initialNum);
    double num = initialNum;

    System.out.println((int)num + " doubled is " + (((int)num)*2));
    num *= 2; //double the answer

    /*
     * printing the value before 6
     * adding six
     * print the number plus six
     */

    System.out.print((int)num + " plus six is ");
    num += 6; // add 6
    System.out.println((int)num);

    // divide by 2
    System.out.println((int)num + " divided by 2 is " + (int)(num/2));
    num /= 2; // divide by 2

    // subtract original number
    System.out.print((int)initialNum + " subtracted from " + (int)num + " is " + ((int)num - (int)initialNum));
  }
}
// Code by Caleb Looney