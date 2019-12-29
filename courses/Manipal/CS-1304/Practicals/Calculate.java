import java.util.Scanner;  // Import the Scanner class

class complex {
	public void AddRealNums(int realA, int realB) {
		int output = realA + realB;
		return output;
	}
	public void AddImaginaryNums() {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter imaginary part:");
    String userName = sc.nextLine();  // Read user input
    System.out.println("Enter read part: " + userName);  // Output user input 
	}
}


class calculate {
  public static void main(String[] args) {
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
    	complex obj = new complex();
    	int out = obj.AddRealNums(numA, numB);
    	System.out.println("The sum of two real numbers is:" + out);
    } 
  }
}

/*
-->implements time

complex
read, imaginary

abstract add() // imaginary nums add

interface time
add time()

class calculate*/