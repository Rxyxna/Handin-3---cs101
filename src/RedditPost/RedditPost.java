package RedditPost;

import java.util.Date;

public class RedditPost {
    private Date date;
    private String author;
    private int upvotes;
    private int downvotes;
    private String title;

    public RedditPost(String author, String title) {
        this.date = new Date();
        this.author = author;
        this.upvotes = 1;
        this.downvotes = 0;
        this.title = title;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RedditPost {" +
                "date=" + date +
                ", author='" + author + '\'' +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                ", title='" + title + '\'' +
                '}';
    }
}
