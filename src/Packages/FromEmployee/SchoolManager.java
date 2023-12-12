package FromEmployee;


import java.util.ArrayList;
import java.util.List;

public class SchoolManager extends Manager{

    private SchoolName school;
    private List<Request> listOfRequestsSchool;
    private List<StaffMember> staffMembers;

    public enum SchoolName {
    	 SITE, SG, BS, ISE, KMA, SAM, SCE
    }

    public SchoolManager(SchoolName school) {
        this.school = school;
        this.listOfRequestsSchool = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
    }

   
    public void manageEvents() {
    	System.out.println("Events managed for " + school);
    }

    public void addStaffMembers(StaffMember staffMember) {
        staffMembers.add(staffMember);
        System.out.println("Staff member added: " + staffMember.getName());
    }

    
    public void removeStaffMembers(StaffMember staffMember) {
        staffMembers.remove(staffMember);
        System.out.println("Staff member removed: " + staffMember.getName());
    }

    
    public void viewStaffMembers() {
        for (StaffMember staffMember : staffMembers) {
            System.out.println(staffMember);
        }
    }

    
    public void approveCourseAddition(Request request) {
        
        listOfRequestsSchool.remove(request);
        System.out.println("Course addition approved for " + request.getCourse().getName());
    }

    
    public void sendSchoolReports() {
        
        System.out.println("School reports sent for " + school);
    }

  
}
