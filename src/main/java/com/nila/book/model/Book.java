package com.nila.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "title")
    private String bookTitle;
    @Column(name = "author")
    private String author;
    @Column(name = "published")
    private Long yearOfPublished;
    @Column(name = "created")
    private Long created;
    @Column(name = "updated")
    private Long updated;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Long getYearOfPublished()
    {
        return yearOfPublished;
    }

    public void setYearOfPublished(Long yearOfPublished)
    {
        this.yearOfPublished = yearOfPublished;
    }

    public Long getCreated()
    {
        return created;
    }

    public void setCreated(Long created)
    {
        this.created = created;
    }

    public Long getUpdated()
    {
        return updated;
    }

    public void setUpdated(Long updated)
    {
        this.updated = updated;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("book [id=");
        builder.append(id);
        builder.append(", bookTitle=");
        builder.append(bookTitle);
        builder.append(", author=");
        builder.append(author);
        builder.append(", yearOfPublished=");
        builder.append(yearOfPublished);
        builder.append(", created=");
        builder.append(created);
        builder.append(", updated=");
        builder.append(updated);
        builder.append("]");
        return builder.toString();
    }

}
