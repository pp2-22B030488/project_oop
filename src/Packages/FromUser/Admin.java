package fromUser;

import java.util.ArrayList;
import java.util.Objects;

public class Admin extends User{
	private ArrayList<User> users;
	
    public Admin(fromUser.UserType UserType, String ID, String FirstName, String LastName, String Email,
			String Password, int PhoneNumber) {
		super(UserType, ID, FirstName, LastName, Email, Password, PhoneNumber);
		// TODO Auto-generated constructor stub
	}
    public Admin() {
        users = new ArrayList<>();
       
    }

    public Admin(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public boolean addUser(User user) {
        // Check if the user already exists before adding
        if (!users.contains(user)) {
            users.add(user);
            return true;
        } else {
            System.out.println("User already exists.");
            return false;
        }
    }

    public boolean removeUser(User user) {
        // Remove the user if it exists
        if (users.contains(user)) {
            users.remove(user);
            return true;
        } else {
            System.out.println("User not found.");
            return false;
        }
    }

    public boolean updateUser(User oldUser, User newUser) {
        // Update the user if it exists
        if (users.contains(oldUser)) {
            int index = users.indexOf(oldUser);
            users.set(index, newUser);
            return true;
        } else {
            System.out.println("User not found.");
            return false;
        }
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Admin admin = (Admin) obj;
        return Objects.equals(users, admin.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

//    @Override
//    public int compareTo(User otherAdmin) {
//        // Compare Admin objects based on the number of users they have
//        return Integer.compare(this.users.size(), otherAdmin.size());
//    }

    @Override
    public Admin clone() throws CloneNotSupportedException {
        // Perform a shallow copy by invoking the Object.clone() method
		Admin clonedAdmin = (Admin) super.clone();
		// Create a new ArrayList to avoid sharing the same reference
		clonedAdmin.users = new ArrayList<>(this.users);
		return clonedAdmin;
    }
}

