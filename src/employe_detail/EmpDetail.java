package employe_detail;
/**
 * Employe_detail class has main method  
 * @author Grishma
 *
 */
public class EmpDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test 123");
		
		 Employee e1= new  Employee();// creating new object for class Employee
		 e1.setEmp_id(1);
		 System.out.println("Employe Id: " +e1.getEmp_id());
		 e1.setName("Grishma");
		 System.out.println("Employe Name: "+e1.getName());
		 e1.setJobTitle("Tester");
          System.out.println("Job Title" +e1.getJobTitle());
          e1.setPhNo(23434564);
          System.out.println("Employe Number: "+e1.getPhNo());
          
          TimeOffice t1 = new TimeOffice();//creating new object for class TimeOffice
          t1.setInTime(7.00);
          System.out.println("In time: " +t1.getInTime());
          t1.setOutTime(8.00);
          System.out.println("out Time : " +t1.getOutTime());
      
          
          Payroll p1=  new  Payroll();//creating new object for class Employee
          p1.setBasicSalary(20000);
          System.out.println("Basic Salary   " +p1.getBasicSalary());
          p1.setBenifit(5000);
          System.out.println("Benifit:  "+p1.getBenifit());
          p1.setInsentive(2000);
          System.out.println("Insentive:  "+p1.getInsentive());;
          
          
          Performance f1=new  Performance();//creating new object for class Performance
          f1.setRating(4);
          System.out.println("Rating: " +f1.getRating());
          f1.setAccomplishment("AWS certification");
          System.out.println("Accomplishment: "+f1.getAccomplishment());
          f1.setMilestone("milestone");
          System.out.println(""+f1.getMilestone());
          
}
}