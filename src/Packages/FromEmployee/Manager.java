package fromEmployee;

import java.util.Date;
import java.util.Vector;
import fromUser.Message;
import fromUser.User;


public class Employee extends User {
	private Vector<Message> receiveMessages;
    private double salary;
    private Date hireDate;
	
    public Employee(fromUser.UserType UserType, String ID, String FirstName, String LastName, String Email,
			String Password, int PhoneNumber, double salary, Date hireDate) {
		super(UserType, ID, FirstName, LastName, Email, Password, PhoneNumber);
			this.hireDate = new Date();
			this.salary = salary;
    }
    
    public Vector<Message> getReceiveMessages() {
        return this.receiveMessages;
    }
    public void setReceiveMessages(Vector<Message> receiveMessages) {
        this.receiveMessages = receiveMessages;
    }
    public Double getSalary() {
        return this.salary;
    }
    public void setSalary(Double Salary) {
        this.salary = Salary;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    
    public void SendMessage() {
    }
    
    
}
