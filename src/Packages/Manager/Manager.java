package Manager;




public class Manager extends Employee {
    
    
    private List<Course> courses = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private Map<Course, Teacher> courseAssignments = new HashMap<>();
    private List<Student> students = new ArrayList<>();
    private List<Request> requests = new ArrayList<>();
    
    //                         Operations                                  
    
  
   
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        courseAssignments.put(course, teacher);
    }
    
    public void createStatisticalReports() {
        
    }

    public void manageNews() {
       
    }

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public class Manager extends Employee {

        private List<Course> courses = new ArrayList<>();
        private List<Teacher> teachers = new ArrayList<>();
        private Map<Course, Teacher> courseAssignments = new HashMap<>();
        private List<Student> students = new ArrayList<>();
        private List<Request> requests = new ArrayList<>();

        // Constructor, getters, setters, and other methods specific to Manager

        // Method to manage news
        public void manageNews(String news) {
            // Implementation to manage and publish news
            System.out.println("News managed: " + news);
        }

        // Method to prioritize news by its category
        public void prioritizeNews(String category) {
            // Implementation to prioritize news based on category
            System.out.println("News prioritized for category: " + category);
        }

        // Method to view all requests
        public void viewRequests() {
            // Implementation to view all requests
            for (Request request : requests) {
                System.out.println(request);
            }
        }

        // Method to get information about a student
        public void infoStudent(Student student) {
            // Implementation to display information about a student
            System.out.println("Student Information: " + student);
        }

        // Method to get information about a teacher
        public void infoTeacher(Teacher teacher) {
            // Implementation to display information about a teacher
            System.out.println("Teacher Information: " + teacher);
        }

        // Method to create reports
        public void createReports() {
            // Implementation to create and generate reports
            System.out.println("Reports created successfully.");
        }

        // Method to announce a research paper
        public void announceResearchPaper(String researchPaper) {
            // Implementation to announce a research paper
            System.out.println("Research Paper Announced: " + researchPaper);
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
