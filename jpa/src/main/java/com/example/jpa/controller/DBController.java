package com.example.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpa.model.Demo;
import com.example.jpa.repository.DemoRepository;

@RestController
public class DBController {
    @Autowired
    DemoRepository demoRepository;
    @GetMapping("/")
    public List<Demo> demoSelect(){
        return demoRepository.findAll();
    }

    @GetMapping("/user1")
    public String demoSelect1(){
        String user = demoRepository.findByUser("AAA").getUser();
        return user;
    }

    public Demo demoSelect2(){
        return demoRepository.findByUser("AAA");
    }

    @GetMapping("/user2")
    public List<Demo> demoSelect3(){
        return demoRepository.findBySeq(2);
    }

    @GetMapping("/save")
    public Demo demoInsert(){
        Demo data = new Demo();
        data.setSeq(3);
        data.setUser("CCC");
        demoRepository.save(data);
        return data;
    }

    @GetMapping("/delete")
    public String demoDelete(){
        Demo data = new Demo();
        data.setSeq(3);
        demoRepository.delete(data);
        return data.getSeq() + "번이 잘 지워졌습니다.";
    }
}