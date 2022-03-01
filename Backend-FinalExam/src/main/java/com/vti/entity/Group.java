package com.vti.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Entity
@Table(name = "`Group`")
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GroupID", nullable = false)
    private Short id;

    @Column(name = "GroupName", length = 30, nullable = false, unique = true)
    private String name;

    @Column(name = "total_member")
    private Short totalmember;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false, updatable = false)
    private User author;

    @Column(name = "CreateDate", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createDate;

    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date modifiedDate;

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        modifiedDate = modifiedDate;
    }

    public Group(Short id, String name, User author, Date createDate) {
        this.id = id;
        this.name = name;
        this.totalmember = 0;
        this.author = author;
        this.createDate = createDate;
        this.modifiedDate = new Date();
    }

    public Group(String GroupName) {
        this.name =GroupName;
        this.totalmember=0;
        this.modifiedDate = new Date();
    }

    public Group() {
        this.modifiedDate = new Date();
    }

}


