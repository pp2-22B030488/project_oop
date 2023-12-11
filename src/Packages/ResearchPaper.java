package Packages;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class ResearchPaper extends Researcher {
    
    /**
    * @generated
    */
    private String title;
    
    /**
    * @generated
    */
    private Vector<Researcher> author;
    
    /**
    * @generated
    */
    private Integer citations;
    
    /**
    * @generated
    */
    private String annotation ;
    
    /**
    * @generated
    */
    private Vector<String> keywords;
    
    /**
    * @generated
    */
    private String section;
    
    /**
    * @generated
    */
    private Date date;
    
    /**
    * @generated
    */
    private Integer pages;
    
    /**
    * @generated
    */
    private String isbn;
    
    /**
    * @generated
    */
    private String doi;
    
    /**
    * @generated
    */
    private Vector<String> feedbacks;
    
    
    /**
    * @generated
    */
    private Set<Researcher> researcher;
    
    /**
    * @generated
    */
    private Set<ResearchJournal> researchJournal;
    
    
    /**
    * @generated
    */
    public String getTitle() {
        return this.title;
    }
    
    /**
    * @generated
    */
    public String setTitle(String title) {
        this.title = title;
    }
    
    /**
    * @generated
    */
    public Vector<Researcher> getAuthor() {
        return this.author;
    }
    
    /**
    * @generated
    */
    public Vector<Researcher> setAuthor(Vector<Researcher> author) {
        this.author = author;
    }
    
    /**
    * @generated
    */
    public Integer getCitations() {
        return this.citations;
    }
    
    /**
    * @generated
    */
    public Integer setCitations(Integer citations) {
        this.citations = citations;
    }
    
    /**
    * @generated
    */
    public String getAnnotation () {
        return this.annotation ;
    }
    
    /**
    * @generated
    */
    public String setAnnotation (String annotation ) {
        this.annotation  = annotation ;
    }
    
    /**
    * @generated
    */
    public Vector<String> getKeywords() {
        return this.keywords;
    }
    
    /**
    * @generated
    */
    public Vector<String> setKeywords(Vector<String> keywords) {
        this.keywords = keywords;
    }
    
    /**
    * @generated
    */
    public String getSection() {
        return this.section;
    }
    
    /**
    * @generated
    */
    public String setSection(String section) {
        this.section = section;
    }
    
    /**
    * @generated
    */
    public Date getDate() {
        return this.date;
    }
    
    /**
    * @generated
    */
    public Date setDate(Date date) {
        this.date = date;
    }
    
    /**
    * @generated
    */
    public Integer getPages() {
        return this.pages;
    }
    
    /**
    * @generated
    */
    public Integer setPages(Integer pages) {
        this.pages = pages;
    }
    
    /**
    * @generated
    */
    public String getIsbn() {
        return this.isbn;
    }
    
    /**
    * @generated
    */
    public String setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    /**
    * @generated
    */
    public String getDoi() {
        return this.doi;
    }
    
    /**
    * @generated
    */
    public String setDoi(String doi) {
        this.doi = doi;
    }
    
    /**
    * @generated
    */
    public Vector<String> getFeedbacks() {
        return this.feedbacks;
    }
    
    /**
    * @generated
    */
    public Vector<String> setFeedbacks(Vector<String> feedbacks) {
        this.feedbacks = feedbacks;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String getCitation(Format f)() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public double checkPlagiarism() {
        //TODO
        return 0.0;
    }
    
    /**
    * @generated
    */
    public list searchRelatedPapers() {
        //TODO
        return null;
    }
    
    
}
