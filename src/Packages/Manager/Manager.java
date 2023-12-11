package Manager;

public class Manager extends Employee {
    
    
    private Course allcourses;

   
    
   
    private List<Course> courses = new ArrayList<>();
    private Map<Course, Teacher> courseAssignments = new HashMap<>();
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Request> requests = new ArrayList<>();
    /**
    * @generated
    */
    private News news;
    
   

    //                          Operations                                  
    
  
    public void approveStudentRegistration(Student student) {
        students.add(student);
    }
    public void addCourseForRegistration(String name, String major, int yearOfStudy) {
        Course course = new Course(name, major, yearOfStudy);
        courses.add(course);
    }

    public void assignCourseToTeacher(Course course, Teacher teacher) {
        courseAssignments.put(course, teacher);
    }

    public void createStatisticalReports() {
        
    }

    public void manageNews() {
       
    }

    public void viewInfoAboutStudentsSortedByGPA() {
        // Implement sorting and viewing students by GPA
    }

    public void viewInfoAboutTeachersAlphabetically() {
        
    }
    
    public void viewRequests() {
        for (Request request : requests) {
            if (request.signedByDean) {
                // что напишем сюда? 
            } else {
                // и здесь
            }
        }
    }
    
}
