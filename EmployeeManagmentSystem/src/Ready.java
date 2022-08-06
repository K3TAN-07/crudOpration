import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.employee.manage.EmployeeDao;
import com.employee.manage.employee;

public class Ready {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("hello and welcome to our Employee management system") ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("press 1 to ADD employee");
			System.out.println("press 2 to Delete employee");
			System.out.println("press 3 to display employee");
			System.out.println("press 4 to exit");
		
			//to take choise frome user i take bufferreader
			int c =Integer.parseInt(br.readLine()) ;// string to int
			
			if(c==1) {
				//add employee
				System.out.println("Enter employee name : ");
				String name=br.readLine();
				
				System.out.println("Entre employee phone : ");
				String phone=br.readLine();
				
				System.out.println("Entre employee city");
				String city = br.readLine();
				
				// create employee object to store student
				
			
				employee em = new employee(name,phone,city);
				boolean answer =  EmployeeDao.insertEmployeeToDB(em);
				if(answer)
				{
					System.out.println("employee added succesfully ");
				}
				else
				{
					System.out.println("please try again sometime ");
				}
				System.out.println(em);
				
			}
			else if(c==2)
			{
				// delete employee
				System.out.println("Enter employee id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean f = EmployeeDao.deleteEmployee(userId);
				if(f)
				{
					System.out.println("employee succefully deleted");
				}
				else
				{
					System.out.println("something went wrong");
				}
			}
			else if (c==3)
			{
				//diplay employee
				EmployeeDao.showAllEmployee();
			}
			
			else if(c==4)
			{
				//exit
				break;
				
			}
			else
			{
				
			}
					


		}
		System.out.println("thank you for using our Application");
	}

}


