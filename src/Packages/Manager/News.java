package Manager;


import java.util.Date;
import java.util.List;

public class News extends Manager{

    private String headline;
    private List<String> content;
    private Date publicationDate;
    private String topic;
    private List<String> pinned;
    private List<String> comments;
    private List<Researcher> topCitedResearchers;
    private Category category;

    public enum Category {
        
        SCIENCE,
        STUDY,
        SOCIAL
        
    }

    

    public News(String headline, List<String> content, Date publicationDate, String topic,
                List<String> pinned, List<String> comments, List<Researcher> topCitedResearchers, Category category) {
        this.headline = headline;
        this.content = content;
        this.publicationDate = publicationDate;
        this.topic = topic;
        this.pinned = pinned;
        this.comments = comments;
        this.topCitedResearchers = topCitedResearchers;
        this.category = category;
    }

    public void generateTopCitedNews(Category category) {
        if (category == Category.SCIENCE) {
            
            System.out.println("Top Cited News generated for the Science category.");
        } else {
            System.out.println("Top Cited News generation is not supported for this category.");
        }
    }

    public boolean isAnnouncement() {
        
        return false;
    }

    public void generateAnnouncement() {
       
        System.out.println("Announcement generated.");
    }

    public void viewOnlyResearch() {
        
        System.out.println("Viewing only research news.");
    }

    public void prioritizeAsTopCited() {
        
        System.out.println("News prioritized as the 1st place in top cited.");
    }
}
