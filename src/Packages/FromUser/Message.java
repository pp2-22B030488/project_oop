package FromUser;

import java.util.Date;

public class Message extends Employee{

    private Integer ID;
    private Date DateOfSend;
    private String Text;
    private User Author;
    private String Category;
    private UrgencyLevel Priority;
    private StatusType Status;
    private UrgencyLevel UrgencyLevel;

    public enum UrgencyLevel {
        LOW,
        MEDIUM,
        HIGH
    }

    public enum StatusType {
        OPEN,
        CLOSED,
        PENDING
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getDateOfSend() {
        return this.DateOfSend;
    }

    public void setDateOfSend(Date DateOfSend) {
        this.DateOfSend = DateOfSend;
    }

    public String getText() {
        return this.Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public User getAuthor() {
        return this.Author;
    }

    public void setAuthor(User Author) {
        this.Author = Author;
    }

    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public UrgencyLevel getPriority() {
        return this.Priority;
    }

    public void setPriority(UrgencyLevel Priority) {
        this.Priority = Priority;
    }

    public StatusType getStatus() {
        return this.Status;
    }

    public void setStatus(StatusType Status) {
        this.Status = Status;
    }

    public UrgencyLevel getUrgencyLevel() {
        return this.UrgencyLevel;
    }

    public void setUrgencyLevel(UrgencyLevel UrgencyLevel) {
        this.UrgencyLevel = UrgencyLevel;
    }

    public double calculateRating() {
        return 0.0;
    }

    public StatusType changeStatus() {
        return null;
    }
}
