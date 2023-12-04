package com.example.jpa.model;

import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Demo {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String user;
    // public int getSeq(){return this.seq;}
    // public String getUser(){return this.user;}
    // public void setSeq(int seq){this.seq = seq;}
    // public void setUser(String user){this.user = user;}
}