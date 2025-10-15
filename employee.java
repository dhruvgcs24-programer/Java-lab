public class employee {
       int emp_Id;
       String name;
       float salary;
    public employee(int emp_Id ,String name, float salary){
        this.emp_Id=emp_Id;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee ID: "+emp_Id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args){
      employee e1=new employee(4983,"Dhananjay",800229);
      e1.display();
      employee e2=new employee(9548,"Dhruv",349832);
      e2.display();
      employee e3=new employee(4542,"Dhyan",348212);
      e3.display();
    }
}
