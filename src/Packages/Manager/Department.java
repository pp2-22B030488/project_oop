package Manager;
    
    import java.util.ArrayList;
    import java.util.List;

    public class Department extends Manager{

        private Set<Teacher> facultyMembers;
        private List<Course> coursesOffered;
        
        public enum departmentType {
        	SCIENCE_INNOVATION,
    	    BUSINESS_DEVELOPMENT,
    	    STUDENT_AFFAIRS;
        }
        
        

        public Department() {
            this.facultyMembers = new HashSet<>();
            this.coursesOffered = new ArrayList<>();
        }

        public Set<Teacher> getFacultyMembers() {
            return this.facultyMembers;
        }

        public void setFacultyMembers(Set<Teacher> facultyMembers) {
            this.facultyMembers = facultyMembers;
        }

        public List<Course> getCoursesOffered() {
            return this.coursesOffered;
        }

        public void setCoursesOffered(List<Course> coursesOffered) {
            this.coursesOffered = coursesOffered;
        }
        
        
        public Department getDepartmentType() {
            return this.departmentType;
        }
          
        public Department setDepartmentType(Department departmentType) {
            this.departmentType = departmentType;
        }
        
        

        
        public void addCourseOffered(Course course) {
            this.coursesOffered.add(course);
        }

        
        public void viewCoursesOffered() {
            for (Course course : this.coursesOffered) {
                System.out.println(course.getName()); 
            }
        }

      
        public void removeCourseOffered(Course course) {
            this.coursesOffered.remove(course);
        }

    }
