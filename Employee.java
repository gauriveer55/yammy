/*create a employee with following properties and methods:
salary(property)(int)
getsalary(method returning int)
name (property)(String)
getname(method returning string)
set name(method chaning name)*/

 public class Employee {
    int salary;
    String name;

    public int getsalary (){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }

public static void main (String[]args){
    Employee gauri=new Employee();
    gauri.setname("code with harry");
    System.out.println(gauri.getname());
}
}
