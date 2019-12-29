import java.util.Scanner;  // Import the Scanner class

interface TimeInterface {
	void addTime();
	void displayTime();
}

class Complex
{
    private int realA, realB, output, realOut, imaginaryOut;
    public void addImag(int a, int b, int c, int d)
    {
    	realOut = a + c;
    	imaginaryOut = b + d;
        System.out.println("Sum of imaginary numbers: (" + realOut + " + " + imaginaryOut + "i)");
    }
    public void addReal(int a, int b)
    {
    	output = a + b;
        System.out.println("Total:\n" + output);
    }
}


class Time implements TimeInterface
{
    private int hour,min,sec;

    public Time(){} //default constructor
    public Time(int hour, int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public void displayTime() {
     System.out.println("Total time:");
    }
    public void addTime() {
     //int a, b, c;
     //c = a + b;
    }
    public Time add(Time a, Time b) //object as an argument
    {
        Time tmp=new Time();
        tmp.sec=a.sec+b.sec;
        tmp.min=a.min+b.min;
        tmp.hour=a.hour+b.hour;
        tmp.min+=tmp.sec/60;
        tmp.sec%=60;
        tmp.hour+=tmp.min/60;
        tmp.min%=60;
        return tmp; //return resulting object
    }
    public void display() //to display data
    {
        System.out.println("Total time:\n" +hour+":"+min+":"+sec+" (in hh:mm:ss format)");
        
    }
}
class calculate extends Complex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Java Practical Exam Menu:\n1) Perform addition on real numbers.\n2) Perform addition on imaginary numbers.\n3) Add two timestamps in HH:MM:SS format.");
        System.out.println("Enter your option:");
        int option = sc.nextInt();
        if (option == 1) {
    	    int numA, numB;
    	    System.out.println("Enter first real number:");
    	    numA = sc.nextInt();
    	    System.out.println("Enter second real number:");
    	    numB = sc.nextInt();
    	    Complex c1 = new Complex();
    	    c1.addReal(numA, numB);
        }
        else if (option == 2) {
        	int numAr, numAi, numBr, numBi;
        	System.out.println("Enter First Imaginary Number:");
    	    System.out.print("Enter real part : ");
    	    numAr = sc.nextInt();
    	    System.out.print("Enter imaginary part : ");
    	    numAi = sc.nextInt();
        	System.out.println("Enter Second Imaginary Number:");
    	    System.out.print("Enter real part : ");
    	    numBr = sc.nextInt();
    	    System.out.print("Enter imaginary part : ");
    	    numBi = sc.nextInt();
    	    System.out.println("First Input: (" + numAr + " + " + numAi +"i)");
    	    System.out.println("Second Input: (" + numBr + " + " +numBi +"i)");
    	    System.out.println("Performing addition ...");
    	    Complex c2 = new Complex();
    	    c2.addImag(numAr, numAi, numBr, numBi);
        }
        else if (option == 3) {
        int hour,min,sec;
        System.out.println("T1"+"\nHours:");
        hour=sc.nextInt();
        System.out.println("Minutes:");
        min=sc.nextInt();
        System.out.println("Seconds:");
        sec=sc.nextInt();
        Time t1=new Time(hour,min,sec);
        System.out.println("T2"+"\nHours:");
        hour=sc.nextInt();
        System.out.println("Minutes:");
        min=sc.nextInt();
        System.out.println("Seconds:");
        sec=sc.nextInt();
        Time t2=new Time(hour,min,sec);
        Time t3=new Time();
        t3=t3.add(t1,t2);
        t3.display();
        }
    }
}