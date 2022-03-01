package com.vti.dto.filter;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class GroupFilter {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxDate;

    private Short minTotalMember;

    private Short maxTotalMember;



}
