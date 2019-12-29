class Third implements Runnable { 
void run() 
{ 
System.out.println("third"); 
} 
} 
class demo{ 
public static void main(String[] foo) 
{ 
Third t = new Third(); 
t.start();
System.out.println(" I am at last"); 
} 
}