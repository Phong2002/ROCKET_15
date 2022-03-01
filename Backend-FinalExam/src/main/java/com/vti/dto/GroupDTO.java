package com.vti.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class GroupDTO {
    private Short id;
    private String name;
    private Short totalmember;
    private String author;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date createDate;

    public GroupDTO() {
    }

    public GroupDTO(Short id, String name, Short totalmember, String author, Date createDate) {
        this.id = id;
        this.name = name;
        this.totalmember = totalmember;
        this.author = author;
        this.createDate = createDate;
    }

    public Short getId() {
        return id;
    }

}
