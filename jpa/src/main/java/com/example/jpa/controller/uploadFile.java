package com.example.jpa.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class uploadFile {
    @Id
    private int seq;
    private String originalFileName;
    private String uuid;
    private String memberId;
    private String secretFlag;
    private String regDate;
}