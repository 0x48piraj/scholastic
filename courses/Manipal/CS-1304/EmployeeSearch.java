class Employee
{
	private String emp_name, dept_name, designation;
	private int emp_id;
	private double salary;
	private static int c=0;
	
	public Employee()
	{
	 	emp_id=c++;
	}
	
	public Employee(String n,String dn, String ds, double s)
	{
		emp_name=n;
		dept_name=dn;
		designation=ds;
		salary=s;
		emp_id=c++;
	}
	
	 public static void search(Employee[] e1, int id)
    {
    	int i;
        for(i=0;i<e1.length;i++)
        {
            if(e1[i].emp_id==id)
            {
                System.out.println("Found");
                e1[i].show();
                return;
            }
        }
 
        System.out.println("Not Found!");
    }
	
	public void show()
	{
		System.out.println("\n"+"Employee id:"+emp_id);
				System.out.println("Name:"+emp_name+"\nDepartment:"+dept_name+"\nDesignation:"+designation+"\nSalary(in mil):"+salary);
		
	}
	

public void check(Employee obj)
    {
        if(salary<obj.salary)
            obj.salary+=1;
        else if(obj.salary<salary)
            salary+=1;
    }
}
class demo
{
	public static void main(String args[])
	{
		int i;
		Employee e[]=new Employee[9];
		e[0]=new Employee("Steve Jobs","Apple","Ex-CEO",10);
		e[1]=new Employee("Bill Gates","Microsoft","Ex-CEO",40.5);
		e[2]=new Employee("Indra Nooyi","Pepsico","Ex-CEO",29.8);
		e[3]=new Employee("Ginni Rometty","IBM","CEO",32.7);
		e[4]=new Employee("Satya Nadella","Microsoft","CEO",27);
		e[5]=new Employee("Sundar Pichai","Google","CEO",18.8);
		e[6]=new Employee("Elon Musk","SpaceX","CEO",189);
		e[7]=new Employee("Tim Cook","Apple","CEO",15.7);
		e[8]=new Employee("Mark Zuckerberg","Facebook","CEO",70);
		
		
 
        Employee.search(e,8);
        e[7].check(e[8]);
 
        System.out.println("\nAfter increment:\n\n");
        e[7].show();
        e[8].show();
	}
}