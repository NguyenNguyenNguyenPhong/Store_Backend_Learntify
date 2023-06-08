package MAIN.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blogID")
    private int blogID;
    @Column(name = "category")
    private String category;
    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @Column(name = "userID")
    private int userID;

    public Blog() {
    }

    public Blog(int blogID, String category, String name, String content, int userID) {
        this.blogID = blogID;
        this.category = category;
        this.name = name;
        this.content = content;
        this.userID = userID;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogID=" + blogID +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", userID=" + userID +
                '}';
    }
}
