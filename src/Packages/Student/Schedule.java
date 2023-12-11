package Packages;


/**
* @generated
*/
public class Schedule {
    
    /**
    * @generated
    */
    private Integer academicYear;
    
    /**
    * @generated
    */
    private Semester term;
    
    /**
    * @generated
    */
    private Vector<Course> courses;
    
    /**
    * @generated
    */
    private Vector<Lesson> lessons ;
    
    /**
    * @generated
    */
    private Student student;
    
    
    
    /**
    * @generated
    */
    public Integer getAcademicYear() {
        return this.academicYear;
    }
    
    /**
    * @generated
    */
    public Integer setAcademicYear(Integer academicYear) {
        this.academicYear = academicYear;
    }
    
    /**
    * @generated
    */
    public Semester getTerm() {
        return this.term;
    }
    
    /**
    * @generated
    */
    public Semester setTerm(Semester term) {
        this.term = term;
    }
    
    /**
    * @generated
    */
    public Vector<Course> getCourses() {
        return this.courses;
    }
    
    /**
    * @generated
    */
    public Vector<Course> setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
    
    /**
    * @generated
    */
    public Vector<Lesson> getLessons () {
        return this.lessons ;
    }
    
    /**
    * @generated
    */
    public Vector<Lesson> setLessons (Vector<Lesson> lessons ) {
        this.lessons  = lessons ;
    }
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public Student setStudent(Student student) {
        this.student = student;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Vector<WeekDay> getWeekDays() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public boolean getFreeTime() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean printSchedule() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean clear() {
        //TODO
        return false;
    }
    
    
}
