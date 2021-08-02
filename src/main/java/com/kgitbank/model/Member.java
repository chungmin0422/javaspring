package com.kgitbank.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class Member  implements Serializable{
private static final long serialVersionUID = 235082303030405020L;
	
private String id;
private String password;
private String name;
private Integer age;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date birth;

public boolean nullExist() {
	/*
	id       = id.trim();
	password = password.trim();
	name     = name.trim();
	*/
	return id == null       || id.equals("")       ||
		   password == null || password.equals("") ||
		   name == null     || name.equals("")     ||
		   age == null      || age < 0             || 
		   birth == null;
	}
}
