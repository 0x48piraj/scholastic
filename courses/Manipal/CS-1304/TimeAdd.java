import java.util.Scanner;
class Time
{
    private int hour,min,sec;

    public Time(){} //default constructor
    public Time(int hour, int min, int sec)//parameterised constructor
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public Time add(Time a, Time b) //Object as an argument
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
        System.out.println("Total time:\n:" +hour+":"+min+":"+sec+"(in hr,min,sec format)");
        
    }
}
class demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hour,min,sec;

        System.out.println("T1"+"\nHrs:");
        
        hour=sc.nextInt();
        System.out.println("Min:");
        min=sc.nextInt();
        System.out.println("Sec:");
        sec=sc.nextInt();
        System.out.println();

        Time t1=new Time(hour,min,sec);

        System.out.println("T2"+"\nHr:");
        
        hour=sc.nextInt();
        System.out.println("Min:");
        min=sc.nextInt();
        System.out.println("Sec:");
        sec=sc.nextInt();
        System.out.println();

        Time t2=new Time(hour,min,sec);

        Time t3=new Time();
        t3=t3.add(t1,t2);
        t3.display();
    }
}